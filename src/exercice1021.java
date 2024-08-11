/**
 * @author higor.robinn on 11/08/2024.
 *
 * Leia um valor de ponto flutuante com duas casas decimais. Este valor representa um valor monetário. A seguir, calcule o menor número de notas e moedas possíveis no qual o valor pode ser decomposto. As notas consideradas são de 100, 50, 20, 10, 5, 2. As moedas possíveis são de 1, 0.50, 0.25, 0.10, 0.05 e 0.01. A seguir mostre a relação de notas necessárias.
 *
 * Entrada
 * O arquivo de entrada contém um valor de ponto flutuante N (0 ≤ N ≤ 1000000.00).
 *
 * Saída
 * Imprima a quantidade mínima de notas e moedas necessárias para trocar o valor inicial, conforme exemplo fornecido.
 *
 * Obs: Utilize ponto (.) para separar a parte decimal.
 */

import java.util.Scanner;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class exercice1021 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        double[] valores = {100.0, 50.0, 20.0, 10.0, 5.0, 2.0, 1.0, 0.5, 0.25, 0.1, 0.05, 0.01};
        String[] denominacoes = {"nota(s) de R$ 100.00", "nota(s) de R$ 50.00", "nota(s) de R$ 20.00", "nota(s) de R$ 10.00", "nota(s) de R$ 5.00", "nota(s) de R$ 2.00", "moeda(s) de R$ 1.00", "moeda(s) de R$ 0.50", "moeda(s) de R$ 0.25", "moeda(s) de R$ 0.10", "moeda(s) de R$ 0.05", "moeda(s) de R$ 0.01"};

        BigDecimal valor = scanner.nextBigDecimal().setScale(2, RoundingMode.HALF_EVEN);

        int[] quantidade = new int[valores.length];

        for (int i = 0; i < valores.length; i++) {
            BigDecimal valorAtual = BigDecimal.valueOf(valores[i]);
            quantidade[i] = valor.divideToIntegralValue(valorAtual).intValue();
            valor = valor.subtract(valorAtual.multiply(BigDecimal.valueOf(quantidade[i])));
        }

        System.out.println("NOTAS:");
        for (int i = 0; i <= 5; i++) {
            System.out.println(quantidade[i] + " " + denominacoes[i]);
        }
        System.out.println("MOEDAS:");
        for (int i = 6; i < valores.length; i++) {
            System.out.println(quantidade[i] + " " + denominacoes[i]);
        }
    }
}
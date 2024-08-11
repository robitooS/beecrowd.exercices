/**
 * @author higor.robinn on 11/08/2024.
 *
 * Neste problema, deve-se ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Após, calcule e mostre o valor a ser pago.
 *
 * Entrada
 * O arquivo de entrada contém duas linhas de dados. Em cada linha haverá 3 valores, respectivamente dois inteiros e um valor com 2 casas decimais.
 *
 * Saída
 * A saída deverá ser uma mensagem conforme o exemplo fornecido abaixo, lembrando de deixar um espaço após os dois pontos e um espaço após o "R$". O valor deverá ser apresentado com 2 casas após o ponto.
 */

import java.util.Scanner;

public class exercice1010 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input_1 = scanner.nextLine();
        String input_2 = scanner.nextLine();

        String [] partes_1 = input_1.split("\\s+");
        int codigo_1 = Integer.parseInt(partes_1[0]);
        int numeroDePecas_1 = Integer.parseInt(partes_1[1]);
        double valorUnitario_1 = Double.parseDouble(partes_1[2]);

        String [] partes_2 = input_2.split("\\s+");
        int codigo_2 = Integer.parseInt(partes_2[0]);
        int numeroDePecas_2 = Integer.parseInt(partes_2[1]);
        double valorUnitario_2 = Double.parseDouble(partes_2[2]);

        double total = (valorUnitario_1 * numeroDePecas_1) + (valorUnitario_2 * numeroDePecas_2);
        System.out.printf("VALOR A PAGAR: R$ %.2f\n", total);


    }
}



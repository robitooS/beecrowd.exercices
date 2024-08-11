/**
 * @author higor.robinn on 11/08/2024.
 * Sorteando dois números inteiros A e B entre 1 e N inclusive, qual é a chance de que o número B seja menor ou igual ao resto de N dividido por A?
 *
 * Por exemplo, para N=5, há 25 escolhas possíveis para (A,B), porém os únicos pares que satisfazem o enunciado são (2,1), (3,1), (3,2) e (4,1). Portanto para N=5, a probabilidade é igual a 4/25.
 *
 * Entrada
 * A entrada é composta por vários casos de teste. Cada caso de teste é composto por uma linha conténdo um inteiro N (1 ≤ N ≤ 108).
 *
 * Saída
 * Para cada teste, a saída é composta por uma linha contendo a fração irredutível que responde o enunciado.
 *
 * OBS --> RESOLUÇÃO NÃO FOI ACEITA PELO SITE, ULTRAPASSOU O TEMPO LIMITE
 * A lógica está correta aparentemente, porém para números muitos grande, há muito processamento e acaba demorando mais que o
 * permitido pelo site, caso consiga otimizar a resolução e conseguir ser aprovada pelo site, favor, me chame no insta
 * para me passar a resolução --> @higor.robinn <---
 */
import java.util.Scanner;


public class exercice1563 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            long contador = 0;
            int N = scanner.nextInt();
            long paresTotais = (long) N * N;

            if (N >= 530000000) {
                for (int i = 1; i <= 530000000; i++) {
                    contador += N % i;
                }
                for (int i = 530000001; i <= N; i++) {
                    contador += N % i;
                }
            } else {
                for (int i = 1; i <= N; i++) {
                    contador += N % i;

                }
            }

            long gcd = calcularMDC(contador, paresTotais);
            contador /= gcd;
            paresTotais /= gcd;

            System.out.println(contador + "/" + paresTotais);
        }
    }

    public static long calcularMDC(long a, long b) {
        if (b == 0) {
            return a;
        } else {
            return calcularMDC(b, a % b);
        }
    }
}


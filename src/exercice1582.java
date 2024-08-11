/**
 * @author higor.robinn on 11/08/2024.
 *
 * Entrada
 * Cada linha da entrada é formada por 3 inteiros, x, y e z (1 ≤ x, y, z ≤ 104), separados entre si por um espaço em branco e fornecidos não necessariamente em ordem alguma, terminando em EOF.
 *
 * Saída
 * Imprima para cada linha da entrada a linha “tripla pitagorica primitiva” (sem as aspas) se os inteiros dados formam uma tripla pitagórica primitiva, “tripla pitagorica” se os inteiros dados formam uma tripla pitagórica não-primitiva, ou “tripla” se não formam uma tripla pitagórica.
 */

import java.util.Arrays;
import java.util.Scanner;

public class exercice1582 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = 0, b = 0, c = 0;

        while (scanner.hasNext()) {
            String inputInString = scanner.nextLine();
            String[] inputArrayInString = inputInString.split("\\s+");
            int[] inputInNumber = new int[inputArrayInString.length];

            for (int i = 0; i < inputInNumber.length; i++) {
                inputInNumber[i] = Integer.parseInt(inputArrayInString[i]);
            }
            Arrays.sort(inputInNumber); // Ordenar array de forma crescente

            if (inputInNumber.length >= 3) { // Atribuir a "A" o menor numero e a "C" o maior numero (Sendo a hipotenusa)
                a = inputInNumber[0];
                b = inputInNumber[1];
                c = inputInNumber[2];
            }

            // Verificar se é uma tripla pitagórica (considerando precisão)
            if (Math.pow(c, 2) == Math.pow(a, 2) + Math.pow(b, 2)) {
                // Calcular o MDC de a e b
                int calcMDC_A_B = calcMDC(a, b);

                // Calcular o MDC do resultado anterior com c
                int calcMDC_AB_C = calcMDC(calcMDC_A_B, c);

                // Verificar se o MDC é igual a 1 para ser uma tripla pitagórica primitiva
                if (calcMDC_AB_C == 1) {
                    System.out.println("tripla pitagorica primitiva");
                } else {
                    System.out.println("tripla pitagorica");
                }
            } else {
                System.out.println("tripla");
            }
        }
    }

    // Calcular o MDC de dois números usando o algoritmo de Euclides
    public static int calcMDC(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}


/**
 * @author higor.robinn on 11/08/2024.
 *
 * Leia quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).
 *
 * Entrada
 * O arquivo de entrada contém 4 valores inteiros.
 *
 * Saída
 * Imprima a mensagem DIFERENCA com todas as letras maiúsculas, conforme exemplo abaixo, com um espaço em branco antes e depois da igualdade.
 */

import java.util.Scanner;

public class exercice1007 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int INPUT_A = scanner.nextInt();
        int INPUT_B = scanner.nextInt();
        int INPUT_C = scanner.nextInt();
        int INPUT_D = scanner.nextInt();

        int DIF = (INPUT_A * INPUT_B) - (INPUT_C * INPUT_D);

        System.out.printf("DIFERENCA = %d\n", DIF);

    }

}


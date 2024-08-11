/**
 * @author higor.robinn on 11/08/2024.
 *
 * Leia dois valores inteiros. A seguir, calcule o produto entre estes dois valores e atribua esta operação à variável PROD. A seguir mostre a variável PROD com mensagem correspondente.
 *
 * Entrada
 * O arquivo de entrada contém 2 valores inteiros.
 *
 * Saída
 * Imprima a mensagem "PROD" e a variável PROD conforme exemplo abaixo, com um espaço em branco antes e depois da igualdade. Não esqueça de imprimir o fim de linha após o produto, caso contrário seu programa apresentará a mensagem: “Presentation Error”.
 */

import java.util.Scanner;

public class exercice1004 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int INPUT_A = scanner.nextInt();
        int INPUT_B = scanner.nextInt();

        int PROD = INPUT_A * INPUT_B;
        System.out.printf("PROD = %d\n", PROD);

    }
}


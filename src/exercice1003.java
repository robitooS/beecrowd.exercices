/**
 * @author higor.robinn on 11/08/2024.
 *
 * Soma básica
 */

import java.util.Scanner;

public class exercice1003 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input_A = scanner.nextInt();
        scanner.nextLine(); // Limpa o buffer
        int input_B = scanner.nextInt();
        scanner.nextLine(); // Limpa o buffer

        int output = input_A + input_B;
        System.out.printf("SOMA = %d\n", output);;


    }
}

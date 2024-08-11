/**
 * @author higor.robinn on 11/08/2024.
 *
 * ---> https://judge.beecrowd.com/pt/problems/view/1013
 */

import java.util.Scanner;

public class exercice1013 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String [] partes = input.split("\\s+");

        int A = Integer.parseInt(partes[0]);
        int B = Integer.parseInt(partes[1]);
        int C = Integer.parseInt(partes[2]);

        int maior = Math.max(C, Math.max(A,B));
        System.out.printf("%d eh o maior\n", maior);

    }
}


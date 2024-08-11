/**
 * @author higor.robinn on 11/08/2024.
 *
 * ---> https://judge.beecrowd.com/pt/problems/view/1014
 */
import java.util.Scanner;

public class exercice1014 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int kilometragem = scanner.nextInt();
        double litros = scanner.nextDouble();

        System.out.printf("%.3f km/l\n", (kilometragem/litros));

    }
}



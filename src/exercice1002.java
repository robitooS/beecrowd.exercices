/**
 * @author higor.robinn on 11/08/2024.
 * Calcular área do circulo
 */

import java.util.Scanner;

public class exercice1002 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double RAIO = scanner.nextDouble();

        double area = ((RAIO * RAIO) * 3.14159);
        System.out.printf("A=%.4f\n", area);



    }
}

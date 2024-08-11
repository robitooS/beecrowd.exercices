/**
 * @author higor.robinn on 11/08/2024.
 *
 * ---> https://judge.beecrowd.com/pt/problems/view/1015
 */

import java.util.Scanner;

public class exercice1015 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String x1_y1 = scanner.nextLine();
        String x2_y2 = scanner.nextLine();

        String [] x1_y1_array = x1_y1.split("\\s+");
        String [] x2_y2_array = x2_y2.split("\\s+");

        Double x1 = Double.parseDouble(x1_y1_array[0]);
        Double y1 = Double.parseDouble(x1_y1_array[1]);
        Double x2 = Double.parseDouble(x2_y2_array[0]);
        Double y2 = Double.parseDouble(x2_y2_array[1]);

        Double distancia = Math.sqrt(Math.pow((x1-x2), 2) + Math.pow((y1-y2), 2));
        System.out.printf("%.4f\n", distancia);

    }
}



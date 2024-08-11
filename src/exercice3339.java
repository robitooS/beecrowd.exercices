/**
 * @author higor.robinn on 11/08/2024.
 *
 * A professora Carina costuma lecionar as aulas de Matemática Discreta para o curso de Ciência da Computação. Durante as aulas online, ela suspeitou que seus alunos não estavam prestando atenção e resolveu fazer um prova/competição no kahoot.
 *
 * Como a aula do dia era sobre quadrados perfeitos, em cada questão da prova/competição ela daria um intervalo [L, R] (limites inclusos) e gostaria de saber quantos quadrados perfeitos existem dentro do intervalo dado.
 *
 * Só pra relembrar, um quadrado perfeito é um número com raiz quadrada inteira. Ex: 0, 1, 4 e 9.
 *
 * Entrada
 * Na primeira linha é passado um inteiro Q representando o número de questões da prova/competição. Nas próximas Q linhas haverão dois inteiros L, R em cada linha representando os limites.
 *
 * As restrições para os valores são as seguintes:
 *
 * 1≤Q≤10^3
 * 0≤L≤R≤10^8
 * Saída
 * Para cada questão é preciso imprimir um inteiro representando o número de quadrados perfeitos dentro do intervalo [L, R] (limites inclusos).
 */


import java.util.Scanner;

public class exercice3339 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long input = scanner.nextLong();
        scanner.nextLine();
        if (input < 1 || input > 1000) {
            System.exit(0);
        }
        else {
            int i = 0;
            while (i < input) {
                String LIMITS = scanner.nextLine();
                String [] parts = LIMITS.split(" ");

                i++;
                long L_LIMIT = Long.parseLong(parts[0]);
                long R_LIMIT = Long.parseLong(parts[1]);

                if (L_LIMIT == 0) {
                    int result = (int) Math.sqrt(R_LIMIT) + 1;
                    System.out.println(result);

                } else if (L_LIMIT != Math.pow((int) Math.sqrt(L_LIMIT), 2)) {
                    int result = (int) Math.sqrt(R_LIMIT) - (int) Math.sqrt(L_LIMIT);
                    System.out.println(result);

                } else {
                    int result = ((int) Math.sqrt(R_LIMIT) - (int) Math.sqrt(L_LIMIT)) + 1;
                    System.out.println(result);
                }

            }
        }
    }
}


/**
 * @author higor.robinn on 11/08/2024.
 *
 * Faça um programa que leia o nome de um vendedor, o seu salário fixo e o total de vendas efetuadas por ele no mês (em dinheiro). Sabendo que este vendedor ganha 15% de comissão sobre suas vendas efetuadas, informar o total a receber no final do mês, com duas casas decimais.
 *
 * Entrada
 * O arquivo de entrada contém um texto (primeiro nome do vendedor) e 2 valores de dupla precisão (double) com duas casas decimais, representando o salário fixo do vendedor e montante total das vendas efetuadas por este vendedor, respectivamente.
 *
 * Saída
 * Imprima o total que o funcionário deverá receber, conforme exemplo fornecido.
 */

import java.util.Scanner;

public class exercice1009 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String employee = scanner.nextLine();
        double fixedSalary = scanner.nextDouble();
        double sales = scanner.nextDouble();
        double salary = fixedSalary + (sales * 0.15);

        System.out.printf("TOTAL = R$ %.2f\n", salary);



    }
}


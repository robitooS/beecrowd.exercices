/**
 * @author higor.robinn on 11/08/2024.
 *
 * Você já ouviu a expressão “A base de todo sistema normal de numeração é 10”? É claro, eu não estou falando de sistemas tais como o sistema de numeração "Stern Brockot". Este problema não tem nada a ver com este fato mas pode ter algumas similaridades.
 *
 * Você tem um número R com base N e a garantia de que R é divisível por (N-1). Você deve então imprimir o menor valor possível para N. Os dígitos para um número com base 62 seriam (0..9, A..Z e a..z). Similarmente, os símbolos dos dígitos para um número com base 61 seriam (0..9, A..Z e a..y) e assim por diante. Você terá que determinar qual é a menor base possível daquele número para as condições dadas. Nenhum número inválido será dado como entrada.
 *
 * Entrada
 * Cada linha da entrada deverá conter um número inteiro N de qualquer base inteira (de 2 a 62) com até 1024 dígitos (como definido na matemática). Você terá que determinar qual é a menor base possível daquele número para as condições dadas. Nenhum número inválido será dado como entrada.
 *
 * Saída
 * Se o número com as condições dadas não for possível, imprima a linha “such number is impossible!”. Para cada linha de entrada deverá haver apenas uma linha de saída. A saída deverá ser apresentada sempre na base de numeração decimal.
 */

import java.util.Scanner;
import java.math.BigInteger;


public class exercice1264 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {

            if (scanner.hasNextLine()) {
                String input = scanner.nextLine().trim();

                if (input.equalsIgnoreCase("exit")) {
                    break;
                }

                BigInteger base = getMinimumBase(input);
                BigInteger numeratorInDecimal = convertTheNumeratorToDecimalBase(input, base);

                BigInteger maxBase = new BigInteger("62");
                boolean foundBase = false;

                while (base.compareTo(maxBase) <= 0) {
                    BigInteger denominator = base.subtract(BigInteger.ONE);

                    if (denominator.compareTo(BigInteger.ZERO) > 0 && numeratorInDecimal.mod(denominator).equals(BigInteger.ZERO)) {
                        System.out.println(base);
                        foundBase = true;
                        break;
                    }

                    base = base.add(BigInteger.ONE);
                    numeratorInDecimal = convertTheNumeratorToDecimalBase(input, base);
                }

                if (!foundBase) {
                    System.out.println("such number is impossible!");
                }
            } else {
                break;
            }
        }

        scanner.close();
    }

    public static BigInteger getMinimumBase(String number) {
        BigInteger digitValue = BigInteger.ZERO;
        BigInteger maxValue = BigInteger.ZERO;

        for (char digit : number.toCharArray()) {
            if (Character.isDigit(digit)) {
                digitValue = BigInteger.valueOf(Character.getNumericValue(digit));
            } else if (Character.isLetter(digit)) {
                if (Character.isUpperCase(digit)) {
                    digitValue = BigInteger.valueOf(digit - 'A' + 10);
                } else {
                    digitValue = BigInteger.valueOf(digit - 'a' + 36);
                }
            }
            maxValue = maxValue.max(digitValue);
        }
        return maxValue.add(BigInteger.ONE);
    }

    public static BigInteger convertTheNumeratorToDecimalBase(String number, BigInteger base) {
        BigInteger exponent = BigInteger.ZERO;
        BigInteger result = BigInteger.ZERO;

        for (int i = number.length() - 1; i >= 0; i--) {
            char digit = number.charAt(i);

            BigInteger digitValue = BigInteger.ZERO;
            if (Character.isDigit(digit)) {
                digitValue = BigInteger.valueOf(Character.getNumericValue(digit));
            } else if (Character.isUpperCase(digit)) {
                digitValue = BigInteger.valueOf(digit - 'A' + 10);
            } else if (Character.isLowerCase(digit)) {
                digitValue = BigInteger.valueOf(digit - 'a' + 36);
            }

            result = result.add(digitValue.multiply(base.pow(exponent.intValue())));
            exponent = exponent.add(BigInteger.ONE);
        }

        return result;
    }
}

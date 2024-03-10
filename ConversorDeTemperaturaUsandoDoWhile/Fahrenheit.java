package ConversorDeTemperaturaUsandoDoWhile;

import java.util.Locale;
import java.util.Scanner;

public class Fahrenheit {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner in = new Scanner(System.in);
        char resp;

        do {
            System.out.print("Digite a temperatura em Celcius: ");
            double c = in.nextDouble();
            double f = 9 * c / 5 + 32;
            System.out.printf("Equivalente em Fehrenhnheit: %.1f%n", f);
            System.out.print("Deseja repetir (s/n)?");
            resp = in.next().charAt(0);
        } while (resp != 'n');

        in.close();
    }
}

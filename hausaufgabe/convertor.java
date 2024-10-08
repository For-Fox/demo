package hausaufgabe;

import java.util.Scanner;

public class convertor {
    public static double EuroToDollar(double euros, double change) {
        return euros * change;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Führte die Summe in Euro ein: ");
        double euros = scanner.nextDouble();

        System.out.print("Führte die Kurs ein: ");
        double change = scanner.nextDouble();

        double dollars = EuroToDollar(euros, change);

        System.out.printf("Die Summe ist: %f", dollars);
    }
}

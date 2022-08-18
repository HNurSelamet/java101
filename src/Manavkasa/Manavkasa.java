package Manavkasa;

import java.util.Scanner;

public class Manavkasa {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Armut kaç kilo? : ");
        double armut = inp.nextDouble();

        System.out.print("Elma kaç kilo? : ");
        double elma = inp.nextDouble();

        System.out.print("Domates kaç kilo? : ");
        double domates = inp.nextDouble();

        System.out.print("Muz kaç kilo? :");
        double muz = inp.nextDouble();

        System.out.print("Patlıcan kaç kilo? : ");
        double patlican = inp.nextDouble();

        double toplam = (armut + elma + domates + muz + patlican);
        System.out.print("Toplam tutar: " + toplam);
    }
}

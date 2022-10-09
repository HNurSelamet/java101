package BurcProgram;

import java.util.Scanner;

public class BurcBulmaodev {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int month, day;

        System.out.print("Dogdugunuz gün : ");
        day = inp.nextInt();

        System.out.print("Dogdunuz ay : ");
        month = inp.nextInt();
        if (month >= 1 && month <= 12 && day >= 1 && day <= 31) {
            if ((month == 1 && day < 22) || (month == 12 && day > 21)) {
                System.out.println("Burcunuz Oglak. ");
            } else if ((month == 1 && day >= 22) || (month == 2 && day < 20)) {
                System.out.println("Burcunuz kova. ");
            } else if ((month == 2 && day >= 20) || (month == 3 && day < 21)) {
                System.out.println("Burcunuz balik . ");
            } else if ((month == 3 && day >= 21) || (month == 4 && day < 21)) {
                System.out.println("Burcunuz koç . ");
            } else if ((month == 4 && day >= 21) || (month == 5 && day < 22)) {
                System.out.println("Burcunuz boga . ");
            } else if ((month == 5 && day >= 22) || (month == 6 && day < 23)) {
                System.out.println("Burcunuz ikizler. ");
            } else if ((month == 6 && day >= 23) || (month == 7 && day < 23)) {
                System.out.println("Burcunuz yengec . ");
            } else if ((month == 7 && day >= 23) || (month == 8 && day < 23)) {
                System.out.println("Burcunuz aslan. ");
            } else if ((month == 8 && day >= 23) || (month == 9 && day < 23)) {
                System.out.println("Burcunuz basak . ");
            } else if ((month == 9 && day >= 23) || (month == 10 && day < 23)) {
                System.out.println("Burcunuz terazi . ");
            } else if ((month == 10 && day >= 23) || (month == 11 && day < 22)) {
                System.out.println("Burcunuz akrep. ");
            } else if ((month == 11 && day >= 22) || (month == 12 && day < 22)) {
                System.out.println("Burcunuz yay. ");
            }else {
                System.out.println("Geçerli tarih bulunamadı. Gçerli gün aralığını giriniz. ");
            }
        }System.out.println("Geçerli tarih bulunamadı. Gçerli gün aralığını giriniz. ");
    }
}

package Dongu;

import java.util.Scanner;

public class odev13 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Basamak sayısını giriniz : ");
        int satirSayisi = inp.nextInt();
        for (int i = satirSayisi; i > 0; i--) {
            for (int j = 0; j < satirSayisi - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
/*
 for (int i = bas - 1; i >= 0; i--) { //bi tane basamak bastırmak icin
            for (int j = 0; j < (bas - i); j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < ( ); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
 */


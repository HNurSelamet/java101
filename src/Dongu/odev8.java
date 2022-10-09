package Dongu;

import java.util.Scanner;

public class odev8 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Satır sayısı giriniz: ");
        int a = inp.nextInt();
        for (int i = 1; i <= a; i++) {
            for (int j = 0; j < (a - i); j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println(" ");
            for (int l = 0; l < a + i; l++) {
            }
        }
        for (int i = a - 1; i >= 0; i--) {
            for (int j = 0; j < (a - i); j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println(" ");
            for (int l = 0; l < a + i; l++) {
            }
        }
    }
}






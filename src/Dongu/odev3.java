package Dongu;

import java.util.Scanner;

public class odev3 {
    public static void main(String[] args) {
        int n;
        Scanner inp = new Scanner(System.in);
        System.out.print("Sınır aralığı için sayıyı giriniz : ");
        n = inp.nextInt();
        System.out.print("4'ün katı olan sayılar: ");
        for (int i = 1; i <= n; i *= 4) {
            System.out.print(i + " , ");
        }
        System.out.println();
        System.out.print("5'in katı olan sayılar: ");
        for (int i = 1; i <= n; i *= 5) {
            System.out.print(i + " , ");
        }
    }
}

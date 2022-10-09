package Dongu;

import java.util.Scanner;

public class ODEV12 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n;
        int toplam = 0;
        System.out.print("Sayı giriniz : ");
        n = inp.nextInt();
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                toplam += i;

                }

            }if (toplam == n) {
            System.out.println("n mükemmel sayıdır.");}else System.out.println("mükemmel sayı değil.");
        }
    }



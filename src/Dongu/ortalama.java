package Dongu;

import java.util.Scanner;

public class ortalama {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int k = 0, adet = 0, toplam = 0;
        double ortalama;
        System.out.print("Sayı giriniz. ");
        k = inp.nextInt();

        for (int i = 1; i <= k; i++) {
            if ((i % 3 == 0) && (i % 4 == 0)) {
                System.out.println(i);
                toplam += i;
                adet++;
            }
        }
        ortalama = toplam / adet;
        System.out.print("Ortalamanız: " + ortalama);
    }
}

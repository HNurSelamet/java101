package Dongu;

import java.util.Scanner;

public class odev4 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n, r, nr;
        System.out.print("Kombinasyon n değerini giriniz : ");
        n = inp.nextInt();

        int total = 1;
        int total2 = 1;
        int total3 = 1;

        for (int i = 1; i <= n; i++) {
            total = total * i;
        }
        System.out.println("n faktoriyel sonuç: " + total);

        System.out.print("Kombinasyon r değerini giriniz : ");
        r = inp.nextInt();

        for (int j = 1; j <= r; j++) {
            total2 = total2 * j;
        }
        System.out.println("r faktoriyel sonuc: " + total2);

        nr = n - r;
        for (int k = 1; k <= nr; k++) {
            total3 = total3 * k;
        }
        System.out.println("Kombinasyon formulu sonucu: ");
        double sonuc = total / (total2 * total3);
        System.out.println(sonuc);
    }
}

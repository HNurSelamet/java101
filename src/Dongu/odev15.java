package Dongu;

import java.util.Scanner;

public class odev15 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n;
        int ilkSayi = 0;
        int ikinciSayi = 1;
        System.out.println("döngü sayısını giriniz.");
        n = inp.nextInt();
        for (int i = 0; i < n; i++) {
            int toplam = ilkSayi + ikinciSayi;
            System.out.print(toplam + ",");
            ilkSayi = ikinciSayi;
            ikinciSayi = toplam;
        }
    }
}

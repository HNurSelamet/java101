package Hesapmak;

import java.util.Scanner;

public class Hesapmakine {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("İlk sayıyı giriniz : ");
        int n1 = inp.nextInt();

        System.out.print("İkinci sayıyı giriniz :");
        int n2 = inp.nextInt();

        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        System.out.print("İşlemi seçiniz : ");
        int sonuc = inp.nextInt();

        switch (sonuc) {
            case (1):
                System.out.print("Toplama işlemi sonucu : " + (n1 + n2));
                break;
            case (2):
                System.out.print("Çıkarma işlemi sonucu : " + (n1 - n2));
                break;
            case (3):
                System.out.print("Çarpma işlemi sonucu : " + (n1 * n2));
                break;
            case (4):
                if (n2 != 0) {
                    System.out.print("Bölme işlemi sonucu : " + (n1 / n2));
                } else {
                    System.out.print("Bir sayı 0'a bölünemez! ");
                }
                break;
            default:
                System.out.print("Yapılan işlem geçersiz. Tekrar deneyiniz.");
        }

    }
}

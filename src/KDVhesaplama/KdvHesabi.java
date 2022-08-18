package KDVhesaplama;

import java.util.Scanner;

public class KdvHesabi {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("KDV'siz fiyatı giriniz : ");
        int fiyat = inp.nextInt();

        double kdv = fiyat <= 1000 ? 0.18 : 0.08;
        double kdvtutari = fiyat * kdv;
        double kdvlifiyat = fiyat + kdvtutari;
        System.out.println(kdvlifiyat);


    }
}

package Bilet;

import java.util.Scanner;

public class UcakBilet {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int km, age, yoltip;

        System.out.print("Gidilecek mesafeyi giriniz : ");
        km = inp.nextInt();

        System.out.print("Yaşınızı giriniz : ");
        age = inp.nextInt();

        System.out.println("Yolculuk tipini giriniz.\nTek yön gidiş için:1\nGidiş dönüş için :2");
        yoltip = inp.nextInt();
        double indirimsizfiyat = km * 0.10;

        if (km >= 1 && age >= 1 && (yoltip == 1 || yoltip == 2)) {
            if ((age > 24 && age < 65) && yoltip == 1) {
                System.out.println("indirimsiz fiyat : " + indirimsizfiyat);
                if (yoltip == 2) {
                    double indirimsizgidisdonus = indirimsizfiyat - (indirimsizfiyat * 0.20);
                    System.out.println("indirimsiz gidis dönüs fiyatı : " + indirimsizgidisdonus);
                }
            }
            if (age < 12) {
                double indrimlifiyat = (indirimsizfiyat) - (indirimsizfiyat * 0.50);
                if (yoltip == 1) {
                    System.out.println("indirimli fiyat : " + indrimlifiyat);
                } else {
                    double gidisdonusindirimli = indrimlifiyat - (indrimlifiyat * 0.20);
                    System.out.println("gidiş dönüş indirimli fiyat : " + gidisdonusindirimli * 2);
                }
            }
            if (age >= 12 && age < 24) {
                double indirimli2firsat = (indirimsizfiyat) - (indirimsizfiyat * 0.10);
                if (yoltip == 1) {
                    System.out.println("indirimli2fiyat: " + indirimli2firsat);
                } else {
                    double gidisdonusind2 = indirimli2firsat - (indirimli2firsat * 0.20);
                    System.out.println("gidiş dönüş indirimli 2 fiyat :" + gidisdonusind2 * 2);
                }
            }
            if (age >= 65) {
                double indirimli3firsat = (indirimsizfiyat) - (indirimsizfiyat * 0.30);
                if (yoltip == 1) {
                    System.out.println("indirimli3fiyat: " + indirimli3firsat);
                } else {
                    double gidisdonus3ind = indirimli3firsat - (indirimli3firsat * 0.20);
                    System.out.println("gidiş dönüş indirimli 3 fiyat :" + gidisdonus3ind * 2);
                }
            }
        } else
            System.out.println("Hatalı giriş yaptınız!");
    }
}


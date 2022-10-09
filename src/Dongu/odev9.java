package Dongu;

import java.util.Scanner;

public class odev9 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String username, password;
        int right = 3;
        int balance = 1500;
        int select;
        int price;

        while (right > 0) {
            System.out.print("Kullanıcı adını giriniz : ");
            username = inp.nextLine();
            System.out.print("Şifrenizi giriniz : ");
            password = inp.nextLine();
            if (username.equals("patika") && password.equals("dev123")) {
                System.out.println("Sisteme doğru giriş yaptnız. x bankasına hoşgeldiniz. ");

                do {
                    System.out.println("Lütfen yapmak istediğiniz işlemi seçiniz : ");
                    System.out.println("1-Para yatırma\n2-Para çekme\n3-Bakiye sorgulama\n4-Çıkış yap");
                    select = inp.nextInt();
                    switch (select) {
                        case 1:
                            System.out.print("yatırılıcak para miktarını giriniz: ");
                            price = inp.nextInt();
                            balance += price;
                            System.out.println("toplam bakiye : " + balance);
                            break;
                        case 2:
                            System.out.print("Çekilecek para miktarını giriniz: ");
                            price = inp.nextInt();
                            if (price > balance) {
                                System.out.println("Yeterli bakiye yok. ");
                            } else {
                                balance -= price;
                                System.out.println("toplam bakiye : " + balance);
                            }
                            break;
                        case 3:
                            System.out.println("Bakiyeniz : " + balance);
                    }
                } while (select != 4);
                {
                    System.out.println("Tekrar görüşmek üzere. ");
                    break;
                }

            } else {
                System.out.println("Hatalı kullanıcı veya şifre girdiniz.Tekrar deneyiniz.");
                System.out.println("Kalan hakkınız:" + --right);
            }

        }
    }
}

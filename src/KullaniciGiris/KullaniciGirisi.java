package KullaniciGiris;

import java.util.Scanner;

public class KullaniciGirisi {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String username, password, passwordReset, newpassword;

        System.out.print("Kullanıcı adını giriniz : ");
        username = inp.nextLine();

        System.out.print("Şifrenizi giriniz : ");
        password = inp.nextLine();

        if (username.equals("patika") && password.equals("java123")) {
            System.out.println("Giriş yaptınız");
        } else {
            System.out.print("You entered an incorrect password.\nIf you want to specify a new password,select \"no\" or \"yes\" :");
            passwordReset = inp.nextLine();
            if (passwordReset.equals("no")) {
                System.out.println("tekrar dene");
            } else if (passwordReset.equals("yes")) {
                System.out.print("Yeni parolayı girin :");
                newpassword = inp.nextLine();
                if (newpassword.equals("java123") || newpassword.equals(password)) {
                    System.out.println("Geçersiz.Tekrar Deneyiniz.");
                } else {
                    System.out.println("Şifre başarıyla güncellendi. ");
                }
            }
        }

    }
}


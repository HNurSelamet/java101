package method;

import java.util.Scanner;

public class odev3m {

    static int sum(int a, int b) {
        int result = a + b;
        System.out.println("toplam: " + result);
        return result;
    }

    static int minus(int a, int b) {
        int result = a - b;
        System.out.println("çıkarma: " + result);
        return result;
    }

    static int carpma(int a, int b) {
        int result = a * b;
        System.out.println("çarpma" + result);
        return result;
    }

    static int bolme(int a, int b) {
        int result = a / b;
        System.out.println("bölme: " + result);
        return result;
    }

    static int uslu(int a, int b) {
        int result = 1;
        for (int i = 1; i <= b; i++) {
            result = result * a;
        }
        System.out.println("üslü ifade: " + result);
        return result;
    }

    static int mod(int a, int b) {
        int result = a % b;
        System.out.println("a mod b : " + result);
        return result;
    }

    static void calc(int a, int b) {
        System.out.println("dikdötgen çevresi: " + 2 * (a + b));
        System.out.println("dikdötgen alanı : " + a * b);
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int select;
        String menu = "1-toplama\n" +
                "2-Çıkarma işlemi\n" +
                "3-Çarpma işlemi\n" +
                "4-Bölme işlemi\n" +
                "5-Üslü sayı hesaplama\n" +
                "6-Mod alma\n" +
                "7-Dikdörtgen alan ve çevre hesabı\n" +
                "0-Cıkıs yapiniz.\n ";
        while (true) {
            System.out.println(menu);
            System.out.print("Bir islem seciniz : ");
            select = inp.nextInt();
            if (select == 0) {
                break;
            }
            System.out.print("ilk sayıyı giriniz : ");
            int a = inp.nextInt();
            System.out.print("ikinci sayıyı giriniz : ");
            int b = inp.nextInt();
            switch (select) {
                case 1:
                    sum(a, b);
                    break;
                case 2:
                    minus(a, b);
                    break;
                case 3:
                    carpma(a, b);
                    break;
                case 4:
                    bolme(a, b);
                    break;
                case 5:
                    uslu(a, b);
                    break;
                case 6:
                    mod(a, b);
                    break;
                case 7:
                    calc(a, b);
                    break;
            }

        }
        System.out.println("güle güle");

    }
}




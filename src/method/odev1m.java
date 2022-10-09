package method;

import java.util.Scanner;

public class odev1m {

    static boolean isPolidrom(int number) {
        int temp = number, yenisayi = 0, lastnumber;
        while (temp != 0) {
            System.out.println("===============");
            System.out.println("sayı : " + temp);
            lastnumber = temp % 10;
            System.out.println("son rakam:" + lastnumber);
            yenisayi = (yenisayi * 10) + lastnumber;
            System.out.println("yeni sayi: " + yenisayi);
            temp /= 10;
        }
        if (yenisayi == number) {
            return true;
        }else return false;
    }

        public static void main (String[]args){
            isPolidrom(2435);

        }
    }

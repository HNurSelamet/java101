package Dongu;

import java.util.Scanner;

public class odev6 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Sayı giriniz : ");
        int number = inp.nextInt();
        int tempNumber = number;
        int basnumer = 0;

        while (tempNumber != 0) {
            tempNumber /= 10;
            basnumer++;
        }
        System.out.println("Basamak numaranız : "+ basnumer);

    }
}

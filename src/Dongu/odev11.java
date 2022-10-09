package Dongu;

import java.util.Scanner;

public class odev11 {
    public static void main(String[] args) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Kac sayi girilecek");
        int girilecekSayiAdedi = keyboard.nextInt();
        for (int i = 0; i < girilecekSayiAdedi; i++) {
            System.out.println(i + ". sayiyi gir: ");
            int inputSayi = keyboard.nextInt();
            if (inputSayi < min) {
                min = inputSayi;
            }
            if (inputSayi > max) {
                max = inputSayi;
            }
        }
        System.out.println("Min: " + min);
        System.out.println("Max: " + max);
    }
}

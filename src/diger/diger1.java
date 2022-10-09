package diger;

import Boks.Match;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class diger1 {
    public static void main(String[] args) {
        Random rand = new Random();
        int number = rand.nextInt(100);
        //int number = (int) (Math.random() * 100);
        System.out.println(number);
        Scanner inp = new Scanner(System.in);

        int right = 0;
        int selected;
        int[] wrong = new int[5];
        boolean isWin = false;

        while (right < 5) {
            System.out.print("Lütfen tahmininizi giriniz: ");
            selected = inp.nextInt();
            if (selected < 0 || selected > 99) {
                System.out.println("Lütfen 0-100 arasında bir sayı giriniz. ");
                continue;
            }
            if (selected == number) {
                isWin = true;
                System.out.println("Tebrikler doğru tahmin ! Tahmin ettiğiniz sayı : " + number);
                break;
            } else {
                wrong[right] = selected;
                right++;
                System.out.println("Hatalı sayı girdiniz.");
                if (selected > number) {
                    System.out.println("Daha küçük bir sayı giriniz.");
                } else {
                    System.out.println("Daha büyük bir sayı giriniz.");
                }
                System.out.println("Kalan hakkınız: " + (5 - right));
            }

            }
        if (!isWin) {
            System.out.println("Kaybettiniz! ");
            System.out.println("Tahminleriniz: "+ Arrays.toString(wrong));
        }

    }
}

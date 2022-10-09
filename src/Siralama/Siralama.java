package Siralama;

import java.util.Scanner;


public class Siralama {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int a, b, c;
        System.out.print("a sayisini giriniz :");
        a = inp.nextInt();

        System.out.print("b sayisini giriniz : ");
        b = inp.nextInt();

        System.out.print("c sayisini giriniz : ");
        c = inp.nextInt();
        System.out.print("Küçükten büyüğe sıralamanız: ");

        if ((a < b) && (a < c)) {
            if (b < c) {
                System.out.println("a<b<c");
            } else {
                System.out.println("a<c<b");
            }
        }
        if ((b < a) && (b < c)) {
            if (a < c) {
                System.out.println("b < a < c");
            } else {
                System.out.println("b < c < a");
            }
        }
        if ((c < a) && (c < b)) {
            if (a < b) {
                System.out.println("c < a < b");
            } else {
                System.out.println("c < b < a");
            }
        }
    }
}

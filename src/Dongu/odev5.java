package Dongu;

import java.util.Scanner;

public class odev5 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n, r;
        int total =1;

        System.out.print("n değerini giriniz:");
        n = inp.nextInt();
        System.out.print("r değerini giriniz : ");
        r = inp.nextInt();
        for (int i = 1; i <=r; i++) {
            total=total*n;
        }
        System.out.print("sonuc : "+total);
    }
}

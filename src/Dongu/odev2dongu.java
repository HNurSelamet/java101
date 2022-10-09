package Dongu;

import java.util.Scanner;

public class odev2dongu {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int k = 0, toplam = 0;
        do {
            System.out.print("Bir sayi giriniz : ");
            k = inp.nextInt();
            if (k % 4 == 0)  {
                toplam += k;
            }
        } while (k % 2 == 0);
        System.out.print("4'un katı olan sayilarin toplami : "+toplam);
    }
}

package Dongu;

import java.util.Scanner;

public class odev10 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("N1 sayısını giriniz : ");
        int n1 = inp.nextInt();
        System.out.print("N2 sayısını giriniz : ");
        int n2 = inp.nextInt();
        int ebob = 1;

        for (int i = n1; i >= 1; i--) {
            if ((n1 % i == 0) && (n2 % i == 0)) {
                ebob = i;
                break;
            }
        }
        System.out.println("EBOB : " + ebob);
        for (int k = 1; k <= n1 * n2; k++) {
            if ((k % n1 == 0) && (k % n2 == 0)){
                System.out.print("EKOK : "+k);
                break;
            }

        }


    }
}



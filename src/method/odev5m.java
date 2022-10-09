package method;

import java.util.Scanner;

public class odev5m {

    static int asal(int a) {
        for (int i = 2; i <= a; i++) {
            boolean isAsal = true;
            for (int j = 2; j < i - 1; j++) {
                if (i % j == 0) {
                    isAsal = false;
                }
            }
        }
        return asal(a);
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("sayı giriniz: ");
        int a = inp.nextInt();
        asal(a);
    }
}

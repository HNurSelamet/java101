package array;

import java.util.Arrays;
import java.util.Scanner;

public class Odev1array {
    public static void main(String[] args) {
        int n;
        int a;

        Scanner inp = new Scanner(System.in);
        System.out.print("Dizinin boyutunu giriniz: ");
        n = inp.nextInt();
        int[] list = new int[n];
        System.out.println("Dizinin elemanlarını giriniz: ");
        for (int i = 0; i < n; i++) {
            System.out.print((i+1) + ". elemanı: ");
            Scanner keyboard = new Scanner(System.in);
            a = keyboard.nextInt();
            list[i] = a;
        }
        Arrays.sort(list);
        System.out.println(Arrays.toString(list));

    }
}

package array;

import Boks.Match;

import java.util.Arrays;
import java.util.Scanner;

public class Pratik2 {
    public static void main(String[] args) {
        /*int[] arr = {52, 4, 599, 1, 6, 5};
        int min = arr[0];
        int max = arr[0];
        for (int i : arr) {
            if (i < min) {
               min=i;
            }
            if (i > max) {
                max= i;
            }
        }
        System.out.println("min değer: " + min);
        System.out.println("max değer: "+ max);*/

        // ödev
        int[] arr = {15, 12, 788, 1, -1, 2, 0};
        System.out.println("dizi : " + Arrays.toString(arr));
        Scanner inp = new Scanner(System.in);
        System.out.print("sayı giriniz: ");
        int a = inp.nextInt();
        int sonuc = 0;
        int enKucuk = 100000;
        int enYakinSayi = 0;

        for (int i : arr) {
            sonuc = Math.abs(a - i);
            if (sonuc < enKucuk) {
                enKucuk = sonuc;
                enYakinSayi = i;
            }
        }
        System.out.println(enYakinSayi);
    }
}

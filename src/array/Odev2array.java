package array;

import java.util.Arrays;
import java.util.Scanner;

public class Odev2array {
    static boolean isFind(int[] arr, int value) {
        for (int i : arr) {
            if (i == value) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] list = {10, 20, 20, 10, 10, 20, 5, 3, 3, 3, 3, 20};
        System.out.print("Dizi: " + Arrays.toString(list));
        int[] duplicate = new int[list.length];
        int startindeks = 0;
        System.out.println();
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list.length; j++) {
                if ((list[i] == list[j]) && (i != j)) {
                    if (!isFind(duplicate, list[i])) {
                        duplicate[startindeks++] = list[i];

                    }

                }


            }

        }
        for (int value : duplicate) {
            if (value != 0) {
                System.out.println(value + " sayisi " );

            }


        }
    }
}

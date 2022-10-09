package array;

import java.util.Scanner;

public class Pratik1 {
    public static void main(String[] args) {
        /*int[] list = {15, 6, 7, 12, 7, 9, 3};
        double avarage = 0.0;
        double sum = 0.0;
        for (int i = 0; i < list.length; i++) {
            sum += list[i];
        }
        System.out.println("toplam: " + sum);
        avarage = sum / (list.length);
        System.out.println(avarage + "ortalama");*/

        System.out.println("dizinin eleman sayısı giriniz: ");
        Scanner inp = new Scanner(System.in);
        int n;
        n = inp.nextInt();
        int[] dizi = new int[n];
        double sum = 0.0;
        double toplam = 0.0;
        double harmonik=0.0;
        for (int i = 0; i < dizi.length; i++) {
            sum += (dizi[i] + 1);
            System.out.println(1 / sum);
            toplam += (1 / sum);
        }
        System.out.println("toplam:\n " + toplam);
        harmonik=n/toplam;
        System.out.print("Harmonik ort : "+harmonik);

    }
}

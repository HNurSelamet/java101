package Etkinlik;

import java.util.Scanner;

public class Etkinlik {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Hava sicakliğini giriniz : ");
        int heat = inp.nextInt();

        if (heat < 5) {
            System.out.println("Kayak yapabilirsiniz : ");
        } else if (heat >= 5 && heat <= 25) {
            if (heat <= 15) {
                System.out.println("Sinemaya gidebiirsiniz. ");
            }
            if (heat >= 10) {
                System.out.println("Pikniğe gidebilirsiniz. ");
            }
            }else {
            System.out.println("Yüzmeye gidebilirsiniz");
        }
    }
}
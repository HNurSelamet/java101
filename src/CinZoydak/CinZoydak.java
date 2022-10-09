package CinZoydak;

import java.util.Scanner;

public class CinZoydak {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int date, sonuc;

        System.out.print("doğum yılınızı giriniz :");
        date = inp.nextInt();
        sonuc = date / 12;

        double kalan = date - (sonuc * 12);
        System.out.println( "kalan : "+ kalan );
        if (kalan==0){
            System.out.println("Burcunuz maymun");
        } else if (kalan==1) {
            System.out.println("Burcunuz horoz");
        } else if (kalan==2) {
            System.out.println("Burcunuz köpek");
        } else if (kalan==3) {
            System.out.println("Burcunuz domuz");
        } else if (kalan==4) {
            System.out.println("Burcunuz fare");
        } else if (kalan==5) {
            System.out.println("Burcunuz okuz");
        } else if (kalan==6) {
            System.out.println("Burcunuz kaplan");
        } else if (kalan==7) {
            System.out.println("Burcunuz tavsan");
        } else if (kalan==8) {
            System.out.println("Burcunuz ejderha");
        } else if (kalan==9) {
            System.out.println("Burcunuz yilan");
        } else if (kalan==10) {
            System.out.println("Burcunuz at");
        }else if (kalan==11){
            System.out.println("Burcunuz koyun");
        }

    }
}

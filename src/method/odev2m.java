package method;

import java.util.Scanner;

public class odev2m {

    static int fibo(int n) {
        if ((n == 1) || (n == 2))
            return 1;
        return fibo(n - 1) + fibo(n - 2);
    }


    public static void main(String[] args) {
        System.out.println(fibo(4));


    }
    /*static int fibo(int n) {
         int ilksayi = 0;
         int ikincisayi = 1;
         int toplam = 0;
         for (int i = 1; i <= n; i++) {
             toplam = ilksayi + ikincisayi;
             ilksayi = ikincisayi;
             ikincisayi = toplam;
             System.out.print("," + toplam);
         }
         return toplam;
     }*/
}

package taksimetrehesabi;

import java.util.Scanner;

public class taksimetre {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Gidilen mesafeyi giriniz :");
        double mesafe = inp.nextDouble();
        double mesafetutari = 10 + (mesafe * 2.20);
        double tutar = mesafetutari <= 20 ? 20 : mesafetutari;
        System.out.println("taksimetre tutari : ");
        System.out.println(tutar);

    }
}

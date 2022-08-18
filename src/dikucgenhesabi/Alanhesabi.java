package dikucgenhesabi;

import java.util.Scanner;

public class Alanhesabi {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("a kenarını giriniz : ");
        double a = inp.nextDouble();

        System.out.print("b kenarını giriniz : ");
        double b = inp.nextDouble();

        System.out.print("c kenarını giriniz : ");
        double c = inp.nextDouble();

        double u = (a + b + c) / 2;
        double ucgencevre = 2 * u;
        double alankare = u * (u - a) * (u - b) * (u - c);
        double alan = Math.sqrt(alankare);
        System.out.print("üçgenin çevre uzunluğu : ");
        System.out.println(ucgencevre);
        System.out.print("üçgenin alanı : ");
        System.out.println(alan);


    }
}

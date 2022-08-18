package dikucgenhesabi;

import java.util.Scanner;

public class dikucgen {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("a kenarını giriniz : ");
        int a = inp.nextInt();

        System.out.print("b kenarını giriniz : ");
        int b = inp.nextInt();

        System.out.println("Hipotenüs uzunluğu : ");
        double c = Math.sqrt((a * a) + (b * b));
        System.out.print(c);


    }
}

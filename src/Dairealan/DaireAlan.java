package Dairealan;
import java.util.Scanner;
public class DaireAlan {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Yarıçap değerini giriniz : ");
        int r = inp.nextInt();
        System.out.print("Merkez açı ölçüsünü giriniz :");
        double a = inp.nextDouble();
        double pi= 3.14;

        double alan= (pi*(r*r)*a)/360;
        System.out.print("Dairenin alanı : ");
        System.out.println(alan);


    }
}

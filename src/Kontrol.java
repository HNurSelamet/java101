
import java.util.Scanner;

public class Kontrol {
    public static void main(String[] args) {
        int n1, n2;
        int select;
        Scanner inp = new Scanner(System.in);
        System.out.print("ilk sayıyı giriniz: ");
        n1 = inp.nextInt();
        System.out.print("İkinci sayıyı giriniz: ");
        n2 = inp.nextInt();
        System.out.println("1)Toplama\n2)Çıkarma\n3)Çarpma");
        System.out.print("işlem seçiniz: ");
        select = inp.nextInt();
        switch (select) {
            case 1:
                System.out.println("toplam: " + (n1 + n2));
                break;
            case 2:
                System.out.println("çıkarma" + (n1 - n2));
                break;
            case 3:
                System.out.println("çarpma" + (n1 * n2));
                break;
            default:
                System.out.println("yanlış işlem");
        }

    }
}

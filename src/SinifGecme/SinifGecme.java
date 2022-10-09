package SinifGecme;

import java.util.Scanner;

public class SinifGecme {
    public static void main(String[] args) {
        int mat, fizik, turkce, kimya, muzik;
        Scanner inp = new Scanner(System.in);

        System.out.print("Matematik notunuzu giriniz : ");
        mat = inp.nextInt();
        if ((mat < 0 || mat > 100)) {
            mat = 0;
            System.out.print("Geçersiz not.Ortalamaya girmemiştir.");
        }
        System.out.print("Fizik notunuzu giriniz : ");
        fizik = inp.nextInt();
        if ((fizik < 0 || fizik > 100)) {
            fizik = 0;
            System.out.print("Geçersiz not.Ortalamaya girmemiştir.");
        }

        System.out.print("Türkçe notunuzu giriniz : ");
        turkce = inp.nextInt();
        if ((turkce < 0 || turkce > 100)) {
            turkce = 0;
            System.out.print("Geçersiz not.Ortalamaya girmemiştir.");
        }

        System.out.print("Kimya notunuzu giriniz : ");
        kimya = inp.nextInt();
        if ((kimya < 0 || kimya > 100)) {
            kimya = 0;
            System.out.println("Geçersiz not.Ortalamaya girmemiştir.");
        }

        System.out.print("Müzik notunuzu giriniz : ");
        muzik = inp.nextInt();
        if ((muzik < 0 || muzik > 100)) {
            muzik = 0;
            System.out.print("Geçersiz not.Ortalamaya girmemiştir.");
        }

        double avarage = (mat + fizik + turkce + kimya + muzik) / 5;
        if (avarage <= 55) {
            System.out.println(" Sınıfta kaldınız. ");
        } else {
            System.out.println("Sınıfı geçtiniz. Tebrikler!");
        }
        System.out.println("Ortalamanız:" + avarage);

    }
}

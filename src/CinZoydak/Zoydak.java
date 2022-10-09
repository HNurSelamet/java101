package CinZoydak;

import java.util.Scanner;

public class Zoydak {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int date ;
        System.out.print("Dogum yilinizi giriniz: ");
        date= inp.nextInt();
        switch (date % 12) {
            case 0:
                System.out.println("Burcunuz maymun");
                break;
            case 1:
                System.out.println("Burcunuz horoz");
                break;
            case 2:
                System.out.println("Burcunuz köpek");
                break;
            case 3:
                System.out.println("Burcunuz domuz");
                break;
            case 4:
                System.out.println("Burcunuz fare");
                break;
            case 5:
                System.out.println("Burcunuz okuz");
                break;
            case 6:
                System.out.println("Burcunuz kaplan");
                break;
            case 7:
                System.out.println("Burcunuz tavsan");
                break;
            case 8:
                System.out.println("Burcunuz ejderha");
                break;
            case 9:
                System.out.println("Burcunuz yilan");
                break;
            case 10:
                System.out.println("Burcunuz at");
                break;
            case 11:
                System.out.println("Burcunuz koyun");
                break;
            default:
                System.out.println("Hatalı yıl girişi yaptınız. ");
        }

    }
}

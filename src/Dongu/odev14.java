package Dongu;


public class odev14 {
    public static void main(String[] args) {
        for (int i = 2; i <= 100; i++) {
            boolean isAsal = true;
            for (int j = 2; j < i - 1; j++) {
                if (i % j == 0) {
                    isAsal = false;
                }
            }
            if (isAsal) {
                System.out.print(i + ",");
            }
        }
    }
}


/*
if ((n >= 1) && (n <= 100)) {
            for (int i = 2; i <= n; i++) {
                if ((n % i != 0) && (i % 2 == 1) && (i % 3 != 0)) {
                    System.out.print("  " + i);
                }
            }
        }
 */
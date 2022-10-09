package Notsistemi;

public class Student {
    Course c1;
    Course c2;
    Course c3;
    String name;
    String StuNo;
    String classes;
    double avarage;
    boolean isPass;

    Student(String name, String StuNo, String classes, Course c1, Course c2, Course c3) {
        this.name = name;
        this.StuNo = StuNo;
        this.classes = classes;
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        this.avarage = 0.00;
        this.isPass = false;
    }

    void addBulkExamnote(int not1, int not2, int not3, int soz1, int soz2, int soz3) {
        if ((not1 >= 0 && not1 <= 100) && (soz1 >= 0 && soz1 <= 100)) {
            this.c1.note = not1;
            this.c1.sozlu = soz1;
        }
        if (not2 >= 0 && not2 <= 100) {
            this.c2.note = not2;
            this.c2.sozlu = soz2;
        }
        if (not3 >= 0 && not3 <= 100) {
            this.c3.note = not3;
            this.c3.sozlu = soz3;
        }

    }

    /*void isPass() {
        this.avarage = (this.c1.note + this.c2.note + this.c3.note) / 3.0;
        if (this.avarage >= 55) {
            System.out.println("Sınıfı geçtiniz.");
        } else {
            System.out.println("Sınıfta kaldınız. ");
        }
        printNote();
    }*/

    void isPass() {
        this.avarage = (this.c1.getAverage() +
                this.c2.getAverage() +
                this.c3.getAverage()) / 3.0;
        if (this.avarage >= 55) {
            System.out.println("Sınıfı geçtiniz.");
        } else {
            System.out.println("Sınıfta kaldınız. ");
        }
        printNote();
    }


    void printNote() {
        System.out.println(this.c1.name + "Notu:" + c1.note + "sozlu" + c1.sozlu);
        System.out.println(this.c2.name + "Notu:" + c2.note + "sozlu" + c2.sozlu);
        System.out.println(this.c3.name + "Notu:" + c3.note + "sozlu" + c3.sozlu);
        System.out.println("ortalamanız: " + this.avarage);
    }
}

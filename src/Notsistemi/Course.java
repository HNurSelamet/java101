package Notsistemi;

public class Course {
    Teacher teacher;
    String name;
    String code;
    String prefix;
    int note;
    int sozlu;


    Course(String name, String code, String prefix, Teacher teacher) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.teacher = teacher;
        int note = 0;
        int sozlu = 0;


    }

    void addTeacher(Teacher teacher) {
        if (teacher.branch.equals(this.prefix)) {
            this.teacher = teacher;
            printTeacher();
        } else
            System.out.println("öğretmen ve ders uyuşmamaktadır.");
    }

    void printTeacher() {
        this.teacher.print();
    }

    double getAverage() {
        return 0.8 * this.note + 0.2 * this.sozlu;
    }

    void setSozlu(int sozlu) {
        this.sozlu = sozlu;
    }
}

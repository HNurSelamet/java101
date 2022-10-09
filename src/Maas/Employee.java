package Maas;

public class Employee {
    String name;
    double salary;
    int workHours;
    int hireyear;

    Employee(String name, double salary, int workHours, int hireyear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireyear = hireyear;
    }

    double tax() {
        if (this.salary < 1000) {
            System.out.println("vergi uygulanmayacaktır.");
            return 0;
        }
        return this.salary * 0.03;
    }

    double bonus() {
        if (this.workHours < 40) {
            return 0;
        }
        return (this.workHours - 40) * 30;
    }

    double raiseSalary() {
        if (this.hireyear < 10) {
            return (this.salary * 0.05);
        }
        if (this.hireyear < 20) {
            return this.salary * 0.10;
        }
        return this.salary * 0.15;
    }

    public void printEmployee() {
        System.out.println("Adi: " + this.name);
        System.out.println("Maasi: " + this.salary);
        System.out.println("Calisma saati: " + this.workHours);
        System.out.println("Baslangic yili: " + this.hireyear);
        System.out.println("Vergi" + tax());
        System.out.println("Bonus" + bonus());
        System.out.println("Maaş artışı: " + raiseSalary());
        System.out.println("Vergi ve bonuslarla birlikte maas: " + ((bonus() - tax()) + this.salary));
        System.out.println("Toplam maas: " + (this.salary + raiseSalary()));
    }
}

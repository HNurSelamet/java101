package Boks;

public class Match {
    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;

    Match(Fighter f1, Fighter f2, int minWeight, int maxWeight) {
        this.f1 = f1;
        this.f2 = f2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
    }

    void run() {
        if (isCheck()) {
            if (Math.random() * 100 < 50) {
                this.f2.health = this.f1.hit(f2);
                this.f1.health = this.f2.hit(f1);
            } else {
                this.f1.health = this.f2.hit(f1);
                this.f2.health = this.f1.hit(f2);
            }
            System.out.println(this.f1.name + " Yeni sağlık: " + this.f1.health);
            System.out.println(this.f2.name + " Yeni sağlık: " + this.f2.health);
            while (this.f1.health > 0 && this.f2.health > 0) {
                System.out.println("======YENİ ROUNT======");
                this.f2.health = this.f1.hit(f2);
                if (isWin()) {
                    break;
                }
                this.f1.health = this.f2.hit(f1);
                if (isWin()) {
                    break;
                }
                System.out.println(this.f1.name + " Yeni sağlık: " + this.f1.health);
                System.out.println(this.f2.name + " Yeni sağlık: " + this.f2.health);
            }

        } else {
            System.out.println("Sporcuların sikletleri uymuyor.");
        }
    }

    boolean isCheck() {
        return (this.f1.weight >= minWeight && this.f1.weight <= maxWeight) && (this.f2.weight >= minWeight && this.f2.weight <= maxWeight);
    }

    boolean isWin() {
        if (this.f1.health == 0) {
            System.out.println(this.f2.name + "kazandı !");
            return true;
        }
        if (this.f2.health == 0) {
            System.out.println(this.f1.name + "kazandı !");
            return true;
        }
        return false;
    }
}

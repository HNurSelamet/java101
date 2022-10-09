public class Car {

    String type = "sedan";
    String model;
    String colour;
    int speed;
    int speedlimit = 180;

    Car(String model, int speed, String colour) {
        this.model = model;
        this.speed = speed;
        this.colour = colour;
    }
    Car(){
        System.out.println("Bosss");
    }

    int increaseSpeed(int increment) {
        speed += increment;
        return speed;
    }

    int decreaseSpeed(int decrease) {
        if (speed > 0) {
            speed -= decrease;
        }
        return speed;
    }

    void printSpeed() {
        System.out.println(model + "Speed : " + speed);
    }

    void printinfo() {
        System.out.println("MODEL\t:"+this.model);
        System.out.println("SPEED\t:"+this.speed);
        System.out.println("COLOUR\t:"+this.colour);
        System.out.println("Type\t:"+this.type);
    }

}

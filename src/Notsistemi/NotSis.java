package Notsistemi;

public class NotSis {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("mahmut", "TRH", "2568");
        Teacher t2 = new Teacher("GrahamBell", "FZK", "000");
        Teacher t3 = new Teacher("külyutmaz", "bio", "1111");

        Course tarih = new Course("Tarih", "101", "TRH", t1);


        Course fizik = new Course("Fizik", "102", "FZK", t2);


        Course biyoloji = new Course("Biyoloji", "103", "bio", t3);


        Student s1 = new Student("Nur", "365", "4", tarih, fizik, biyoloji);
        s1.addBulkExamnote(100, 100, 100,50,50,50);
        s1.isPass();


    }
}

package oopConcepts.oop.inheritance.withInheritance;

public class Main {
    public static void main(String[] args) {

        //Teacher nesnesi
        Teacher teacher1=new Teacher();
        teacher1.name="Ahmet";
        teacher1.surname="Yamac";
        teacher1.phoneNumber="123 000";
        teacher1.lesson="Java";

        teacher1.displayLessons();// teacher sinifindaki method calisti

        //Student nesnesi
        Student std1=new Student();
        std1.name="Veli";
        std1.surname="Kara";
        std1.phoneNumber="111 000";
        std1.studentNumber="123";

        std1.displayLessons();



    }
}

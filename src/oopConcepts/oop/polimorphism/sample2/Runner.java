package oopConcepts.oop.polimorphism.sample2;

public class Runner {
    public static void main(String[] args) {

        Student std1=new Student();
        std1.name="Ogrenci";
        std1.age=18;
        std1.phoneNumber="000";

        Teacher tcr1=new Teacher();
        tcr1.name="Teacher";
        tcr1.age=41;
        tcr1.phoneNumber="111";

        printInfoForStudent(std1);
        //printInfoForStudent(tcr1);

        printInfoForTeacher(tcr1);

        System.out.println("========= AYNI SONUCU TEK MOTHOD ILE ====================");
        printWithPolymorpfism(std1);
        printWithPolymorpfism(tcr1);


    }
    public static void printInfoForStudent(Student std){
        System.out.println("name : "+std.name);
        System.out.println("age : "+std.age);
        System.out.println("phone-number : "+std.phoneNumber);
    }

    public static void printInfoForTeacher(Teacher tcr){
        System.out.println("name : "+tcr.name);
        System.out.println("age : "+tcr.age);
        System.out.println("phone-number : "+tcr.phoneNumber);
    }

    public static void printWithPolymorpfism(User user){
        System.out.println("name : "+user.name);
        System.out.println("age : "+user.age);
        System.out.println("phone-number : "+user.phoneNumber);
    }




}

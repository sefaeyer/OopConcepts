package oopConcepts.oop.encapsulation;

public class User {

    public String name;
    public String surname;
    public String password;

    public User(String name, String surname, String password) {
        this.name = name;
        this.surname = surname;
        this.password = password;
    }

    public static void main(String[] args) {

        User user1 = new User("Ayse","Arzu","12345");
        System.out.println("user1.name = " + user1.name);

        //istersem olusturulan bu nesnenin herhangi bir degiskenini degistirebilirim
        user1.name="Mehmet";

        //!!! Olusturdugum bu degiskenlerin bazilarinin daha sonra degistirilmesini istemiyorsam
        // Hepsinin ihtiyac halinde okunmasini ama bazilarinin degistirilmesini istemiyorsam


    }
}

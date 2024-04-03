package oopConcepts.constructor;

import lombok.Builder;

@Builder
public class Person2 {

    private String name;
    private String surname;
    private int age;
    private int phoneNumber;

    public static void main(String[] args) {
        //!!! name + surname + phoneNumber ile nesne uretelim

        Person2 person3 = Person2.builder().name("Sefa").surname("Eyer").phoneNumber(123).build();
        System.out.println(person3.name+" "+person3.phoneNumber);

        Person2 pers4=Person2.builder().name("Ayse").build();
        System.out.println(pers4.name);


    }



}

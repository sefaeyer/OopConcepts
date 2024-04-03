package oopConcepts.oop.abstraction;

public class Main {

    public static void main(String[] args) {


        Calculator calculator1=new Calculator();
        int result = calculator1.add(10,20);
        System.out.println("result = " + result);


        // JBDC den Abstraction ile ilgili ornek:
        //Statement --> st.execute()
    }



}

package oopConcepts.oop.polimorphism.sample1;

public class Runner {
    public static void main(String[] args) {

        Circle circle1= new Circle();
        circle1.draw();

        //circle1=new Triangle();

        //1. yol
        Square square1=new Square();
        square1.draw();

        Triangle triangle1=new Triangle();
        triangle1.draw();

        //2.yol
        System.out.println("*************POLIMORPHISM********************");
        Shape shape1=new Circle();
        shape1.draw();

        shape1=new Triangle();
        shape1.draw();

        shape1=new Square();
        shape1.draw();

        //SONUC  :  1 degisken ile ayni turde farkli nesneleri krsilayabiliriz


    }
}

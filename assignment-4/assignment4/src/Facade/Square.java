package Facade;

//Square class is an implementation of Shape interface
public class Square implements Shape {
//    This method mimics the drawing of a geometric square
    @Override
    public void draw() {
        System.out.println("Square.draw()");
    }
}

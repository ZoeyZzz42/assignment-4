package FactoryPattern;

// The Rectangle class is symbolized a rectangle shape
// and implements the Shape interface.
public class Rectangle implements Shape {

    // This method draws a rectangle.
    @Override
    public void draw() {
        System.out.println("Inside Rectangle.draw()");
    }
}

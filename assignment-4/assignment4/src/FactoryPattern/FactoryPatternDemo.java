package FactoryPattern;



//The FactoryPatternDemo class showcases the application of the Factory Pattern
// in generating instances of various shapes through the utilization of the ShapeFactory.
public class FactoryPatternDemo {


//    The primary method is where the Factory Pattern
//    demonstration takes place. It instantiates a
//    ShapeFactory and employs it to create instances
//    of diverse shapes, subsequently invoking the draw method on each shape.
    public static void main(String[] args) {

        ShapeFactory shapeFactory = new ShapeFactory();

        Shape shape1 = shapeFactory.getShape("circle");
        shape1.draw();

        Shape shape2 = shapeFactory.getShape("rectangle");
        shape2.draw();

        Shape shape3 = shapeFactory.getShape("square");
        shape3.draw();

    }
}

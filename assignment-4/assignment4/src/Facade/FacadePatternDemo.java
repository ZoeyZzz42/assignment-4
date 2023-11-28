package Facade;


//The class FacadePatternDemo illustrates the application of the Facade Pattern
// through the utilization of the ShapeMaker facade to render different shapes.
// This simplifies the client code by offering a unified interface for the
// creation and drawing of shapes.
public class FacadePatternDemo {


//    The primary method showcases the implementation of the Facade Pattern.
//    Here, a ShapeMaker object is instantiated and employed to draw a circle,
//    rectangle, and square.
    public static void main(String[] args) {
        ShapeMaker shapeMaker = new ShapeMaker();

        // Draw the various shapes using the ShapeMaker facade
        shapeMaker.drawCircle();
        shapeMaker.drawRectangle();
        shapeMaker.drawSquare();
    }
}

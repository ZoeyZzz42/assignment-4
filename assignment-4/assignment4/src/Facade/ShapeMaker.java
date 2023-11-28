package Facade;

// The ShapeMaker class functions as a facade,
// simplifying the process of drawing different shapes such as circles, rectangles, and squares.
// It encapsulates the logic for creation and drawing.
public class ShapeMaker {

    private Shape circle;
    private Shape rectangle;
    private Shape square;

//    ShapeMaker constructor. Sets up the shapes for drawing.

    public ShapeMaker() {
        circle = new Circle();
        rectangle = new Rectangle();
        square = new Square();
    }


//     Draws a circle by calling the drawing method for circle.

    public void drawCircle(){
        circle.draw();
    }

    //     Draws a rectangle by calling the drawing method for rectangle.

    public void drawRectangle(){
        rectangle.draw();
    }

    //     Draws a square by calling the drawing method for square.
    public void drawSquare(){
        square.draw();
    }
}

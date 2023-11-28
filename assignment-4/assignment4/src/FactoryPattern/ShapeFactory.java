package FactoryPattern;


//The ShapeFactory class is tasked with generating instances
// of various shapes. It adheres to the Factory Pattern.
public class ShapeFactory {

//    This method returns a shape based on the shape type parameter that is put in the method

    public Shape getShape(String shapeType){
        if(shapeType == null){
            return null;
        }
        if(shapeType.equalsIgnoreCase("CIRCLE")){
            return new Circle();

        } else if(shapeType.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();

        } else if(shapeType.equalsIgnoreCase("SQUARE")){
            return new Square();
        }
        return null;
    }
}

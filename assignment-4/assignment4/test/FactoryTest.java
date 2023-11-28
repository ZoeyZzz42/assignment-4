
import FactoryPattern.Circle;
import FactoryPattern.Shape;
import FactoryPattern.Square;
import FactoryPattern.Rectangle;
import FactoryPattern.ShapeFactory;
import static junit.framework.Assert.assertNotNull;
import static junit.framework.Assert.assertTrue;
import org.junit.Test;

public class FactoryTest {

    @Test
    public void testGetCircle() {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape circle = (Shape) shapeFactory.getShape("CIRCLE");

        assertNotNull(circle);
        assertTrue(circle instanceof Circle);
    }

    @Test
    public void testGetSquare() {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape square = (Shape) shapeFactory.getShape("SQUARE");

        assertNotNull(square);
        assertTrue(square instanceof Square);
    }

    @Test
    public void testGetRectangle() {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape rectangle = (Shape) shapeFactory.getShape("Rectangle");

        assertNotNull(rectangle);
        assertTrue(rectangle instanceof Rectangle);
    }
}
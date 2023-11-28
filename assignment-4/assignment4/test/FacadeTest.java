import Facade.ShapeMaker;
import static org.junit.Assert.*;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class FacadeTest {

    @Test
    public void testDrawCircle() {
        ShapeMaker shapeMaker = new ShapeMaker();
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        shapeMaker.drawCircle();

        System.setOut(System.out);

        assertEquals("Circle::draw()\n", outContent.toString());
    }

    @Test
    public void testDrawRectangle() {
        ShapeMaker shapeMaker = new ShapeMaker();

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        shapeMaker.drawRectangle();

        System.setOut(System.out);
    }

    @Test
    public void testDrawSquare() {
        ShapeMaker shapeMaker = new ShapeMaker();

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        shapeMaker.drawSquare();

        System.setOut(System.out);
        assertEquals("Square.draw()\n", outContent.toString());
    }
}

import MoonRoverStatePattern.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RoverTest {

    @Test
    void testAccelerateForward() {
        LunarRover rover = new LunarRover();

        rover.pressLeftPedal();
        assertEquals("Accelerate forward", getConsoleOutput());

        // Verify that the state is changed to AccelerateForward
        assertTrue(rover.getState() instanceof AccelerateForward);
    }

    @Test
    void testAccelerateBackward() {
        LunarRover rover = new LunarRover();

        rover.pressRightPedal();
        assertEquals("Accelerate backward", getConsoleOutput());

        // Verify that the state is changed to AccelerateBackward
        assertTrue(rover.getState() instanceof AccelerateBackward);
    }

    @Test
    void testHoldRightPedalConstantSpeed() {
        LunarRover rover = new LunarRover();

        rover.pressLeftPedal();
        rover.holdRightPedal(4); // Hold right pedal for 4 seconds
        assertEquals("Constant forward speed", getConsoleOutput());

        // Verify that the state remains as AccelerateForward
        assertTrue(rover.getState() instanceof AccelerateForward);
    }

    @Test
    void testRestAfterLeftPedalHold() {
        LunarRover rover = new LunarRover();

        rover.holdLeftPedal(4); // Hold left pedal for 4 seconds
        assertEquals("Rest", getConsoleOutput());

        // Verify that the state remains as Rest
        assertTrue(rover.getState() instanceof AtRest);
    }

    @Test
    void testDecelerateState() {
        LunarRover rover = new LunarRover();

        rover.pressRightPedal();
        assertEquals("Decelerate", getConsoleOutput());

        // Verify that the state is changed to Decelerate
        assertTrue(rover.getState() instanceof Decelerate);
    }

    // Helper method to capture console output for testing
    private StringBuilder consoleOutput = new StringBuilder();

    // Method to set console output (for testing purposes)
    public void setConsoleOutput(String output) {
        this.consoleOutput.append(output);
    }

    // Method to get console output (for testing purposes)
    public String getConsoleOutput() {
        return consoleOutput.toString();
    }
}

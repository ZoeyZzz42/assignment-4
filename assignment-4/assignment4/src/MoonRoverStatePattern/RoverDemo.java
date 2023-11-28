package MoonRoverStatePattern;

// Main class
public class RoverDemo {
    public static void main(String[] args) {
        LunarRover rover = new LunarRover();

        // Example Usage:
        rover.pressLeftPedal();  // Accelerate forward
        rover.pressRightPedal(); // Accelerate backward
        rover.holdRightPedal(5); // Hold right pedal for 5 seconds (constant forward speed)
        rover.pressLeftPedal();  // Rest
    }
}

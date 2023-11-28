package MoonRoverStatePattern;

public class AccelerateForward implements State {
    @Override
    public void pressLeftPedal(LunarRover rover) {
        System.out.println("Rest");
        rover.setState(new AtRest());
    }

    @Override
    public void pressRightPedal(LunarRover rover) {
        System.out.println("Decelerate");
        rover.setState(new Decelerate());
    }

    @Override
    public void holdRightPedal(LunarRover rover, int duration) {
        if (duration >= 3) {
            System.out.println("Constant forward speed");
            rover.setVelocity(1); // Positive velocity for forward
        }
    }

    @Override
    public void holdLeftPedal(LunarRover rover, int duration) {
        // No action in AccelerateForward state
    }
}

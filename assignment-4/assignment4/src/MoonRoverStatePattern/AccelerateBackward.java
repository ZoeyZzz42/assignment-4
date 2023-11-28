package MoonRoverStatePattern;

public class AccelerateBackward implements State {
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
            System.out.println("Constant speed (backward)");
            rover.setVelocity(-1); // Negative velocity for backward
        }
    }

    @Override
    public void holdLeftPedal(LunarRover rover, int duration) {
        if (duration >= 3) {
            System.out.println("Constant speed (forward)");
            rover.setVelocity(1); // Positive velocity for forward
        }
    }
}

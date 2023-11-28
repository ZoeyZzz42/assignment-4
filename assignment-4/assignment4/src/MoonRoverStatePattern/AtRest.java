package MoonRoverStatePattern;

public class AtRest implements State {
    @Override
    public void pressLeftPedal(LunarRover rover) {
        System.out.println("Accelerate forward");
        rover.setState(new AccelerateForward());
    }

    @Override
    public void pressRightPedal(LunarRover rover) {
        System.out.println("Accelerate backward");
        rover.setState(new AccelerateBackward());
    }

    @Override
    public void holdRightPedal(LunarRover rover, int duration) {
        // No action in Rest state
    }

    @Override
    public void holdLeftPedal(LunarRover rover, int duration) {
        // No action in Rest state
    }
}

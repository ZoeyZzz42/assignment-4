package MoonRoverStatePattern;

public class Decelerate implements State {
    @Override
    public void pressLeftPedal(LunarRover rover) {
        System.out.println("Rest");
        rover.setState(new AtRest());
    }

    @Override
    public void pressRightPedal(LunarRover rover) {
        // No action in Decelerate state
    }

    @Override
    public void holdRightPedal(LunarRover rover, int duration) {
        // No action in Decelerate state
    }

    @Override
    public void holdLeftPedal(LunarRover rover, int duration) {
        // No action in Decelerate state
    }
}

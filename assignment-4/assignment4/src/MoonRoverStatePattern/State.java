package MoonRoverStatePattern;

public interface State {
    void pressLeftPedal(LunarRover rover);
    void pressRightPedal(LunarRover rover);
    void holdRightPedal(LunarRover rover, int duration);
    void holdLeftPedal(LunarRover rover, int duration);
}

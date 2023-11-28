package MoonRoverStatePattern;

//Context class representing the Lunar Rover
public class LunarRover {
    private State currentState;
    private int velocity; // Positive for forward, negative for backward

    // Constructor initializes the rover in the Rest state
    public LunarRover() {
        this.currentState = new AtRest();
        this.velocity = 0; // Initial velocity is zero
    }

    // Method to set the current state
    public void setState(State state) {
        this.currentState = state;
    }

    // Methods to get the current state (added for testing purposes)
    public State getState() {
        return currentState;
    }

    // Methods to get the velocity (added for testing purposes)
    public int getVelocity() {
        return velocity;
    }

    // Methods to perform pedal actions
    public void pressLeftPedal() {
        currentState.pressLeftPedal(this);
    }

    public void pressRightPedal() {
        currentState.pressRightPedal(this);
    }

    public void holdRightPedal(int duration) {
        currentState.holdRightPedal(this, duration);
    }

    public void holdLeftPedal(int duration) {
        currentState.holdLeftPedal(this, duration);
    }

    // Method to set velocity
    public void setVelocity(int velocity) {
        this.velocity = velocity;
    }

    // Method to get console output (added for testing purposes)

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

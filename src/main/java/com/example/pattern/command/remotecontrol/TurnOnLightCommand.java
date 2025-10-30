package src.main.java.com.example.pattern.command.remotecontrol;

class TurnOnLightCommand implements Command {

    private Light light;

    public TurnOnLightCommand(Light light) {
        this.light = light;
    }

    public void execute() {
        light.turnOn();
    }
}

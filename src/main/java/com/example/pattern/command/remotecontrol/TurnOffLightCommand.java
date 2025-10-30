package src.main.java.com.example.pattern.command.remotecontrol;

class TurnOffLightCommand implements Command {

    private Light light;

    public TurnOffLightCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.turnOff();
    }
}

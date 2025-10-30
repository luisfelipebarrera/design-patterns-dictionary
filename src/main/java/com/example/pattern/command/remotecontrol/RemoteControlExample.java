package src.main.java.com.example.pattern.command.remotecontrol;

public class RemoteControlExample {

    public static void main(String[] args) {

        Light light =  new Light();

        Command turnOn  = new TurnOnLightCommand(light);
        Command turnOff = new TurnOffLightCommand(light);

        RemoteControl remote = new RemoteControl();

        remote.setCommand(turnOn);
        remote.pressButton();

        remote.setCommand(turnOff);
        remote.pressButton();
    }
}

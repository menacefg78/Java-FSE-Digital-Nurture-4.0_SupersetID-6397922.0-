public class CommandPatternTest {
    public static void main(String[] args) {
        // Receiver
        Light livingRoomLight = new Light();

        // Commands
        Command lightOn = new LightOnCommand(livingRoomLight);
        Command lightOff = new LightOffCommand(livingRoomLight);

        // Invoker
        RemoteControl remote = new RemoteControl();

        // Turn ON the light
        remote.setCommand(lightOn);
        remote.pressButton();  // Output: Light is ON

        // Turn OFF the light
        remote.setCommand(lightOff);
        remote.pressButton();  // Output: Light is OFF
    }
}


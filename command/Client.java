public class Client {
    public static void main(String[] args)
    {
        /*
        Lamp lamp = new Lamp();
        Button lampButton = new Button(lamp);
        lampButton.pressed();
        */

        /*
        Alarm alarm = new Alarm();
        Button alarmButton = new Button(alarm);
        alarmButton.pressed();
        */

        /*
        Alarm alarm = new Alarm();
        Lamp lamp = new Lamp();
        Button alarmButton = new Button(lamp, alarm);
        alarmButton.setMode(Mode.LAMP);
        alarmButton.pressed();
        alarmButton.setMode(Mode.ALARM);
        alarmButton.pressed();
        */

        Alarm alarm = new Alarm();
        Command alarmOnCommand = new AlarmOnCommand(alarm);
        
        Lamp lamp = new Lamp();
        Command lampOnCommand = new LampOnCommand(lamp);

        Button button1 = new Button(lampOnCommand);
        button1.pressed();

        Button button2 = new Button(alarmOnCommand);
        button2.pressed();

        button2.setCommand(lampOnCommand);
        button2.pressed();

    }
}

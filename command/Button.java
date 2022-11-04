public class Button {
    /*
    private Lamp lamp;
    public Button(Lamp lamp)
    {
        this.lamp = lamp;
    }
    public void pressed()
    {
        lamp.turnOn();
    }
    */

    /*
    private Alarm alarm;
    public Button(Alarm alarm)
    {
        this.alarm = alarm;
    }
    public void pressed()
    {
        alarm.start();
    }
    */

    /*
    private Lamp lamp;
    private Alarm alarm;
    private Mode mode;

    public Button(Lamp lamp, Alarm alarm)
    {
        this.alarm = alarm;
        this.lamp = lamp;
    }

    public void setMode(Mode mode)
    {
        this.mode = mode;
    }

    public void pressed()
    {
        switch(mode)
        {
            case LAMP: lamp.turnOn(); break;
            case ALARM: alarm.start(); break;
        }
    }
    */
    private Command theCommand;

    public Button(Command theCommand){
        setCommand(theCommand);
    }

    public void setCommand(Command newCommand)
    {
        this.theCommand = newCommand;
    }

    public void pressed()
    {
        theCommand.execute();
    }
}

import java.util.ArrayList;

public class Computer extends ComputerDevice{

    public ArrayList<ComputerDevice> components = new ArrayList<ComputerDevice>();
    /*
    private Keyboard keyboard;
    private Body body;
    private Monitor monitor;
    private Speaker speaker;
    */

    public void addComponent(ComputerDevice component){components.add(component);}
    public void removeComponent(ComputerDevice component){components.remove(component);}

    /*
    public void addKeyboard(Keyboard keyboard){this.keyboard = keyboard;}
    public void addBody(Body body){this.body = body;}
    public void addMonitor(Monitor monitor){this.monitor = monitor;}
    public void addSpeaker(Speaker speaker){this.speaker = speaker;}
    */

    public int getPrice(){
        /*
        int keyboardPrice = keyboard.getPrice();
        int bodyPrice = body.getPrice();
        int monitorPrice = monitor.getPrice();
        int speakerPrice = speaker.getPrice();

        return keyboardPrice+bodyPrice+monitorPrice+speakerPrice;
        */
        int price = 0;
        for(ComputerDevice component : components){
            price+=component.getPrice();
        }
        return price;
    }

    public int getPower(){
        /*
        int keyboardPower = keyboard.getPower();
        int bodyPower = body.getPower();
        int monitorPower = monitor.getPower();
        int speakerPower = speaker.getPower();

        return keyboardPower+bodyPower+monitorPower+speakerPower;
        */

        int power = 0;
        for(ComputerDevice component : components){
            power+=component.getPower();
        }
        return power;
    }
}

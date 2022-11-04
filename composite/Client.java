public class Client {
    public static void main(String[] arsg){
        Keyboard keyboard = new Keyboard(5, 2);
        Body body = new Body(100, 70);
        Monitor monitor = new Monitor(20, 30);
        Speaker speaker = new Speaker(20, 3);

        Computer computer = new Computer();
        /*
        computer.addKeyboard(keyboard);
        computer.addBody(body);
        computer.addMonitor(monitor);
        computer.addSpeaker(speaker);
        */
        computer.addComponent(keyboard);
        computer.addComponent(body);
        computer.addComponent(monitor);
        computer.addComponent(speaker);

        int computerPrice = computer.getPrice();
        int computerPower = computer.getPower();

        System.out.println("Computer Price: " + computerPrice + "만원");
        System.out.println("Computer Power: " + computerPower + "W");
    }
}

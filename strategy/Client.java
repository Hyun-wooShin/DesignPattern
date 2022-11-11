public class Client {
    public static void main(String[] args) {
        Robot taekwonV = new TaekwonV("TaekwonV");
        Robot atom = new Atom("Atom");

        taekwonV.setAttackStrategy(new MissileAttackStrategy());
        taekwonV.setMovingStrategy(new WalkingMovingStrategy());

        atom.setAttackStrategy(new PunchAttackStragegy());
        atom.setMovingStrategy(new FlyingMovingStrategy());

        System.out.println("My name is "+ taekwonV.getName());
        taekwonV.move();
        taekwonV.attack();
        
        System.out.println();

        System.out.println("My name is "+ atom.getName());
        atom.move();
        atom.attack();
    }
}

public class TerranScv extends Worker {

    public TerranScv(int hp, int power)
    {
        super(hp,power);
    }

    @Override
    public void gather()
    {
        System.out.println("미네랄을 절단한다.");
    }

    @Override
    public void build()
    {
        System.out.println("건물을 짓는다.");
    }
}

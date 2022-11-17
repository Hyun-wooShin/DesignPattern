public class ZergDron extends Worker {

    public ZergDron(int hp, int power)
    {
        super(hp, power);
    }

    @Override
    public void gather()
    {
        System.out.println("침을 뱉는다.");
    }

    @Override
    public void build()
    {
        System.out.println("건물용 번데기로 변한다.");
    }
}

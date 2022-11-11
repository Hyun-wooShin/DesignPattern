public abstract class Robot
{
    private String name;
    private AttackStrategy attackStrategy;
    private MovingStrategy movingStrategy;


    public Robot(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return this.name;
    }

    public void attack(){
        attackStrategy.attack();
    }
    public void move(){
        movingStrategy.move();
    }

    public void setAttackStrategy(AttackStrategy attackStategy)
    {
        this.attackStrategy = attackStategy;
    }

    public void setMovingStrategy(MovingStrategy movingStrategy)
    {
        this.movingStrategy = movingStrategy;
    }
}
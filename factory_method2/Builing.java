public abstract class Builing {
    public Unit commandCreateUnit()
    {
        Unit unit = createUnit();
        return unit;
    }

    abstract Unit createUnit();
}

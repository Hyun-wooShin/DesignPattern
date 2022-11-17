public abstract class Building {
    public Unit commandCreateUnit()
    {
        Unit unit = createUnit();
        return unit;
    }

    abstract Unit createUnit();
}

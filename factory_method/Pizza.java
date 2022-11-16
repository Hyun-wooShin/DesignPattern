public class Pizza {
    private String name;

    public Pizza(String name)
    {
        this.name = name;
    }

    public void prepare()
    {
        System.out.println("preparing~~ " + name);
    }

    public void bake()
    {
        System.out.println("baking~~ " + name);
    }

    public void box()
    {
        System.out.println("boxing~~ " + name);
    }

    public String getName()
    {
        return name;
    }
}

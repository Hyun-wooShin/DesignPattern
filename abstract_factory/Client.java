import java.util.List;

public class Client {
    public static void main(String[] args) {
        InitializationFactory[] initFactory = {new InitializationFactoryTerran(), new InitializationFactoryZerg()};

        for(InitializationFactory factory : initFactory)
        {
            Building building = factory.createBuilding();
            List<Worker> worker = factory.createUnit();
            worker.get(0).gather();
            worker.get(1).build();
            building.createWorker();
            System.out.println("=======================");
        }
    }
}

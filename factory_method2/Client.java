public class Client {
        public static void main(String[] args) {
        ProtosBuilding protosBuilding = new ProtosBuilding();
        Unit unit1 = protosBuilding.commandCreateUnit();
        System.out.println(unit1.getName() + " 생성됨");


        ZergBuilding zergBuilding = new ZergBuilding();
        Unit unit2 = zergBuilding.commandCreateUnit();
        System.out.println(unit2.getName() + " 생성됨");

        TerranBuilding terranBuilding = new TerranBuilding();
        Unit unit3 = terranBuilding.commandCreateUnit();
        System.out.println(unit3.getName() + " 생성됨");
    }
}

public class Client {
        public static void main(String[] args) {
        Building building1 = new ProtosBuilding();
        Unit unit1 = building1.commandCreateUnit();
        System.out.println(unit1.getName() + " 생성됨");


        Building building2 = new ZergBuilding();
        Unit unit2 = building2.commandCreateUnit();
        System.out.println(unit2.getName() + " 생성됨");

        Building building3 = new TerranBuilding();
        Unit unit3 = building3.commandCreateUnit();
        System.out.println(unit3.getName() + " 생성됨");
    }
}

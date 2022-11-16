public class ZergBuilding extends Builing {

    @Override
    Unit createUnit() {
        return new Zergling();
    }
    
}

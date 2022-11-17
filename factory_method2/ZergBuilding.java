public class ZergBuilding extends Building {

    @Override
    Unit createUnit() {
        return new Zergling();
    }
    
}

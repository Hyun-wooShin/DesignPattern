public class TerranBuilding extends Building {

    @Override
    Unit createUnit() {
        return new Marigne();
    }
    
}

public class ProtosBuilding extends Building {

    @Override
    Unit createUnit() {
        return new Zilert();
    }
    
}

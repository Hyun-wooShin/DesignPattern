import java.util.ArrayList;
import java.util.List;

public class InitializationFactoryTerran extends InitializationFactory {

    @Override
    public Building createBuilding() {
        return new TerranCommandCenter();
    }

    @Override
    public List<Worker> createUnit() {
        int hp = 60;
		int power = 5;
		
		List<Worker> scvList = new ArrayList<>();
		for (int i = 0; i < 4; ++i) {
			scvList.add(new TerranScv(hp, power));
		}
		return scvList;
    }
    
}

import java.util.ArrayList;
import java.util.List;

public class InitializationFactoryZerg extends InitializationFactory {

    @Override
    public Building createBuilding() {
        return new ZergHatchery();
    }

    @Override
    public List<Worker> createUnit() {
        int hp = 50;
		int power = 4;
		
		List<Worker> scvList = new ArrayList<>();
		for (int i = 0; i < 4; ++i) {
			scvList.add(new ZergDron(hp, power));
		}
		return scvList;
    }
    
}


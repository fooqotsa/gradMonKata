package core;
import java.util.HashMap;
import java.util.Map;


public class Street extends Property {
	
	private BuildingPopulation buildingPopulation = BuildingPopulation.none;

	
	private Map<BuildingPopulation,Integer> mapOfBuildingPopulationToRent = new HashMap<BuildingPopulation,Integer>();

	public Street(Group group, int purchasePrice, int mortgageValue, int baseRent, int rentOne, int rentTwo, int rentThree, int rentHotel) {
		super(group, purchasePrice, mortgageValue, baseRent);
		mapOfBuildingPopulationToRent.put(BuildingPopulation.none, baseRent);
		mapOfBuildingPopulationToRent.put(BuildingPopulation.oneHouse, rentOne);
		mapOfBuildingPopulationToRent.put(BuildingPopulation.twoHouses, rentTwo);
		mapOfBuildingPopulationToRent.put(BuildingPopulation.threeHouses, rentThree);
		mapOfBuildingPopulationToRent.put(BuildingPopulation.hotel, rentHotel);
	}

	@Override
	public int getRentAmount() {
		return mapOfBuildingPopulationToRent.get(buildingPopulation);
	}

}

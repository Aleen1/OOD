
public class Horse extends Entity {

	public Horse(String name, int years, int months, int days) {
		super(name, years, months, days);
	}
	
	public int Coefficient() {
		if(years <= 5) {
			return 1;
		} else if(years <= 10) {
			return 3;
		} else {
			return 6;
		}
	}
	
}

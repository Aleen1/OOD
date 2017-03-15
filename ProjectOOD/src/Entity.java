
public abstract class Entity {
	
	protected int years, months, days;
	protected String name;
	
	public Entity(String name, int years, int months, int days) {
		this.name = name;
		this.days = days % 30;
		this.years = years;
		this.months = months % 12;
	}

	public int HashAge() {
		return 365 * years + 30 * months + days;
	}
	
	public int Coefficient() {
		return 1;
	}
	
	public int RelativeAge() {
		return Coefficient() * HashAge();
	}
	
	public int Age() {
		return HashAge();
	}
	
	@Override
	public String toString() {
		return name + " " + years + " " + months + " " + days;
	}
	
}

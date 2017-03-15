import java.util.ArrayList;

public class EntityControl {

	private ArrayList<Entity> entities = new ArrayList<Entity>();
	
	public EntityControl() {
		
	}

	public void AddPerson(String name, int years, int months, int days) {
		entities.add( new Person(name, years, months, days) );
	}
	
	public void AddConstruction(String name, int years, int months, int days) {
		entities.add( new Construction(name, years, months, days) );
	}
	
	public void AddDog(String name, int years, int months, int days) {
		entities.add( new Dog(name, years, months, days) );
	}
	
	public void AddHorse(String name, int years, int months, int days) {
		entities.add( new Horse(name, years, months, days) );
	}
	
	private Entity Older(Entity x, Entity y) {
		if(x.RelativeAge() >= y.RelativeAge()) {
			return x;
		}
		return y;
	}
	
	private boolean Older(Entity x, int age) {
		return x.Age() > age;
	}
	
	public Entity Oldest() {
		Entity ans = entities.get(0);
		for(Entity tmp : entities) {
			ans = Older(ans, tmp);
		}
		
		return ans;
	}
	
	public ArrayList<Entity> OlderThan(int years, int months, int days) {
		int age = 365 * years + 30 * months + days;
		
		ArrayList<Entity> ans = new ArrayList<Entity>();
		for(Entity tmp : entities) {
			if(Older(tmp, age) == true) {
				ans.add(tmp);
			}
		}
		
		return ans;
	}
	
}

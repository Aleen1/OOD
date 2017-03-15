import java.util.ArrayList;

public class Source {

	public static void main(String[] args) {
		EntityControl obj = new EntityControl();
		obj.AddPerson("Fane", 38, 3, 12);
		obj.AddPerson("Costica", 35, 11, 3);
		obj.AddPerson("Nicu", 44, 7, 30);
		obj.AddConstruction("ESB", 120, 0, 0);
		
		/*
		ArrayList<Entity> ans1 = obj.OlderThan(35, 11, 4);		
		for(Entity tmp : ans1) {
			System.out.println(tmp);
		}
		
		Entity ans2 = obj.Oldest();
		System.out.println(ans2);
		*/
		
	}

}

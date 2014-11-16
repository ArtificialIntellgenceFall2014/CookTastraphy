package restraunt;

import java.util.*;

public class Pantry {

	Map<String, Integer> allItems = new HashMap<String, Integer>();;
	
	public Pantry(){
		allItems.put("noodles", 10);
		allItems.put("white sauce", 10);
		allItems.put("red sauce", 10);
		allItems.put("dough", 10);
		allItems.put("meatballs", 10);
		allItems.put("chicken", 10);
		allItems.put("cheese", 10);
	}
}

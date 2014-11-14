package restraunt;
import java.awt.List;
import java.util.LinkedList;

public class Recipe {
	
	public static String name;
	public static LinkedList<String> actions = new LinkedList<String>();
	
	public Recipe(String name){
		Recipe.name = name;
	}
	
	public Recipe(String name, LinkedList<String> actions){
		Recipe.name = name;
		Recipe.actions = actions;
	}
	
	public void addAction(String someAction){
		Recipe.actions.add(someAction);
	}

}

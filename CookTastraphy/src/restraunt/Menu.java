package restraunt;

public class Menu {
	
	public Recipe[] theMenu = {};
	
	public Menu(){
		Recipe spaghetti = new Recipe("Spaghetti");
		spaghetti.addAction("Boil Noodles");
		spaghetti.addAction("Cook Meatballs");
		spaghetti.addAction("Add Red Sauce");
		theMenu[0] = spaghetti;
		Recipe pizza = new Recipe("Pizza");
		pizza.addAction("Make Dough");
		pizza.addAction("Add Red Sauce");
		pizza.addAction("Add Cheese");
		pizza.addAction("Bake");
		theMenu[1] = pizza;
		Recipe chickenParm = new Recipe("Chicken Parmasean");
		chickenParm.addAction("Boil Noodles");
		chickenParm.addAction("Cook Chicken");
		chickenParm.addAction("Add White Sauce");
		chickenParm.addAction("Add Cheese");
		theMenu[2] = chickenParm;
		Recipe chickenAlf = new Recipe("Chicken Alfredo");
		chickenAlf.addAction("Boil Noodles");
		chickenAlf.addAction("Cook Chicken");
		chickenAlf.addAction("Add Sauce");
		theMenu[3] = chickenAlf;		
	}

}

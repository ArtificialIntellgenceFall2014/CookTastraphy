package restraunt;

public class Pantry {

	public Item[] allItems;
	
	public Pantry(){
		Item noodles = new Item("Noodles", 10);
		allItems[0] = noodles;
		Item sauce = new Item("White Sauce", 10);
		allItems[1] = sauce;
		Item rsauce = new Item("Red Sauce", 10);
		allItems[2] = rsauce;
		Item dough = new Item("Dough", 10);
		allItems[3] = dough;
		Item meatballs = new Item("Meatballs", 10);
		allItems[4] = meatballs;
		Item chicken = new Item("Chicken", 10);
		allItems[5] = chicken;
		Item cheese = new Item("Cheese", 10);
		allItems[6] = cheese;
	}
}

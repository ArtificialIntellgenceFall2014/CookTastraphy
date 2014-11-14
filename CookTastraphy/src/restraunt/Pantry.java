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
	}
}

package restraunt;
import javax.swing.*;
import java.awt.*;

import graphics.*;

public class Restraunt {
	//initialize panty, chef, runner, menu
	//create and display gameboard
	//access orders (automatic or actual input?
	
	public static void main(String [ ] args)
	{
		Pantry thePantry = new Pantry();
		Chef theChef = new Chef();
		Runner theRunner = new Runner();
	    RestrauntGameBoard theBoard = new RestrauntGameBoard();
	    
	    
	    theBoard.stockPantry(thePantry.allItems);
	    
	    
	
	}
}

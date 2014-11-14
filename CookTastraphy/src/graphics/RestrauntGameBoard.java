package graphics;
import restraunt.*;
import java.awt.*;
import javax.swing.*;

public class RestrauntGameBoard {
	public JPanel p = new JPanel(new BorderLayout());
	public JFrame frame = new JFrame("CookTastrophy!");
	
	public RestrauntGameBoard(){
		
		JLabel header = new JLabel("CookTastrophy is running...", JLabel.CENTER);
		p.add(header, BorderLayout.PAGE_START);
		JLabel footer = new JLabel("  ");
		p.add(footer, BorderLayout.PAGE_END);
		
		JPanel orders = new JPanel(new BorderLayout());
		orders.setPreferredSize(new Dimension(200, 300));
		orders.setBackground(Color.black);
		JLabel orderHeader = new JLabel("Incoming Orders...", JLabel.CENTER);
		orderHeader.setForeground(Color.YELLOW);
		orders.add(orderHeader, BorderLayout.PAGE_START);
		p.add(orders, BorderLayout.LINE_START);
		
		JPanel pantry = new JPanel(new BorderLayout());
		pantry.setPreferredSize(new Dimension(200, 300));
		pantry.setBackground(Color.CYAN);
		JLabel pantryHeader = new JLabel("Pantry Inventory...", JLabel.CENTER);
		pantry.add(pantryHeader, BorderLayout.PAGE_START);
		p.add(pantry, BorderLayout.LINE_END);
		
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.add(p);
	    frame.setSize(700, 700);
	    frame.setVisible(true);
	}
	
	public void addText(String adding){
		
	}
}

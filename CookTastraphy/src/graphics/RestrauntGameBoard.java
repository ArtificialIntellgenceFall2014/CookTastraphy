package graphics;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

import javax.swing.*;

import restraunt.*;

public class RestrauntGameBoard extends JPanel {
	public JFrame frame = new JFrame("CookTastrophy!");
	public JPanel orders = new JPanel(new FlowLayout());
	public JPanel pantry = new JPanel(new FlowLayout());
	public JPanel chefRunner = new JPanel(new FlowLayout());
	
	public RestrauntGameBoard(){
		JPanel p = new JPanel(new BorderLayout());
		JLabel header = new JLabel("CookTastrophy is running", JLabel.CENTER);
		p.add(header, BorderLayout.PAGE_START);
		JLabel footer = new JLabel("  ");
		p.add(footer, BorderLayout.PAGE_END);
		
		orders.setPreferredSize(new Dimension(200, 300));
		orders.setBackground(Color.black);
		JLabel orderHeader = new JLabel("Incoming Orders", JLabel.CENTER);
		orderHeader.setForeground(Color.YELLOW);
		orders.add(orderHeader);
		p.add(orders, BorderLayout.LINE_START);
		
		pantry.setPreferredSize(new Dimension(200, 300));
		pantry.setBackground(Color.BLACK);
		JLabel pantryHeader = new JLabel("Pantry Inventory", JLabel.CENTER);
		pantryHeader.setForeground(Color.YELLOW);
		pantry.add(pantryHeader);
		p.add(pantry, BorderLayout.LINE_END);
		
		JPanel chef = new JPanel(new FlowLayout());
		chef.setPreferredSize(new Dimension(200, 300));
		chef.setBackground(Color.cyan);
		JLabel chefHeader = new JLabel("The Chef is Currently: ", JLabel.CENTER);
		chefHeader.setForeground(Color.black);
		chef.add(chefHeader);
		chefRunner.add(chef);
		
		JPanel runner = new JPanel(new FlowLayout());
		runner.setPreferredSize(new Dimension(200, 300));
		runner.setBackground(Color.red);
		JLabel runnerHeader = new JLabel("The Runner is Currently: ", JLabel.CENTER);
		runnerHeader.setForeground(Color.black);
		runner.add(runnerHeader);
		chefRunner.add(runner);
		
		p.add(chefRunner, BorderLayout.CENTER);
		
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.add(p);
	    frame.setSize(700, 700);
	    frame.setVisible(true);
	}
	
	public void addOrder(String adding){
		JLabel addingSomething = new JLabel(adding, JLabel.LEFT);
		addingSomething.setPreferredSize(new Dimension(190,20));
		addingSomething.setForeground(Color.WHITE);
		orders.add(addingSomething);
		orders.revalidate();
	}
	
	public void stockPantry(Map<String, Integer> allItems){
		Iterator it = allItems.entrySet().iterator();
	    while (it.hasNext()) {
	        Map.Entry pairs = (Map.Entry)it.next();
	        JLabel pantryItems = new JLabel(pairs.getKey() + " " + pairs.getValue());
	        it.remove(); // avoids a ConcurrentModificationException
	        pantryItems.setPreferredSize(new Dimension(190,20));
			pantryItems.setForeground(Color.WHITE);
			pantry.add(pantryItems);
	    }
		pantry.revalidate();
	}

}

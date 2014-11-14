package graphics;
import java.awt.*;
import javax.swing.*;

public class RestrauntGameBoard {
	public JFrame frame;
	
	public RestrauntGameBoard(){
		
		JPanel p = new JPanel(new BorderLayout()); //PREFERRED!
		JButton okButton = new JButton("OK");
	    p.add(okButton);
	    JButton cancelButton = new JButton("Cancel");
	    p.add(cancelButton);
	    JFrame frame = new JFrame("Oval Sample");
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.add(p);
	    frame.setSize(300, 200);
	}
}

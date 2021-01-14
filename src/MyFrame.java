import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class MyFrame extends JFrame{
	MyFrame() {			
		this.setTitle("JFrame Title");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Set application to exit when click X
		this.setResizable(false);
		this.setSize(420, 420);
		this.setVisible(true);
		
		ImageIcon img = new ImageIcon("logo.png");
		this.setIconImage(img.getImage());
		
		this.getContentPane().setBackground(new Color(31,40,51));
	}
}

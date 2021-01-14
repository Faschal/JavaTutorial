import java.awt.BorderLayout;
import java.awt.Color;


import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanelTest {

	public static void main(String[] args) {
		JLabel label = new JLabel("Hello");
		ImageIcon img = new ImageIcon("logo.png");
		label.setIcon(img);				
		label.setVerticalAlignment(JLabel.BOTTOM);
		label.setHorizontalAlignment(JLabel.RIGHT);
		
		JPanel redPanel = new JPanel();
		redPanel.setBackground(Color.GRAY);
		redPanel.setBounds(0, 0, 250, 250);
		
		
		JPanel bluePanel = new JPanel();
		bluePanel.setBackground(Color.BLUE);
		bluePanel.setBounds(250, 0, 250, 250);
		
		JPanel greenPanel = new JPanel();
		greenPanel.setBackground(Color.green);
		greenPanel.setBounds(0, 250, 500, 250);
		greenPanel.setLayout(new BorderLayout());
		
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(750,750);
		frame.setLayout(null);
		frame.setResizable(false);
		frame.getContentPane().setBackground(new Color(31,40,51));						
		frame.setIconImage(img.getImage());
		frame.add(redPanel);
		frame.add(bluePanel);		
		frame.add(greenPanel);
		greenPanel.add(label);
		frame.setVisible(true);
	}

}

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class FlowLayoutTest {

	public static void main(String[] args) {
		
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500, 500);
		frame.setLayout(new GridLayout(3, 3, 10, 10));
//		frame.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));					
		
//		JPanel panel = new JPanel();
//		panel.setPreferredSize(new Dimension(2500, 250));
//		panel.setBackground(Color.LIGHT_GRAY);
//		panel.setLayout(new FlowLayout());
		
		frame.add(new JButton("1")).setFocusable(false);
		frame.add(new JButton("2")).setFocusable(false);
		frame.add(new JButton("3")).setFocusable(false);
		frame.add(new JButton("4")).setFocusable(false);
		frame.add(new JButton("5")).setFocusable(false);
		frame.add(new JButton("6")).setFocusable(false);
		frame.add(new JButton("7")).setFocusable(false);
		frame.add(new JButton("8")).setFocusable(false);
		frame.add(new JButton("9")).setFocusable(false);
		
//		frame.add(panel);
		frame.setVisible(true);		
	}

}

import java.awt.Color;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

public class LabelTest {

	public static void main(String[] args) {
		ImageIcon img = new ImageIcon("logo.png");
		Border border = BorderFactory.createLineBorder(Color.GREEN, 3);
		
		JLabel label = new JLabel("Welcome To Application");		
		label.setForeground(Color.GREEN);
		label.setIcon(img);
		label.setHorizontalTextPosition(JLabel.CENTER);
		label.setVerticalTextPosition(JLabel.TOP);
		label.setFont(new Font("MV Boli", Font.PLAIN, 20));
		label.setIconTextGap(0);
		label.setBackground(Color.black);
		label.setOpaque(true);
		label.setBorder(border);
		label.setVerticalAlignment(JLabel.CENTER);
		label.setHorizontalAlignment(JLabel.CENTER);
//		label.setBounds(100, 100, 350, 350);
		
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		frame.setSize(500,500);
//		frame.setLayout(null);
//		frame.setResizable(false);
		frame.getContentPane().setBackground(new Color(31,40,51));		
		frame.setIconImage(img.getImage());
		frame.add(label);			
		frame.setVisible(true);
		frame.pack();
	}

}

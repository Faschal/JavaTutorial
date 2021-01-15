import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyFrame2 extends JFrame implements ActionListener{
	JButton button;
	JLabel label;
	
	MyFrame2() {
		ImageIcon icon = new ImageIcon("logo.png");
		ImageIcon icon2 = new ImageIcon("logo.png");
		
		label = new JLabel();
		label.setIcon(icon2);
		label.setBounds(150, 250, 150, 150);
		label.setVisible(false);
		
		button = new JButton();
		button.setBounds(200, 100, 100, 50);
		button.addActionListener(this);
		button.setText("Click");
		button.setFocusable(false);
		button.setIcon(icon);
		button.setHorizontalTextPosition(JButton.CENTER);
		button.setVerticalTextPosition(JButton.CENTER);
		button.setFont(new Font("Comis Sans", Font.BOLD, 25));
		button.setBorder(BorderFactory.createEtchedBorder());
//		button.setEnabled(false);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(null);
		this.setSize(500, 500);
		this.add(button);
		this.add(label);
		this.setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == button) {
			System.out.println("Click");
//			button.setEnabled(false);
			label.setVisible(true);
		}
	}
		
}

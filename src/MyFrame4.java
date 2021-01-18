import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;

public class MyFrame4 extends JFrame implements ActionListener{
	JButton button;
	JCheckBox checbox;
	
	public MyFrame4() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		
		button = new JButton();
		button.setText("Submit");
		button.addActionListener(this);
		
		checbox = new JCheckBox();
		checbox.setText("I'm not a robot");
		checbox.setFocusable(false);
		checbox.setFont(new Font("Consoles", Font.PLAIN, 35));
		
		this.add(button);
		this.add(checbox);
		this.pack();
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == button) {
			System.out.println(checbox.isSelected());
		}
		
	}
		
}

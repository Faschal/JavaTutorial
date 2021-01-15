import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class MyFrame3 extends JFrame implements ActionListener{

	JButton button;
	JTextField text;
	
	public MyFrame3() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Set application to exit when click X
		this.setLayout(new FlowLayout());
		
		button = new JButton("Submit");
		button.addActionListener(this);	
		
		text = new JTextField();
		text.setPreferredSize(new Dimension(250, 40));
		text.setFont(new Font("Consolas", Font.PLAIN, 35));
		text.setForeground(new Color(0x00FF00));
		text.setBackground(Color.black);
		text.setCaretColor(Color.WHITE);
		text.setText("username");
//		text.setEditable(false);
		
		this.add(button);
		this.add(text);
		this.pack();
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == button)
		{
			button.setEnabled(false);
			System.out.println(text.getText());
			text.setEditable(false);
		}
	}
	
}

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class JoptionPaneTest {

	public static void main(String[] args) {
		
//		JOptionPane.showMessageDialog(null, "Hello World", "title", JOptionPane.PLAIN_MESSAGE);
//		JOptionPane.showMessageDialog(null, "Hello World", "title", JOptionPane.INFORMATION_MESSAGE);
//		JOptionPane.showMessageDialog(null, "Hello World", "title", JOptionPane.QUESTION_MESSAGE);
//		JOptionPane.showMessageDialog(null, "Hello World", "title", JOptionPane.WARNING_MESSAGE);
//		JOptionPane.showMessageDialog(null, "Hello World", "title", JOptionPane.ERROR_MESSAGE);
		
//		int answer = JOptionPane.showConfirmDialog(null, "Are you sure ? ", "title", JOptionPane.YES_NO_CANCEL_OPTION);
//		String name = JOptionPane.showInputDialog("What is your name ? ");
//		System.out.println("Name : " + name);
		
		String[] messages = {"No, Not Need It", "Yes, I Need It", "Cancel It"};
		ImageIcon icon = new ImageIcon("logo.png");
		JOptionPane.showOptionDialog(null, "Hello World", "title", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, icon, messages, 0);
		
	}

}

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class FileTest {

	public static void main(String[] args) {
//		File file = new File("IMEI.txt");
//		
//		if(file.exists()) 
//		{
//			System.out.println("File exists");
//			System.out.println(file.getPath());
//			System.out.println(file.getAbsolutePath());
//			System.out.println(file.isFile());			
//		}
//		else
//		{
//			System.out.println("File doesn't exists"); 
//		}
		
//		try {
//			FileWriter writer = new FileWriter("description.txt");
//			writer.write("This is a description \nabout the story about adventure to find dragon ball \nwith many friend and foe to find dragon ball");
//			writer.append("The adventure begin");
//			writer.close();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		try {
			FileReader reader = new FileReader("IMEI.txt");
			int data = reader.read();
			
			while(data != -1) {
				System.out.print((char) data);
				data = reader.read();
			}
			
			reader.close();
						
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}

import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;

public class TimerTest {

	public static void main(String[] args) {
		Timer timer = new Timer();
		
		TimerTask task = new TimerTask() {
			
			int counter = 10;
			@Override
			public void run() {
				if(counter > 0 ) {
					System.out.println(counter + " seconds");
					counter--;
				}
				else {
					System.out.println("End");
					timer.cancel();
				}
				
			}
		};
		
		Calendar date = Calendar.getInstance();
		date.set(Calendar.YEAR, 2020);
		
//		timer.schedule(task, 3000);
//		timer.schedule(task, date.getTime());
		timer.schedule(task, 0, 1000);

	}

}

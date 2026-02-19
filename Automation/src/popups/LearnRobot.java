package popups;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

public class LearnRobot {
	public static void main(String[] args) throws AWTException, InterruptedException {
		Robot r = new Robot();
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_SHIFT);
		r.keyPress(KeyEvent.VK_M);
		r.keyPress(KeyEvent.VK_S);
		r.keyPress(KeyEvent.VK_D);
		r.keyRelease(KeyEvent.VK_SHIFT);
		Thread.sleep(2000);
		
		
	}

}

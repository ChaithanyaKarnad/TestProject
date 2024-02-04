package popup;

import org.openqa.selenium.chrome.ChromeDriver;

public class PopUpJsam {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver=new ChromeDriver();
	driver.get("file:///C:/Users/Chinku/Desktop/Selenium/learningHTML1.html");
	Thread.sleep(3000);
	driver.manage().window().maximize();
	driver.switchTo().alert().accept();
	driver.switchTo().alert().dismiss();
}
}

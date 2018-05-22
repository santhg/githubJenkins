import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;


public class Mavengithubdemo {
@Test
	public static void main(String[] args) throws InterruptedException {
System.out.println("Welcome to Jenkins World");
		
		WebDriver d1=new FirefoxDriver();
		d1.get("https://www.google.com");
		WebElement w1=d1.findElement(By.xpath(".//*[@id='lst-ib']"));
		w1.sendKeys("Integration");
		w1.sendKeys(Keys.ENTER);
	    Thread.sleep(5000);
		System.out.println(d1.getTitle());
		d1.quit();

	}

}

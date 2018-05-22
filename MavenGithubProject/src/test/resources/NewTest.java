import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class Mavengithubdemo  {
  @Test
  public void f() {
	  d1.get("https://www.google.com");
		WebElement w1=d1.findElement(By.xpath(".//*[@id='lst-ib']"));
		w1.sendKeys("Integration");
		w1.sendKeys(Keys.ENTER);
	    Thread.sleep(5000);
		System.out.println(d1.getTitle()); 
  }
  @BeforeTest
  public void beforeTest() {
	  System.out.println("Welcome to Jenkins World");  
  }

  @AfterTest
  public void afterTest() {
	  d1.quit();
  }

}

package Drop_Down;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo_dropDown {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://letcode.in/dropdowns");
		driver.manage().window().maximize();
		
		WebElement myfruit = driver.findElement(By.id("fruits"));
		Select sl = new Select(myfruit);
		boolean multiple = sl.isMultiple();
		System.out.println("Is multiple or NOT  : "+multiple);
		sl.selectByValue("2");	
		sl.selectByIndex(0);
		sl.selectByVisibleText("Banana");
		WebElement uifruit =  sl.getFirstSelectedOption();
		System.out.println(uifruit.getText());
		
		WebElement myhero = driver.findElement(By.id("superheros"));
		Select MH = new Select(myhero);
		boolean multiple1 = MH.isMultiple();
		System.out.println("Is multiple or NOT  : "+multiple1);
		MH.selectByVisibleText("Batwoman");
		MH.selectByIndex(2);
		WebElement UIhero = MH.getFirstSelectedOption();
		System.out.println(UIhero.getText());
		
		
		
		
		Thread.sleep(2000);
		driver.quit();
		
		

	}

}

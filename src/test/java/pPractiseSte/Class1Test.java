package pPractiseSte;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.*;

public class Class1Test {

	public Class1Test() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
	WebElement loginLink=	driver.findElement(By.cssSelector(".ico-login"));
	loginLink.click();
	WebElement loginTextBox= driver.findElement(By.cssSelector("#Email"));
	loginTextBox.sendKeys("tanwar.sameer684@gmail.com");
	WebElement enterPassword=driver.findElement(By.cssSelector("#Password"));
	enterPassword.sendKeys("Anika@17");
	WebElement loginButton = driver.findElement(By.cssSelector("input[type='submit' ][value='Log in']"));
	loginButton.click();
	
	
	}

}

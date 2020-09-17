
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.util.Assert;  
//import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class Login {
public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\703177792\\Downloads\\chromedriver\\chromedriver.exe");
// Create a new instance of the Firefox driver'
WebDriver driver = new ChromeDriver();

driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
// Navigate to URL
driver.get("https://mail.google.com/");
// Maximize the window.
driver.manage().window().maximize();
// Enter UserName
driver.findElement(By.id("Email")).sendKeys(" YOUR USER NAME");
// Enter Password
Assert.assertTrue(driver.findElement(By.id("Email")).isSelected());  
driver.findElement(By.id("Passwd")).sendKeys("YOUR PASSWORD");
// Wait For Page To Load
driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
// Click on 'Sign In' button
driver.findElement(By.id("signIn")).click();
//Click on Compose Mail.
driver.findElement(By.xpath("//div[@class='z0']/div")).click();
// Click on the image icon present in the top right navigational Bar
driver.findElement(By.xpath("//div[@class='gb_1 gb_3a gb_nc gb_e']/div/a")).click();
//Click on 'Logout' Button
driver.findElement(By.xpath("//*[@id='gb_71']")).click();
//Close the browser.
driver.close();
}


}
package registration;


import java.util.List;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class SopranoAssess {
	
	public static void main(String[] args) {

		  WebDriver driver = new ChromeDriver();
		  String URL="http://automationpractice.com/index.php";
		  driver.get(URL);
		  
		  driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
		  driver.manage().window().maximize();
		  
		//Click on Sign in
		  driver.findElement(By.linkText("Sign in")).click();
		  
		//Enter email address
		  driver.findElement(By.cssSelector("[name='email_create']")).sendKeys("devi2.chhabra@test.com");
		  
		  //Click on "Create an account"
		  driver.findElement(By.xpath("//button[@name=\"SubmitCreate\"]")).click();
		  
		  driver.findElement(By.xpath("//input[@id=\"id_gender1\"]")).click();
		  driver.findElement(By.name("customer_firstname")).sendKeys("Devina");
		  driver.findElement(By.name("customer_lastname")).sendKeys("Chhabra");
		  driver.findElement(By.id("passwd")).sendKeys("OSR@123");
		  
		  //Select date of Birth
		  Select sDate = new Select(driver.findElement(By.xpath("//*[@id='days']")));
		  sDate.selectByVisibleText("30");
		  
		  Select sMonth = new Select(driver.findElement(By.xpath("//*[@id='months']")));
		  sMonth.selectByVisibleText("June");
		  
		  Select sYear = new Select(driver.findElement(By.xpath("//*[@id='years']")));
		  sYear.selectByVisibleText("2001");
		  
		  //select required check boxes
		  String newsLetterReq = "Yes";
		  if (newsLetterReq.equalsIgnoreCase(newsLetterReq)){
		  driver.findElement(By.xpath(".//*[@id='newsletter']")).click();
		  }
		  
		  String reciveSpclOffer = "Yes";
		  if (reciveSpclOffer.equalsIgnoreCase(reciveSpclOffer)){
		   driver.findElement(By.xpath("//*[@id='optin']")).click();
		  
		  //Enter the address
		  driver.findElement(By.id("firstname")).sendKeys("Devina");
		  driver.findElement(By.id("lastname")).sendKeys("Chhabra");
		  driver.findElement(By.id("company")).sendKeys("XYZ");
		  driver.findElement(By.id("address1")).sendKeys("2/163 Alice street");
		  driver.findElement(By.id("address2")).sendKeys("Seven Hills")
		  driver.findElement(By.id("city")).sendKeys("VIC");
		  
		  // Select State
		  WebElement statedropdown=driver.findElement(By.name("id_state"));
		  Select iSelect=new Select(statedropdown);
		  iSelect.selectByText("Florida");
		  
		  //postcode
		  driver.findElement(By.xpath("//*[@id='postcode']")).sendKeys("12354");
		  
		  // Select Country
		  WebElement countrydropDown=driver.findElement(By.name("id_country"));
		  Select iCountry=new Select(countrydropDown);
		  iCountry.selectByVisibleText("United States");
		  
		  //other info
		  driver.findElement(By.xpath("//*[@id='other']")).sendKeys("any other info");
		  driver.findElement(By.xpath("//*[@id='phone']")).sendKeys("123457876");
		  driver.findElement(By.xpath("//*[@id='phone_mobile']")).sendKeys("868768768768");
		  driver.findElement(By.xpath("//*[@id='alias']")).sendKeys("alias");
		  
		  //Register
		  driver.findElement(By.name("submitAccount")).click();
		  }
		  
	}
}

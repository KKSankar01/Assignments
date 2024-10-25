package week2.day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LoginLeaftaps {
	public static WebDriver driver=new EdgeDriver();

	public void login() {
		//WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.findElement(By.id("username")).sendKeys("DemoCSR");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
	}
	
	//public WebDriver driver() {
		//return driver();
	//}
	
//	public void AccountCreation() {
//		// TODO Auto-generated method stub
//		driver.findElement(By.linkText("Accounts")).click();
//		driver.findElement(By.linkText("Create Account")).click();
//		driver.findElement(By.id("accountName")).sendKeys("Sankar K");
//		driver.findElement(By.xpath("//textarea[@class='inputBox']")).sendKeys("Selenium Automation Tester.");
//		driver.findElement(By.id("numberEmployees")).sendKeys("10");
//		driver.findElement(By.id("officeSiteName")).sendKeys("Siruseri");
//		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
//		String title = driver.getTitle();
//		System.out.println(title);
//	}
	
//	public void Lead() {
//		driver.findElement(By.linkText("Leads")).click();
//		driver.findElement(By.linkText("Create Lead")).click();
//		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Sankar");
//		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("K");
//		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Tata Consultancy Services");
//		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Hope for better future");
//		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
//		String title = driver.getTitle();
//		System.out.println(title);
//	}
	public static void main(String[] args) {
		LoginLeaftaps creation=new LoginLeaftaps();
		creation.login();
		//creation.AccountCreation();
//		creation.Lead();
}
	
		
}
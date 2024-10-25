package week2.day3;

import org.openqa.selenium.By;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.edge.EdgeDriver;

public class LeaftapsAccountCreation extends LoginLeaftaps {

	public void AccountCreation() {
		// TODO Auto-generated method stub
		driver.findElement(By.linkText("Accounts")).click();
		driver.findElement(By.linkText("Create Account")).click();
		driver.findElement(By.id("accountName")).sendKeys("Sankar K");
		driver.findElement(By.xpath("//textarea[@class='inputBox']")).sendKeys("Selenium Automation Tester.");
		driver.findElement(By.id("numberEmployees")).sendKeys("10");
		driver.findElement(By.id("officeSiteName")).sendKeys("Siruseri");
		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
		String title = driver.getTitle();
		System.out.println(title);
	}
	
	public static void main(String[] args) {
		LeaftapsAccountCreation creation=new LeaftapsAccountCreation();
		creation.login();
		creation.AccountCreation();
	}

}

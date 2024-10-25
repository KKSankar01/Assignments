package week2.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Leads extends LoginLeaftaps{
	public void Lead() {
	driver.findElement(By.linkText("Leads")).click();
	driver.findElement(By.linkText("Create Lead")).click();
	//driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Sankar");
	driver.findElement(By.xpath("(//input[@class='inputBox'])[3]")).sendKeys("Sankar");
	driver.findElement(By.xpath("(//input[@class='inputBox'])[4]")).sendKeys("K K");
	//driver.findElement(By.id("createLeadForm_lastName")).sendKeys("K");
	//driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TataConsultancy Services");
	driver.findElement(By.xpath("//input[@class='inputBox']")).sendKeys("Tata Consultancy Services" );
	driver.findElement(By.xpath("(//input[@class='inputBox'])[5]")).sendKeys("Sankar");
	driver.findElement(By.xpath("(//input[@class='inputBox'])[10]")).sendKeys("Testing");
	driver.findElement(By.xpath("(//textarea[@class='inputBox'])")).sendKeys("Worked as a testing team lead for last 5 years");
	driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("kksankar04@gmail.com");
	WebElement state = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
	Select select=new Select(state);
	select.selectByValue("IN");
	driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Hope for better future");
	driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("9384352990");
	driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
	String title = driver.getTitle();
	System.out.println(title);
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Leads leadCreation=new Leads();
		leadCreation.login();
		leadCreation.Lead();

	}

}

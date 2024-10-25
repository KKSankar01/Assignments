package week2.day4;

import org.openqa.selenium.By;

import week2.day3.Leads;

public class EditLead extends Leads {
	
	public void EditingLead() {
		driver.findElement(By.xpath("(//a[@class='subMenuButton'])[3]")).click();
		driver.findElement(By.xpath("(//textarea[@class='inputBox'])")).clear();
		driver.findElement(By.xpath("(//textarea[@class='inputBox'])[2]")).sendKeys("TCS");
		driver.findElement(By.xpath("(//input[@class='smallSubmit'])")).click();
		driver.getTitle();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EditLead leaftapLogin=new EditLead();
		leaftapLogin.login();
		leaftapLogin.Lead();
		leaftapLogin.EditingLead();
	}

}

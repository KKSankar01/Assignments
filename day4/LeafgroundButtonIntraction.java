package week2.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class LeafgroundButtonIntraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://leafground.com/button.xhtml");
		driver.findElement(By.xpath("//span[text()='Click']")).click();
		String pageTitle = driver.getTitle();
		System.out.println(pageTitle);
		String expectedText="Dashboard";
		if(expectedText.equals(pageTitle)) {
			System.out.println("page title verified successfully");
		}
		driver.navigate().back();
		boolean statusCheck = driver.findElement(By.xpath("//button[@class='ui-button ui-widget ui-state-default ui-corner-all ui-button-text-only ui-state-disabled']")).isEnabled();
		System.out.println(statusCheck);
		Point submitLocation = driver.findElement(By.xpath("//span[text()='Submit']")).getLocation();
		System.out.println(submitLocation);
	    String color=driver.findElement(By.xpath("//button[@class='ui-button ui-widget ui-state-default ui-corner-all ui-button-text-icon-left ui-button-secondary mr-2 mb-2']")).getCssValue("color");
	    System.out.println(color);
	    Dimension size = driver.findElement(By.xpath("//button[@class='ui-button ui-widget ui-state-default ui-corner-all ui-button-text-icon-right']")).getSize();
	    System.out.println(size);
	    driver.close();
	}
}

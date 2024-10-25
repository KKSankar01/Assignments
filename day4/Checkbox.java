package week2.day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Checkbox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://leafground.com/checkbox.xhtml");
		driver.findElement(By.xpath("//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default']")).click();
		driver.findElement(By.xpath("(//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default'])[1]")).click();
		String expectedText="Checked";
		String actualText = driver.findElement(By.xpath("//span[text()='Checked']")).getText();
		if (actualText.equals(expectedText)) {
			System.out.println("Text verified successfully");
		}else {
			System.out.println("Displayed text is not matched with expected Text");
		}
		driver.findElement(By.xpath("(//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default'])[1]")).click();
		//WebElement element = driver.findElement(By.xpath("(//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default'])[5]"));
		//element.click();
		//WebElement element2 = driver.findElement(By.xpath("(//span[@class='ui-chkbox-icon ui-c ui-icon ui-icon-check'])"));
		//System.out.println(element.isSelected());
		driver.findElement(By.xpath("(//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default'])[5]")).click();
		String actualText1 = driver.findElement(By.xpath("//p[text()='State = 1']")).getText();
		String expectedText1="State = 1";
		if (actualText1.equals(expectedText1)) {
			System.out.println("Text verified successfylly");
		}
		else {
			System.out.println("Displayed text is not matched with expected Text");
		}
		Thread.sleep(10000);
		driver.findElement(By.xpath("//div[@class='ui-toggleswitch-slider']")).click();
		String expectedText2="Checked";
		String actualText2 = driver.findElement(By.xpath("//span[text()='Checked']")).getText();
		if (actualText2.equals(expectedText2)) {
			System.out.println("Text verified successfully");
		}else {
			System.out.println("Displayed text is not matched with expected Text");
		}
		String actualText3 = driver.findElement(By.xpath("//span[@class='ui-chkbox-label ui-state-disabled']")).getText();
		String expectedText3="Disabled";
		if (actualText3.equals(expectedText3)) {
			System.out.println("Text verified successfully");
		}else {
			System.out.println("Displayed text is not matched with expected Text");
		}
		driver.findElement(By.xpath("//div[@class='ui-selectcheckboxmenu-trigger ui-state-default ui-corner-right']")).click();
		driver.findElement(By.xpath("(//label[text()='London'])[2]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//label[text()='Paris'])[2]")).click();
		driver.findElement(By.xpath("//a[@class='ui-selectcheckboxmenu-close ui-corner-all']")).click();
		driver.close();
	}

}

package week2.day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class RadioButton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/radio.xhtml");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("(//span[@class='ui-radiobutton-icon ui-icon ui-icon-blank ui-c'])[12]")).click();
		WebElement unSelectable = driver.findElement(By.xpath("(//div[@class='ui-radiobutton-box ui-widget ui-corner-all ui-state-default'])[13]"));
		unSelectable.click();
		unSelectable.click();
		boolean isButtonSelected = unSelectable.isSelected();
		//@return True if the element is currently selected or checked, false otherwise.
		System.out.println("Is that button selected again: "+isButtonSelected);
		boolean isAnythingEnabled = driver.findElement(By.xpath("(//table[@class='ui-selectoneradio ui-widget'])[6]")).isEnabled();
		System.out.println("Is any button selected defaultly: "+isAnythingEnabled);
		WebElement element = driver.findElement(By.xpath("//label[text()='21-40 Years']"));
		//elements.get(0).click();
		boolean selectedOrNot = element.isEnabled();
		System.out.println(selectedOrNot);
		if(selectedOrNot==true) {
			System.out.println("This button is already selected.");
		}else if(selectedOrNot==false) {
			element.click();
			System.out.println("Button clicked successfully");
		}
	}

}

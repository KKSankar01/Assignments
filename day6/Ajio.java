package week3.day6;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Ajio {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.ajio.com/");
		WebElement bags = driver.findElement(By.name("searchVal"));
		bags.sendKeys("bags");
		bags.sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//label[@class='facet-linkname facet-linkname-genderfilter facet-linkname-Men']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//label[@class='facet-linkname facet-linkname-l1l3nestedcategory facet-linkname-Men - Fashion Bags']")).click();
		String text = driver.findElement(By.xpath("//div[@class='length']/strong")).getText();
		System.out.println(text);
		List<WebElement> brandedBags = driver.findElements(By.xpath("//div[@class='brand']/strong"));
		for(int i=0;i<=brandedBags.size()-1;i++) {
			System.out.println("Bag brands:"+brandedBags.get(i).getText());
		}
		List<WebElement> bagsName = driver.findElements(By.xpath("//div[@class='nameCls']"));
		for(int j=0;j<bagsName.size();j++) {
			System.out.println("Bag names:"+bagsName.get(j).getText());
		}
	}

}

package week2.day4;

//import java.time.Duration;

import org.openqa.selenium.By;

import week2.day3.Leads;
//import week2.day3.LoginLeaftaps;

public class DeleteLead extends Leads{
	
	public void deletelead() throws InterruptedException  {
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("(//span[@class='x-tab-strip-inner'])[2]")).click();
		driver.findElement(By.name("phoneNumber")).sendKeys("9384352990");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(2000);
		String firstLeadid = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).getText();
		System.out.println(firstLeadid);
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		driver.findElement(By.xpath("//a[@class='subMenuButtonDangerous']")).click();
		driver.findElement(By.xpath("//ul[@class='shortcuts']/li[3]/a")).click();
		driver.findElement(By.name("id")).sendKeys(firstLeadid);
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(2000);
		String displayingText = driver.findElement(By.className("x-paging-info")).getText();
		String actualText="No records to display";
		System.out.println(displayingText);
		System.out.println(actualText);
		if (displayingText.equals(actualText)) {
			System.out.println("Lead deleted successfully");
		}else {
			System.out.println("Lead not deleted successfully");
		}
		driver.close();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DeleteLead deleteLead=new DeleteLead();
		deleteLead.login();
		deleteLead.Lead();;
		try {
			deleteLead.deletelead();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

package CLoudBrain_Test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Dashboard_Page extends Test_New_CB {

	@Test(priority = 6)
	public static void Dashboard1() throws InterruptedException 
	{
		Reporter.log("==============Aws Cloud Details ===============", true);
		driver.findElement(By.xpath("//*[@id='awsCount']")).click();
		System.out.println("Click on AWS cloud");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//*[@id='heading0']/h4/a")).click();
		System.out.println("Click on AWS account to see details");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//*[@id='heading0']/h4/a")).click();
		System.out.println("Click on AWS account to close details");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//*[@id='popheader']/h4/button")).click();
		System.out.println("Close AWS cloud details tab");
		Thread.sleep(2000);
		
		Reporter.log("==============GCP Cloud Details ===============", true);	
		driver.findElement(By.xpath("//*[@id='gcpCount']")).click();
		System.out.println("Click on GCP account count");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id='heading0']/h4/a")).click();
		System.out.println("Click on GCP cloud account details");
		
		Thread.sleep(2000);

		driver.findElement(By.xpath("//*[@id='heading0']/h4/a")).click();
		System.out.println("Click on AWS account to close details");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//*[@id='popheader']/h4/button")).click();
		System.out.println("Close AWS cloud details tab");
		
	}
	@Test(priority = 7)
	public static void Dashboard2() throws InterruptedException 
	{
		Reporter.log("==============Remove weidget of TCO===============", true);
		driver.findElement(By.xpath("//*[@id='all_tco_graph']/div[1]/div[1]/a")).click();
		System.out.println("Click on wefget option");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id='tcodrop1']/a[1]")).click();
		System.out.println("Remove TCO Wedget from dashboard");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,-1000)");
		
		driver.findElement(By.xpath("//*[@id='drop1']")).click();
		System.out.println("Click on Add wedget button");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id='drop1']/ul/li[2]")).click();
		System.out.println("Add TCO wedget on dashboard");
		Reporter.log("==============Add weidget of TCO on dashboard===============", true);
	}
	@AfterTest
	public static void end() throws InterruptedException {
		Thread.sleep(8000);
		driver.close();
		driver.quit();
		
	}
}

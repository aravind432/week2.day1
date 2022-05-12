package week2.day1;

import javax.print.DocFlavor.STRING;


import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       WebDriverManager.chromedriver().setup();
       ChromeDriver driver =new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();

		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		String text = driver.findElement(By.tagName("h2")).getText();
		System.out.println(text);
		driver.findElement(By.linkText("CRM/SFA")).click();
		String title = driver.getTitle();
		System.out.println(title);

		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Aravind");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("aravind");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("anand");
		driver.findElement(By.className("smallSubmit")).click();
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.id("updateLeadForm_firstName")).clear();
		driver.findElement(By.id("updateLeadForm_firstName")).sendKeys("Aravind");
		driver.findElement(By.name("submitButton")).click();
		driver.close();

		}

}

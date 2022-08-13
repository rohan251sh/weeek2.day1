package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Createlead {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("demosalesManager");
	    driver.findElement(By.id("password")).sendKeys("crmsfa");
	    driver.findElement(By.className("decorativeSubmit")).click();
	    driver.findElement(By.linkText("CRM/SFA")).click();
	    driver.findElement(By.linkText("Leads")).click();
	    driver.findElement(By.linkText("Create Lead")).click();
	    driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Test Leaf");
	    driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Rohan");
	    driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Sharma");
	    driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("IT");
	    driver.findElement(By.id("createLeadForm_description")).sendKeys("Testing");
	    driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("abcdef@gmail.com");
	    driver.findElement(By.className("smallSubmit")).click();
	    String title = driver.getTitle();
	    System.out.println(title);
	    driver.close();
	    
	}
}
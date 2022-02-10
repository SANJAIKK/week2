package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("Democsr");
        driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM/SF")).click();
		
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("(//input[@type='text' and @name='firstName'])[3]")).sendKeys("Sanjai");
		driver.findElement(By.id("ext-gen334")).click();
		
		driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[2]")).click();
		driver.findElement(By.linkText("Edit")).click();
		String Title=driver.getTitle();
		System.out.println(Title);
		
		driver.findElement(By.xpath("(//input[@type='text and @class = 'inputbox'])[1]")).sendKeys("GTEC");
		driver.findElement(By.xpath("(//input[@type='text and @class = 'inputbox'])[1]")).click();
		driver.close();
		
		
		
		
		

	}

}

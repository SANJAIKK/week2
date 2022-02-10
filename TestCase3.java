package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase3 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("Democsr");
        driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM/SF")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Active Eng");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Sanjai");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Kumar");
		driver.findElement(By.id("createLeadForm_birthDate")).sendKeys("10/06/1996");
		driver.findElement(By.id("createLeadForm_dataSourceId")).sendKeys("Employee");
		driver.findElement(By.id("createLeadForm_marketingCampaignId")).sendKeys("Automobile");
		driver.findElement(By.id("createLeadForm_importantNote")).sendKeys("Hii");
		
		driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode")).sendKeys("+91");
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("8015684877");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("sanjaikumar0506@gmail.com");
		
		driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("SSSS");
		driver.findElement(By.id("createLeadForm_generalAttnName")).sendKeys("KKK");
		driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("9/10 kk nagar");
		driver.findElement(By.id("createLeadForm_generalAddress2")).sendKeys("11 kck nagar");
		driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("Arani");
		driver.findElement(By.id("createLeadForm_generalCountryGeoId")).sendKeys("India");
		driver.findElement(By.name("generalStateProvinceGeoId")).sendKeys("TAMILNADU");
		
		driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("632301");
		
		driver.findElement(By.className("smallSubmit")).click();
		
		
		
		
		
		driver.close();

		

	}

}

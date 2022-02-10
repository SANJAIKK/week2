package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDown {

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
		driver.findElement(By.linkText("Create Lead")).click();
		WebElement sourcedd1=driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select dd = new Select(sourcedd1);
		dd.selectByVisibleText("Employee");
		WebElement indd1=driver.findElement(By.id("createLeadForm_industryEnumId"));
		Select dd1 = new Select(indd1);
		dd1.selectByVisibleText("Finance");
		WebElement owndd1=driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select dd2 = new Select(owndd1);
		dd2.selectByIndex(2);
		
		
		

	}

}

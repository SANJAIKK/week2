package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FaceBook {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[@data-testid=\"open-registration-form-button\"]")).click();  
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Sanjai");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Kumar");
		driver.findElement(By.xpath("//input[@name='reg_email_']")).sendKeys("987456321");
		driver.findElement(By.xpath("//input[@name='reg_passwd_']")).sendKeys("asdfghjk$1");
		
		
		//DropDown
		WebElement day = driver.findElement(By.xpath("//select[@name='birthday_day']"));
		Select dayObjName = new Select(day);
		dayObjName.selectByIndex(10);
		
		WebElement month = driver.findElement(By.xpath("//select[@name='birthday_month']"));
		Select monthObjName = new Select(month);
		monthObjName.selectByIndex(6);
		
		WebElement year = driver.findElement(By.xpath("//select[@name='birthday_year']"));
		Select yearObjName = new Select(year);
		yearObjName.selectByValue("1996");
		
		driver.findElement(By.xpath("//label[text()=\"Male\"]/following-sibling::input")).click();
		
		driver.findElement(By.xpath("//button[@name=\"websubmit\"]")).click();
		

		
		
		
		
		
		
		
		
		

	}

}

package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckBox {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/checkbox.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//input[@type ='checkbox'])[2]")).click();		
		driver.findElement(By.xpath("(//input[@type ='checkbox'])[3]")).click();
		System.out.println(driver.findElement(By.xpath("(//input[@type ='checkbox'])[6]")).isSelected());
		driver.findElement(By.xpath("(//input[@type ='checkbox'])[8]")).click();
		driver.findElement(By.xpath("(//input[@type ='checkbox'])[9]")).click();
		driver.findElement(By.xpath("(//input[@type ='checkbox'])[10]")).click();
		driver.findElement(By.xpath("(//input[@type ='checkbox'])[11]")).click();
		driver.findElement(By.xpath("(//input[@type ='checkbox'])[12]")).click();
		driver.findElement(By.xpath("(//input[@type ='checkbox'])[13]")).click();

	}

}

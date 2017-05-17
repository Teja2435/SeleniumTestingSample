package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestingWikipedia {
	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Teja Pedarla\\Downloads\\Selenium Jars and Web driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.wikipedia.org");
		WebElement link;
		link =driver.findElement(By.partialLinkText("English"));
		link.click();
		Thread.sleep(6000);
		WebElement searchBox;
		searchBox = driver.findElement(By.id("searchInput"));
		searchBox.sendKeys("Bingo");
		Thread.sleep(6000);
		driver.quit();
	}
}

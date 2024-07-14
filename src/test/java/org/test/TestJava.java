package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestJava {

 WebDriver driver = new ChromeDriver();
 @Test
 public  void test() throws InterruptedException {
  driver.get("https://www.browserstack.com/guide/relative-locators-in-selenium");
  Thread.sleep(5000);
  driver.manage().window().maximize();
  driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
  By relativeLocator = By.id("products-dd-toggle");
  WebElement sample = driver.findElement(RelativeLocator.with(By.tagName("a")).near(relativeLocator));
  System.out.println(sample.getText());
  sample.click();
 }

 @AfterTest
 public  void closeBrowser(){
  driver.close();
 }
}

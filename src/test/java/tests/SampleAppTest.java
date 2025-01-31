package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

@Test
public class SampleAppTest {

    public void checkSampleApp(){

        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.uitestingplayground.com/sampleapp");
        driver.findElement(By.xpath("//input[@name='UserName' and @type='text']")).sendKeys("Test1");
        driver.findElement(By.xpath("//input[@name='Password' and @type='password']")).sendKeys("pwd");
        driver.findElement(By.id("login")).click();
        AssertJUnit.assertTrue(driver.findElement(By.xpath("//label[text()='Welcome, Test1!']")).isDisplayed());
        driver.quit();
    }
}

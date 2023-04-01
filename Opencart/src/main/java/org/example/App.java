package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/**
 * Hello world!
 *
 */
public class App 
{
    //Scenario - Verifying the Nav Bar
    WebDriver driver;
    @BeforeTest
    public void setup(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\naman\\IdeaProjects\\Opencart\\src\\main\\resources\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.opencart.com/");
        driver.manage().window().maximize();
    }
    @Test
public void Feature_option() throws InterruptedException {

        String url="https://www.opencart.com/index.php?route=cms/feature";
        driver.findElement(By.linkText("Features")).click();
        Assert.assertEquals(url,driver.getCurrentUrl());
        Thread.sleep(2000);
        driver.navigate().back();
   }
   @Test
   public void Demo_option() throws InterruptedException {
        driver.findElement(By.linkText("Demo")).click();
        String url ="https://www.opencart.com/index.php?route=cms/demo";
        Assert.assertEquals(driver.getCurrentUrl(),url);
        Thread.sleep(2000);
        driver.navigate().back();
   }
   @Test
    public void Marketplace_option() throws InterruptedException {
        driver.findElement(By.linkText("Marketplace")).click();
        String url="https://www.opencart.com/index.php?route=marketplace/extension";
        Assert.assertEquals(driver.getCurrentUrl(),url);
        Thread.sleep(2000);
        driver.navigate().back();

   }
   @Test
    public void Bolg_option() throws InterruptedException {
        driver.findElement(By.xpath("(//a[@href='https://www.opencart.com/blog'])[1]")).click();
        String url ="https://www.opencart.com/blog";
        Assert.assertEquals(driver.getCurrentUrl(),url);
        Thread.sleep(2000);
        driver.navigate().back();
   }
   @Test
    public void Download_option() throws InterruptedException {
        driver.findElement(By.linkText("Download")).click();
        String url ="https://www.opencart.com/index.php?route=cms/download";
        Assert.assertEquals(driver.getCurrentUrl(),url);
        Thread.sleep(2000);
        driver.navigate().back();
    }
    @Test
    public void Resources_option() throws InterruptedException {
        driver.findElement(By.xpath("//a[@data-toggle='dropdown']")).click();
        Thread.sleep(2000);
        driver.quit();
    }

}

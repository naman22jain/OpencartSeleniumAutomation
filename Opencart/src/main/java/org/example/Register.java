package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class Register {
    WebDriver driver;
    @BeforeTest
    public  void setup(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\naman\\IdeaProjects\\Opencart\\src\\main\\resources\\chromedriver.exe");
        ChromeOptions handlingSSL = new ChromeOptions();
        handlingSSL.setAcceptInsecureCerts(true);
        WebDriver driver = new ChromeDriver(handlingSSL);
        driver.get("https://www.opencart.com/index.php?route=account/register");
    }
    @Test
    public void register_button(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(By.xpath("//header/nav[1]/div[1]/div[2]/div[1]/a[2]")).click();
        String url= "//a[@class='btn btn-black navbar-btn']";
        Assert.assertEquals(driver.getCurrentUrl(),url);

    }
}

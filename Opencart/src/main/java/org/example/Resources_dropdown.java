package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Resources_dropdown {
    WebDriver driver;

    @BeforeClass
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\naman\\IdeaProjects\\Opencart\\src\\main\\resources\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.opencart.com/");
        driver.manage().window().maximize();
    }

    @Test
    public void Verifying_Resources_dropdown() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(By.xpath("//header/nav[1]/div[1]/div[2]/ul[1]/li[6]/a[1]")).click();
        WebElement ul = driver.findElement(By.xpath("//ul[@class='dropdown-menu']"));

        List<WebElement> options = ul.findElements(By.tagName("li"));
        ArrayList<String> linkText = new ArrayList<>();
        for (int i = 0; i < options.size(); i++) {
            linkText.add(options.get(i).getText());
        }
        driver.findElement(By.xpath("//header/nav[1]/div[1]/div[2]/ul[1]/li[6]/a[1]")).click();
        int count = 0;
        for (int i = 0; i < linkText.size(); i++) {
            if (i == 4) {
                continue;
            }

                driver.findElement(By.xpath("//header/nav[1]/div[1]/div[2]/ul[1]/li[6]/a[1]")).click();
                Thread.sleep(1000);
                driver.findElement(By.linkText(linkText.get(i))).click();
                Thread.sleep(3000);
                driver.navigate().back();
                count++;
            }
        }
    }

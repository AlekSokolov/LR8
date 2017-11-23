package com.lingualeo;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import junit.framework.Assert;

import static com.thoughtworks.selenium.SeleneseTestNgHelper.assertEquals;

public class FirstTest {
    @Test
    public void firstTest() {
        System.setProperty("webdriver.chrome.driver", "D:/chromedriver_win32/chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        String appTitle = driver.getTitle();
        String expectedTitle = driver.getTitle();
        assertEquals(appTitle, expectedTitle);
        driver.get("http://lingualeo.com/ru");
        driver.findElement(By.xpath("//*[@id=\"headEnterBtn\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/div[1]/input")).sendKeys("alexsokolv91@gmail.com");
        driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/div[2]/input")).sendKeys("8zzzzzzzz");
        driver.findElement(By.xpath("//*[@id=\"loginForm\"]/button")).click();
        driver.findElement(By.xpath("//html/body/div[7]/div/div[2]/div/div[1]/span")).click();
        assertEquals(driver.getTitle(),"Мои задания");
        driver.findElement(By.className("menu-link-text"));
        driver.close();
    }

}




















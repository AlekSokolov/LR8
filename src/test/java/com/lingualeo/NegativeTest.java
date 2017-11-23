package com.lingualeo;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import junit.framework.Assert;
import org.openqa.selenium.chrome.ChromeDriver;
import static com.thoughtworks.selenium.SeleneseTestNgHelper.assertEquals;
public class NegativeTest  {
    @Test
    public void negativeTest() {
        System.setProperty("webdriver.chrome.driver", "D:/chromedriver_win32/chromedriver.exe");
        ChromeDriver driver1 = new ChromeDriver();
        driver1.get("http://lingualeo.com/ru");
        driver1.findElement(By.xpath("//*[@id=\"headEnterBtn\"]")).click();
        driver1.findElement(By.xpath("//*[@id=\"loginForm\"]/div/div[1]/input")).sendKeys("alexsokolv91@gmail.com");
        driver1.findElement(By.xpath("//*[@id=\"loginForm\"]/div/div[2]/input")).sendKeys("9zzzzzzzz");
        driver1.findElement(By.xpath("//*[@id=\"loginForm\"]/button")).click();



    }
}
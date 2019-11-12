package com.it;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MyTest {
    @Test
    public void test1() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver chromeDriver = new ChromeDriver();
        chromeDriver.manage().window().maximize();
        chromeDriver.get("https://www.i.ua/");
        Thread.sleep(2000);
        /*Assert.assertEquals("https://git-scm.com/", chromeDriver.getCurrentUrl());
        System.out.println("Test1");*/
        chromeDriver.findElement(By.name("login")).sendKeys("ittest2");
        chromeDriver.findElement(By.name("pass")).sendKeys("337774a");
        chromeDriver.findElement(By.xpath("//input[@tabindex='5']")).click();
        chromeDriver.quit();
        /*//ul[@class='sn_menu']/li[@class='sn_menu_item']/span[@class='sn_menu_title']*/
        String text = chromeDriver.findElement(By.xpath("ul[@class='sn_menu']/li[@class='sn_menu_item']/span[@class='sn_menu_title']")).getText();
        Assert.assertEquals(text, "ittest2@i.ua");
        chromeDriver.quit();
    }

}
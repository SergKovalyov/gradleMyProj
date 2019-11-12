package com.it.Tests;

import com.it.Pages.DashBordPage;
import com.it.Pages.LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MyTest extends BaseTest{
    @Test
    public void test1() /*throws InterruptedException*/
    {
        app.login.login("ittest2","337774a");

       /* System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.i.ua/");*/

        /*LoginPage loginPage = new LoginPage(*//*driver*//*);
        loginPage.login("ittest2","337774a");
        DashBordPage dashBordPage = new DashBordPage(*//*driver*//*);
        String imailUser = dashBordPage.getImailUser();
        Assert.assertEquals(imailUser, "ittest2@i.ua");*/
        //driver.quit();


       /* Thread.sleep(2000);
        *//*Assert.assertEquals("https://git-scm.com/", chromeDriver.getCurrentUrl());
        System.out.println("Test1");*//*
        chromeDriver.findElement(By.name("login")).sendKeys("ittest2");
        chromeDriver.findElement(By.name("pass")).sendKeys("337774a");
        chromeDriver.findElement(By.xpath("//input[@tabindex='5']")).click();
        chromeDriver.quit();
        //ul[@class='sn_menu']/li[@class='sn_menu_item']/span[@class='sn_menu_title']
        String text = chromeDriver.findElement(By.xpath("ul[@class='sn_menu']/li[@class='sn_menu_item']/span[@class='sn_menu_title']")).getText();
        Assert.assertEquals(text, "ittest2@i.ua");
        chromeDriver.quit();*/
    }

}
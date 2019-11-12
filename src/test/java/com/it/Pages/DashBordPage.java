package com.it.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashBordPage extends BasePage {
    @FindBy(xpath="ul[@class='sn_menu']/li[@class='sn_menu_item']/span[@class='sn_menu_title']")
    private WebElement lbUserImail ;

    public String getImailUser(){
        return lbUserImail.getText();
    }
    /*public DashBordPage(WebDriver driver) {
        PageFactory.initElements(driver, this);// инициализация*/
    }


package com.it.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage {
    @FindBy(name="login")
    private WebElement inputLogin;
    @FindBy(name="pass")
    private WebElement inputPassword;
    @FindBy(xpath="//input[@tabindex='5']")
    private WebElement btnsubmit;

    public void login(String login, String password) {
        inputLogin.sendKeys("ittest2");
        inputPassword.sendKeys("337774a");
        btnsubmit.click();
    }
    /*public LoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);// инициализация
    }*/

}

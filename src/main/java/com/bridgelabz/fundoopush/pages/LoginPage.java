package com.bridgelabz.fundoopush.pages;

import com.bridgelabz.fundoopush.base.Browser;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends Browser
{
    public LoginPage(WebDriver driver)
    {
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//input[@id='mat-input-0']")
    WebElement email;

    @FindBy(xpath = "")
    WebElement password;

    @FindBy(xpath = "//span[@class='mat-button-wrapper']")
    WebElement clickOnLoginBtn;

    public void setEmail(String emailId)
    {
        email.sendKeys(emailId);
    }

    public void setPassword(String password1)
    {
        password.sendKeys(password1);
    }

    public void clickOnLogin()
    {
        clickOnLoginBtn.click();
    }
}

package com.bridgelabz.fundoopush.model;

import com.bridgelabz.fundoopush.base.Browser;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Article extends Browser
{
    public Article()
    {
        PageFactory.initElements(driver,this);
    }

    @FindBy(id=" ")
    WebElement clickOnAdd;
}

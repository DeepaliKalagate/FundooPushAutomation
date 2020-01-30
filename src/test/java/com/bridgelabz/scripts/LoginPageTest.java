package com.bridgelabz.scripts;
import com.bridgelabz.fundoopush.base.Browser;
import com.bridgelabz.fundoopush.pages.LoginPage;
import org.testng.annotations.Test;

public class LoginPageTest extends Browser
{
    @Test(dataProvider = "loginData")
    public void loginTest(String email,String password)
    {
        LoginPage loginPage=new LoginPage(driver);
        loginPage.setEmail(email);
        loginPage.setPassword(password);
        loginPage.clickOnLogin();
    }
}

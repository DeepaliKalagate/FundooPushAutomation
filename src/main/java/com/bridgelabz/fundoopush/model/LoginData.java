package com.bridgelabz.fundoopush.model;
import com.bridgelabz.fundoopush.base.Browser;

public class LoginData extends Browser
{
   public String email;
   public String password;

    public LoginData(String email, String password)
    {
        this.email = email;
        this.password = password;
    }

    public String getEmail()
    {
        return email;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    public String getPassword()
    {
        return password;
    }

    public void setPassword(String password)
    {
        this.password = password;
    }

    @Override
    public String toString()
    {
        return "LoginPage{" +
                "email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}

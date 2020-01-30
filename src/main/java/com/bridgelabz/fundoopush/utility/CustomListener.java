package com.bridgelabz.fundoopush.utility;

import com.bridgelabz.fundoopush.base.Browser;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.IOException;

public class CustomListener extends Browser implements ITestListener
{
    Utility utility=new Utility();

    @Override
    public void onTestStart(ITestResult result)
    {
        try
        {
            utility.takeScreenshot();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    @Override
    public void onTestSuccess(ITestResult result)
    {
        try
        {
            utility.takeScreenshot();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    @Override
    public void onTestFailure(ITestResult result)
    {
        try
        {
            utility.takeScreenshot();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    @Override
    public void onTestSkipped(ITestResult result)
    {
        try
        {
            utility.takeScreenshot();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result)
    {
        try
        {
            utility.takeScreenshot();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    @Override
    public void onStart(ITestContext context)
    {
        try
        {
            utility.takeScreenshot();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    @Override
    public void onFinish(ITestContext context)
    {
        try
        {
            utility.takeScreenshot();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}

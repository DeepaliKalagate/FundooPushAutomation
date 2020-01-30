package com.bridgelabz.fundoopush.utility;

import com.bridgelabz.fundoopush.base.Browser;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class Utility extends Browser
{
    /**
     * For reading Json Data
     */
    


    /**
     * for take the screenshot
     */
    public void takeScreenshot() throws IOException
    {
        //Convert web driver object to TakeScreenshot
        TakesScreenshot takesScreenshot= (TakesScreenshot) driver;
        //Call getScreenshotAs method to create image file
        File sourceFile=takesScreenshot.getScreenshotAs(OutputType.FILE);
        Date date=new Date();
        File destinationFile = new File("screenshots.png"+date);
        FileUtils.copyFile(sourceFile, destinationFile);
    }
}

package com.forensicalpha.com.util;

import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.InputStream;
import java.util.Properties;

public class Setup {
    private String baseUrl;
    private WebDriver driver;
    private File file;
    private String testingMode;
    private String UserName;
    private String Password;


    public void setup(PropertyLoader propertiesFile, String browserName, String environment, String browserUrl)
    {
    String resultsFileName = "FAlpha";
    propertiesFile.loadProperties("FA.properties");
    Properties propEnvironment = propertiesFile.getProps();
    environment = (String) propEnvironment.get("envt");
    browserName = (String) propEnvironment.get("browserName");
    browserUrl = (String) propEnvironment.get("url");

    Browser browserun = new Browser();
    this.driver = browserun.createDriver(browserName);
    this.baseUrl =(String) propEnvironment.get(browserUrl);
    this.UserName = (String) propEnvironment.get("UserName");
    this.Password = (String) propEnvironment.get("Password");
    }
}

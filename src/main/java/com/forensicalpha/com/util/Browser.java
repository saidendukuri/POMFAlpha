package com.forensicalpha.com.util;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Browser {

    public WebDriver createDriver(String browserName) {
        String s = browserName.toUpperCase();
        if (s.equals("CHROME")) {
            ChromeOptions options = new ChromeOptions();
            options.addArguments( "--start-maximized");
            WebDriver driver = WebDriverManager.chromedriver().create();
           return driver;
    }
        return null;
    }

}

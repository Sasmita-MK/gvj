package com.example.Testcases;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.example.util.ReadConfig;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
    ReadConfig config = new ReadConfig();
    String url = config.getUrl();
    String userName = config.getUsername();
    String password = config.getPassword();
    WebDriver driver;
    Logger log;
    @BeforeClass
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        log = Logger.getLogger(BaseClass.class);
        PropertyConfigurator.configure("C:\\Users\\91701\\Desktop\\it sckcet\\softwareTesting-1\\hybridframework\\src\\main\\java\\com\\example\\resources\\log4j.properties");
    }
    @AfterClass
    public void quitDriver() {
        driver.quit();
    }
}

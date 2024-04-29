package com.example.Testcases;

import org.testng.annotations.Test;

import com.example.PageObject.LoginFile;

public class LoginTest extends BaseClass {
    @Test
    public void login() throws InterruptedException{
        driver.get(url);
        Thread.sleep(10000);
        log.info("URL opened");
        LoginFile l = new LoginFile(driver);
        l.setUserName(userName);
        log.info("username entered");
        l.setPassword(password);
        log.info("password entered");
        l.clickButton();
        log.info("Button clicked");
    }
}

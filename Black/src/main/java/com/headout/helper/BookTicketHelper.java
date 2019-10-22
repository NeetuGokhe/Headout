package com.headout.helper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BookTicketHelper {

    public WebDriver getDriver() {
        System.out.println("Execution Starts");
        // Setting chrome driver property and opening chrome browser
        System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
        WebDriver driver= new ChromeDriver();

        System.out.println("Browser opened.");
        return driver;
    }
}

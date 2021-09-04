package Utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver {

    /**
     *      Why we are creating driver class?
     *
     *          Because we need to use 1 driver for every class in our project(step definitions and page classes)
     *
     *          This concept is called singleton driver
     *
     */

    private static WebDriver driver;

    public static WebDriver getDriver() {
        // if the driver is == null then create a new driver
        if (driver == null) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        }
        return driver;
    }


    public static void quitDriver(){
        if(driver != null){
            driver.quit();
            driver = null; // if we don't have this line next scenario will fail - NoSuchSessionException
        }
    }


}

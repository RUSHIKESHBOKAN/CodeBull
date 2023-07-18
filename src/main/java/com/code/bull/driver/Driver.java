package com.code.bull.driver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeSuite;

public class Driver {


    public static String browser = System.getProperty("browser");

    private static String env = System.getProperty("env");

    private static WebDriver driver;

    @BeforeSuite
    public void setup(){

      envsetup();
      browser();

    }

    private void envsetup(){

        if(env.equalsIgnoreCase("sit")){

            env = "SIT";
        } else if (env.equalsIgnoreCase("uat")) {

            env = "UAT";
        } else if (env.equalsIgnoreCase("prod")) {

            env = "Prod";
        }
        else {

            env = "SIT";
        }

    }

    private void browser(){

        try{

            switch (browser){
                case "chrome":

                    WebDriverManager.chromedriver().setup();
                    break;

                case "firefox":

                    driver = new FirefoxDriver();

                    driver.manage().window().maximize();

                default:
                    break;
            }
        }
        catch (Exception ex){

            System.out.println(ex.getMessage());
        }
    }

}
// ""
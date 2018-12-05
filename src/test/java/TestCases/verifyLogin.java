package TestCases;

import Base.TestBase;
import Pages.Login;
import Pages.Navigation_menu;
import Utility.utility;
import Utility.utility_methods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static Base.TestBase.driver;
import static Base.TestBase.initn;
import static Base.TestBase.prop;

public class verifyLogin {

    Login log;

    public verifyLogin() {
        super();

    }

    /**
     * will perform initial Browser based setting
     */
    @BeforeMethod
    public void Setup() {

        TestBase.setProp();
        TestBase.initn();
       //log=new Login(TestBase.getDriver());
        log=new Login(TestBase.returnInstance().returnDriver());
    }

    /**
     * will fetch the data from  property file
     */
    @Test
    public void loginTest(){
      Login l=new Login();
     // l.login();

      l.login(prop.getProperty("username"),prop.getProperty("password"));
    }




}
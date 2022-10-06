package testRunner;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.Title;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pageSteps.FlightBookingSteps;
import pageSteps.RegisterPageSteps;

@RunWith(SerenityRunner.class)
public class FlightTest {


    @Steps
    RegisterPageSteps registerPageSteps;

    @Steps
    FlightBookingSteps flightBookingSteps;
    @Managed
    WebDriver driver;

    @Title("login and booking tickets sucessfully and logout")
    @Test
    public void validating() throws InterruptedException {


        registerPageSteps.isOnDemoPage();
        flightBookingSteps.enter_username();
        flightBookingSteps.enterPwd();
        flightBookingSteps.submit();
      /*  WebElement Frame1 = driver.findElement(By.xpath("//iframe[@id='google_ads_iframe_/24132379/INTERSTITIAL_DemoGuru99_0']"));
        driver.switchTo().frame(Frame1);
        WebElement Frame2 = driver.findElement(By.xpath("//iframe[@id='ad_iframe']"));
        driver.switchTo().frame(Frame2);*/
        flightBookingSteps.clickingbBtn();
        flightBookingSteps.addblocking();
        Thread.sleep(4000);
        flightBookingSteps.radioBtn();
        flightBookingSteps.drop1();
        flightBookingSteps.drop2();
        flightBookingSteps.drop3();
        flightBookingSteps.drop4();
        flightBookingSteps.drop5();
        flightBookingSteps.drop6();
        flightBookingSteps.drop7();
        flightBookingSteps.clickingbtn1();
        flightBookingSteps.dropdown();
        flightBookingSteps.continuebutton();


    }

    private WebElement $(String s) {
        return null;
    }
}


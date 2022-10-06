package pages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class FlightBookingPage extends PageObject {

    public void enterUsername()  {


        find(By.name("userName")).type("sai");

    }
    public void enterPassword() {
        find(By.name("password")).type("sai@2020");

    }
    public void submitBtn(){
        find(By.name("submit")).click();
    }
    public void clickFlightButton(){
        $("//a[text()='Flights']").click();

    }
    public void addBlock(){
        $("//span[text()='Close']").click();
    }
    public void radiobutton(){
        WebElement element,element1;
        element1= $("(//input[@name='tripType'])[1]");
        element=  $("(//input[@name='tripType'])[2]");

        if(element1.isEnabled()){
            element1.click();
        }
        element.click();
    }
    public void selectPassengers(){
        $("//select[@name='passCount']").selectByVisibleText("2 ");
    }
    public void selectDeparture(){
        $("//select[@name='fromPort']").selectByVisibleText("London");
    }
    public void selectMonth(){
        $("//select[@name='fromMonth']").selectByVisibleText("September");

    }
    public void selectDate(){
        $("//select[@name='fromDay']").selectByVisibleText("8");
    }
    public void selectArrival(){
        $("//select[@name='toPort']").selectByVisibleText("Sydney");
    }
    public void selectReturnMonth(){
        $("//select[@name='toMonth']").selectByVisibleText("October");
    }
    public void selectReturnDate(){
        $("//select[@name='toDay']").selectByVisibleText("7");
    }
    public void clickServiceClass(){
        $("(//input[@name='servClass'])[3]").click();
    }
    public void selectAirline(){
        $("//select[@name='airline']").selectByVisibleText("Blue Skies Airlines");
    }
    public void selectContinue(){
        $("//input[@name='findFlights']").click();
    }

}



package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class FlightBookingE2E {

    public static void main(String[] args) throws InterruptedException {

        WebDriver d = new ChromeDriver();
        d.manage().window().maximize();
        d.get("https://rahulshettyacademy.com/dropdownsPractise/");


        //Selecting One way
        d.findElement(By.id("ctl00_mainContent_rbtnl_Trip_0"));



        //handling Origin and Destination:
        d.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
        d.findElement(By.xpath("//a[@value='MAA']")).click();
        Thread.sleep(2000);
        d.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='BLR']")).click();


        //Handling Calendar:
        d.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-hover")).click();     //current date will be selected(special class=> highlight)


        //Validating if UI Elements are disabled or enabled with Attribute:

        if(d.findElement(By.id("Div1")).getAttribute("style").contains("0.5")) {
            System.out.println("Is disabled !");
            Assert.assertTrue(true);                                  //important step
        }
        else {
            System.out.println("Is enabled !");
            Assert.assertFalse(false);                              //Important Step

        }


        //For passengers
        d.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();
        d.findElement(By.id("divpaxinfo")).click();
        Thread.sleep(2000);
        for(int i=1; i<=4;i++) {
            d.findElement(By.id("hrefIncAdt")).click();
        }
        d.findElement(By.id("btnclosepaxoption")).click();
        Assert.assertEquals(d.findElement(By.id("divpaxinfo")).getText(), "5 Adult");
        System.out.println(d.findElement(By.id("divpaxinfo")).getText());  //to get how many adult pax selected



        //Dropdown with Select Tag
        WebElement staticDropdown = d.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
        Select dropdown = new Select(staticDropdown);	    //Select Class Needs WebElement object to perform select methods.
        dropdown.selectByIndex(1);



        //Search
        //	d.findElement(By.cssSelector("#ctl00_mainContent_btn_FindFlights"));
        d.findElement(By.cssSelector("input[value='Search']")).click();
        //	d.findElement(By.xpath("//input[@value='Search']")).click();
        //	d.findElement(By.name("ctl00$mainContent$btn_FindFlights"));
        //  d.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
    }

}

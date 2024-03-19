package Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;


class StaticInSelenium{
    public   String getPassword(WebDriver driver) throws InterruptedException {
        driver.get("https://rahulshettyacademy.com/locatorspractice/");
        driver.findElement(By.linkText("Forgot your password?")).click();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("button.reset-pwd-btn")).click();

        System.out.println(driver.findElement(By.cssSelector("form p")).getText());

        //String passwordText = driver.findElement(By.cssSelector("form p")).getText();

        String passwordText = driver.findElement(By.xpath("//form/p")).getText();

        // Please use temporary password 'rahulshettyacademy' to Login.

        String passwordArray [] = passwordText.split("'");
        //arr[0] =Please use temporary password
        // arr[1] =rahulshettyacademy' to Login.

        String password = passwordArray[1].split("'")[0];
        return password;

    }

}




public class Locators2 {




    public static void main(String[] args) throws InterruptedException {

        String name = "Aditya Gupta";


        System.setProperty("webdriver.chromedriver", "D/chromedriver-win64.exe");

        WebDriver driver = new ChromeDriver();

        StaticInSelenium sis = new StaticInSelenium();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));      //synchronization    //something to show-driver should wait when searching for an element

        String password = sis.getPassword(driver);

        driver.get("https://rahulshettyacademy.com/locatorspractice/");

        driver.findElement(By.id("inputUsername")).sendKeys(name);

        driver.findElement(By.name("inputPassword")).sendKeys(password);

        driver.findElement(By.className("signInBtn")).click();

        Thread.sleep(2000); //wait until new page is opened and then find the text...

        System.out.println(driver.findElement(By.tagName("p")).getText());

        Assert.assertEquals(driver.findElement(By.tagName("p")).getText(), "You are successfully logged in.");      //Under TestNg  //validations or checkpoints for an application

        Assert.assertEquals(driver.findElement(By.cssSelector("div[class='login-container'] h2")).getText(), "Hello "+ name + "," );

        System.out.println(driver.findElement(By.cssSelector("div[class='login-container'] h2")).getText());

        Assert.assertEquals(driver.findElement(By.cssSelector("div[class='login-container'] h2")).getText(), "Hello " + "Aditya Gupta"+",");

        driver.findElement(By.xpath("//button[text()='Log Out']")).click();             //For finding text using Xpath

        // driver.findElement(By.xpath("//*[text()='Log Out']")).click();                //line 68 be written as...

        driver.close();




    }


}

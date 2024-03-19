package Selenium;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPageE2E {

    public static String getPassword(WebDriver driver) throws InterruptedException {

        driver.get("https://rahulshettyacademy.com/locatorspractice/");
        driver.findElement(By.linkText("Forgot your password?")).click();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("button.reset-pwd-btn")).click();

        System.out.println(driver.findElement(By.cssSelector("form p")).getText());

        //String passwordText = driver.findElement(By.cssSelector("form p")).getText();

        String passwordText = driver.findElement(By.xpath("//form/p")).getText();

        // Please use temporary password 'rahulshettyacademy' to Login.

        String passwordArray[] = passwordText.split("'");
        //arr[0] =Please use temporary password
        // arr[1] =rahulshettyacademy' to Login.

        String password = passwordArray[1].split("'")[0];
        return password;


    }

    public static void main(String[] args) throws InterruptedException {

        //implicit wait - 5 sec timeout

        System.setProperty("webdriver.chromedriver", "D/chromedriver-win64.exe");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));      //synchronization    //something to show-driver should wait when searching for an element

        String password = getPassword(driver);

        driver.get("https://rahulshettyacademy.com/locatorspractice/");

        driver.findElement(By.id("inputUsername")).sendKeys("Aditya Gupta");

        driver.findElement(By.name("inputPassword")).sendKeys("Aditya@12");

        driver.findElement(By.className("signInBtn")).click();

        System.out.println(driver.findElement(By.cssSelector("p.error")).getText());

        driver.findElement(By.linkText("Forgot your password?")).click();

        Thread.sleep(1000);   //something to get stable

        driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Aditya Gupta");

        driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("ag@aditya.com");

        driver.findElement(By.xpath("//input[@type='text'][2]")).clear();

        //	driver.findElement(By.xpath("//input[@type='text'][2]")).sendKeys("ag@adityagupta.com");                     //using xpath when same attributes with multiple index

        driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).sendKeys("ag@adityagupta.com");        //using css when same attributes with multiple index

        driver.findElement(By.xpath("//form/input[3]")).sendKeys("99999999990");                                     //when we dont know the attributes and know the parent tags to child tags traverse

        driver.findElement(By.cssSelector("button.reset-pwd-btn")).click();

        System.out.println(driver.findElement(By.cssSelector("form p")).getText());

        //driver.findElement(By.cssSelector("button.go-to-login-btn")).click();

        driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]")).click();         //another way of line 48

        //driver.findElement(By.cssSelector("button.go-to-login-btn")).click();

        Thread.sleep(1000);

        driver.findElement(By.cssSelector("#inputUsername")).sendKeys("Aditya Gupta");

        driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys(password);

        driver.findElement(By.id("chkboxOne")).click();

        driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click() ;

        driver.close();


    }

}

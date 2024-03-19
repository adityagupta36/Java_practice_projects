package SelPrax;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class Assignment2 {
    public static void main(String[] args) {


        WebDriver d = new ChromeDriver();

        d.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));

        d.get("https://rahulshettyacademy.com/angularpractice/");

        d.findElement(By.xpath("//div[@class='form-group'] //input[@name='name']")).sendKeys("Aditya Gupta");
        d.findElement(By.xpath("//div[@class='form-group'] //input[@name='email']")).sendKeys("ABC@Gmail.com");
        d.findElement(By.xpath("//div[@class='form-group'] //input[@type='password']")).sendKeys("Password@000");
        d.findElement(By.xpath("//div[@class='form-check'] //input[@type='checkbox']")).click();

        WebElement element = d.findElement(By.xpath("//div[@class='form-group'] //select[@class='form-control']"));
        Select s = new Select(element);
        s.selectByIndex(1);

        d.findElement(By.xpath("//input[@class='form-check-input'] [@id='inlineRadio2']")).click();
        d.findElement(By.xpath("//input[@class='form-control'] [@type='date']")).sendKeys("30-12-1997");
        d.findElement(By.xpath("//input[@class='btn btn-success']")).click();
        System.out.println(d.findElement(By.xpath("//div[contains(@class,'alert-success')]")).getText());
    }
}

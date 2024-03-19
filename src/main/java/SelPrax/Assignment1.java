package SelPrax;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.time.Duration;
import java.util.List;

public class Assignment1 {
    public static void main(String[] args) {

        WebDriver d = new ChromeDriver();
        d.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
        d.get("https://rahulshettyacademy.com/AutomationPractice/");



        d.findElement(By.xpath("//input [@value='option1']")).click();
        System.out.println(d.findElement(By.xpath("//input [@value='option1']")).isSelected());

        d.findElement(By.xpath("//input [@value='option1']")).click();
        System.out.println(d.findElement(By.xpath("//input [@value='option1']")).isSelected());


        List<WebElement> list = d.findElements(By.xpath("//div[@class='right-align'] //fieldset //label"));
        System.out.println(list.size());

        //***********************************************************************************************************//
        System.out.println( d.findElements(By.xpath("//input[@type='checkbox']")).size());



    }
}

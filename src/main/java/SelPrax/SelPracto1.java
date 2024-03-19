package SelPrax;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.time.Duration;
import java.util.List;


public class SelPracto1 {

    public static String setPassword(WebDriver d) throws InterruptedException {
        System.out.println(d.findElement(By.xpath("//form/p")).getText());
        String p = d.findElement(By.xpath("//form/p")).getText();
        String [] a =  p.split("'");
        System.out.println(a[1]);
        String pass = a[1];
        return pass;

    }
    public static void main(String[] args) throws InterruptedException {



        System.setProperty("webdriver.chromedriver","D:\\chromedriver-win64");

        WebDriver d = new ChromeDriver();
        d.manage().window().maximize();
        d.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        /* d.get("https://rahulshettyacademy.com/locatorspractice/");
       d.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("guptaaditya9728@gmail.com");
        d.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("abcdef");
        d.findElement(By.xpath("//input[@type='checkbox']")).click();
        d.findElement(By.xpath("//input[@id='chkboxTwo']")).click();
        d.findElement(By.xpath("//button[@class='submit signInBtn']")).click();
        System.out.println(d.findElement(By.xpath("//p[@class='error']")).getText());
        d.findElement(By.xpath("//a[text()='Forgot your password?']")).click();
        Thread.sleep(5000);
        d.findElement(By.xpath("//input[@type='text' and @placeholder='Name']")).sendKeys("Aditya Gupta");
        d.findElement(By.xpath("//input[@type='text' and @placeholder='Email']")).sendKeys("guptaaditya9728@gmail.com");
        d.findElement(By.xpath("//input[@type='text' and @placeholder='Phone Number']")).sendKeys("9999999999");
        d.findElement(By.xpath("//button[@class='reset-pwd-btn']")).click();

       String Password =  setPassword(d);

        d.findElement(By.xpath("//div/button[text()='Go to Login']")).click();
        Thread.sleep(2000);
        d.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("guptaaditya9728@gmail.com");
        d.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(Password);

        d.findElement(By.xpath("//button[@class='submit signInBtn']")).click();
        Thread.sleep(2000);
        System.out.println(d.findElement(By.xpath("//div/p")).getText());*/


        d.navigate().to("https://rahulshettyacademy.com/dropdownsPractise/");
        WebElement element = d.findElement(By.xpath("//select[@name='ctl00$mainContent$DropDownListCurrency']"));

        Select s = new Select(element);
        s.selectByIndex(3);
        System.out.println(s.getFirstSelectedOption().getText());

        s.selectByValue("INR");
        System.out.println(s.getFirstSelectedOption().getText());

        s.selectByVisibleText("AED");
        System.out.println(s.getFirstSelectedOption().getText());

        d.findElement(By.xpath("//div[@id='divpaxinfo']")).click();
        Thread.sleep(2000);



       for (int i=1; i<=4 ;i++){
            d.findElement(By.xpath("//span[@id='hrefIncAdt']")).click();
        }
        d.findElement(By.xpath("//input[@id='btnclosepaxoption']")).click();
        System.out.println(d.findElement(By.xpath("//div[@id='divpaxinfo']")).getText());

        Assert.assertEquals(d.findElement(By.xpath("//div[@id='divpaxinfo']")).getText(), "5 Adult");

        Assert.assertTrue(d.findElement(By.xpath("//div[@id='divpaxinfo']")).isDisplayed());
        System.out.println(d.findElement(By.xpath("//div[@id='divpaxinfo']")).isDisplayed());
//        Assert.assertFalse(d.findElement(By.xpath("//div[@id='divpaxinfo']")).isDisplayed());

//        Assert.assertTrue(true);
//        Assert.assertFalse(false);

        d.navigate().to("https://rahulshettyacademy.com/dropdownsPractise/");
        d.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();
        d.findElement(By.xpath("//a[@value='BLR']")).click();
        Thread.sleep(1000);
        d.findElement(By.xpath("  //div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();



        Thread.sleep(2000);
        d.findElement(By.xpath("(//a[@class='ui-state-default'] [text()='5']) [1]")).click();


/*
        Assert.assertTrue(d.findElement(By.xpath("//div[@id='Div1' and contains(@style,'0.5')]")).isEnabled());

        d.findElement(By.xpath("//label[@for='ctl00_mainContent_rbtnl_Trip_1']")).click();

        Assert.assertTrue(d.findElement(By.xpath("//div[@id='Div1' and contains(@style,'1')]")).isEnabled());
*/
        Assert.assertTrue(d.findElement(By.xpath("//div[@id='Div1']")).getAttribute("style").contains("0.5"));
        System.out.println("0.5");
        Assert.assertFalse( d.findElement(By.xpath("//label[@for='ctl00_mainContent_rbtnl_Trip_1']")).isSelected());
        d.findElement(By.xpath("//label[@for='ctl00_mainContent_rbtnl_Trip_1']")).click();
        Thread.sleep(5000);
//        Assert.assertFalse( d.findElement(By.xpath("//label[@for='ctl00_mainContent_rbtnl_Trip_1']")).isSelected());       //Should be Assert true
        Assert.assertTrue(d.findElement(By.xpath("//div[@id='Div1']")).getAttribute("style").contains("1"));
        System.out.println("1");




        d.findElement(By.xpath("//input[@id='autosuggest']")).sendKeys("in");

        List<WebElement> e = d.findElements(By.xpath("//ul/li[@class='ui-menu-item'] //a"));
        System.out.println(e.size());

        String str = "india";

/*        for (int i=0; i<=e.size() ; i++){
            if (e.get(i).getText().equalsIgnoreCase(str)){
                e.get(i).click();
                break;
            }
        }*/


       for(WebElement ee : e){
           if(ee.getText().equalsIgnoreCase("india")){
               ee.click();
               break;

           }
       }


       List <WebElement> list = d.findElements(By.xpath("//div[@id='discount-checkbox'] /div //input"));
        System.out.println(list.size());



        System.out.println(d.findElements(By.xpath("//div[@id='discount-checkbox'] /div //input")).size());
        Assert.assertFalse( d.findElement(By.xpath("//input[contains(@id,'SeniorCitizenDiscount')]")).isSelected());
        d.findElement(By.xpath("//input[contains(@id,'SeniorCitizenDiscount')]")).click();
        Assert.assertTrue(d.findElement(By.xpath("//input[contains(@id,'SeniorCitizenDiscount')]")).isSelected());
        Assert.assertTrue(d.findElement(By.xpath("(//span[@class='text-label'])[1]")).isEnabled());



        d.navigate().to("https://rahulshettyacademy.com/AutomationPractice/");
        d.findElement(By.xpath("//input[@id='alertbtn']")).click();
        Thread.sleep(1000);
        System.out.println(d.switchTo().alert().getText());
        d.switchTo().alert().accept();
        d.findElement(By.xpath("//input[@id='confirmbtn']")).click();
        System.out.println(d.switchTo().alert().getText());
        d.switchTo().alert().dismiss();







    }
}

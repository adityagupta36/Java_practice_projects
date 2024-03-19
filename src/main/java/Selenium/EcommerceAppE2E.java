package Selenium;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EcommerceAppE2E { // ASKED IN AMAZON

	public static void addItems(ArrayList expectedProd, WebDriver d, WebDriverWait exwait) throws InterruptedException {

		List<WebElement> products = d.findElements(By.cssSelector("h4[class='product-name']"));

		int j = 0;

		for (int i = 0; i <= products.size() - 1; i++) {

			// 1)format/trim it to get actual vegetable name
			// 2)Create ArrayList to find the products we need/extracted from web
			// element-texts are there in Expected Product ArrayList

			String[] name = products.get(i).getText().split("-"); // VIMP: getting Text of that element
			Thread.sleep(3000);
			String formattedName = name[0].trim();

			if (expectedProd.contains(formattedName)) {
				j++;
				System.out.println("Product Selected : " + formattedName + " @index = " + i);

				// Add to cart
				// d.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click(); //
				// avoid this line
				d.findElements(By.xpath("//div[@class='product-action']//button[text()='ADD TO CART']")).get(i).click(); // use
				// this
				// to
				// take
				// exact
				// location
				// of
				// the
				// element

				// -> Dont use break; directly here....since it will terminate the loop

				if (j == expectedProd.size()) {
					break;
				}
			}

		}

		d.findElement(By.xpath("//img[@alt='Cart']")).click();
		d.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click(); // *[text()='PROCEED TO CHECKOUT']
		// can also be used

		exwait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input.promoCode")));

		d.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");
		d.findElement(By.cssSelector("button.promoBtn")).click();
		// explicit wait
		exwait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.promoInfo")));

		System.out.println(d.findElement(By.cssSelector("span.promoInfo")).getText());
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver d = new ChromeDriver();

		WebDriverWait exwait = new WebDriverWait(d, Duration.ofSeconds(5));
		// FluentWait<T> exwait = new WebDriverWait(d, Duration.ofSeconds(5));

		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		d.manage().window().maximize();

		// Expected Products Array:
		ArrayList<String> expectedProd = new ArrayList<String>();
		expectedProd.add("Cucumber");
		expectedProd.add("Brocolli");
		expectedProd.add("Brinjal");

		d.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		Thread.sleep(3000);

		addItems(expectedProd, d, exwait); // can be called w/o creating Object. For this we need to make the method
		// static

		System.exit(0);

	}

}

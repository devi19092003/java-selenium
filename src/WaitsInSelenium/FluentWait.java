package WaitsInSelenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.function.Function;

public class FluentWait {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\LENOVO\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");

        //setting timeframe :-

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
        // driver.manage().timeouts().implicitlyWait(Duration.ofDays(1));

        WebElement element = driver.findElement(By.xpath("//input[@title='Sign in']"));

        WebDriverWait webDriverWait = new WebDriverWait(driver,Duration.ofSeconds(50));

        webDriverWait.until(ExpectedConditions.elementToBeClickable(element)).click();

        Wait<WebDriver> fluentWait = new org.openqa.selenium.support.ui.FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(50))
                .pollingEvery(Duration.ofSeconds(5))
                .ignoring(Exception.class);

        fluentWait.until(new Function<WebDriver, WebElement>() {
            public WebElement apply (WebDriver driver1){
                return element;
            }
        });


        Alert alert = driver.switchTo().alert();
        alert.accept();

        Thread.sleep(3000);

        driver.quit();
    }


}

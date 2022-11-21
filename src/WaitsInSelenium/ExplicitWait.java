package WaitsInSelenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ExplicitWait {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\LENOVO\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");

        //setting timeframe :-

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        // driver.manage().timeouts().implicitlyWait(Duration.ofDays(1));

        WebElement element = driver.findElement(By.xpath("//input[@title='Sign in']"));

        WebDriverWait webDriverWait = new WebDriverWait(driver,Duration.ofSeconds(20));

        webDriverWait.until(ExpectedConditions.elementToBeClickable(element)).click();

        Alert alert = driver.switchTo().alert();
        alert.accept();

        Thread.sleep(5000);

        driver.quit();
    }


}

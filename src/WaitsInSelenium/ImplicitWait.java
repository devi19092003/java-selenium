package WaitsInSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ImplicitWait {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\LENOVO\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://demo.automationtesting.in/Register.html");

        //setting timeframe :-

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
       // driver.manage().timeouts().implicitlyWait(Duration.ofDays(1));

        WebElement element = driver.findElement(By.id("submitbtn"));


        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].scrollIntoView();",element );



        Thread.sleep(3000);

        driver.close();
    }

}

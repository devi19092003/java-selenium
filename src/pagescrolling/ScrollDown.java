package pagescrolling;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollDown {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\LENOVO\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
        driver.get("https://demo.automationtesting.in/Register.html");

        Thread.sleep(3000);

        WebElement element = driver.findElement(By.id("submitbtn"));


        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].scrollIntoView();",element );

        // js.executeScript("window.scrollBy(0,550)");

      //  js.executeScript("window.scrollTo(0, document.body.scrollHeight);");


        Thread.sleep(3000);

        driver.close();
    }

}

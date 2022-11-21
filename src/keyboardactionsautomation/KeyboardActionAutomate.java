package keyboardactionsautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardActionAutomate {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\LENOVO\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");

        WebElement userName = driver.findElement(By.id("login1"));

        Actions actions = new Actions(driver);

        actions.moveToElement(userName);

        actions.keyDown(Keys.SHIFT).sendKeys("digital partners").keyUp(Keys.SHIFT).build().perform();

        Thread.sleep(3000);

        driver.close();
    }
}

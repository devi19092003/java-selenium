package pagescrolling;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollUp {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\LENOVO\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");

        Thread.sleep(3000);

        JavascriptExecutor js = (JavascriptExecutor)driver;
        //js.executeScript("window.scrollBy(0,1000)");

        js.executeScript("window.scrollTo(0, document.body.scrollHeight);");

        Thread.sleep(3000);

        //js.executeScript("window.scrollBy(0,-1000)");

        js.executeScript("window.scrollTo(0, -document.body.scrollHeight);");


        Thread.sleep(3000);

        driver.close();
    }

}

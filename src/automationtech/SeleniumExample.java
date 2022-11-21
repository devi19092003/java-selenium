package automationtech;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class SeleniumExample {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\LENOVO\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.facebook.com");
        Thread.sleep(3000);
        driver.close();

       System.setProperty("webdriver.edge.driver","C:\\Users\\LENOVO\\Downloads\\edgedriver_win64\\msedgedriver.exe");
       WebDriver driver1 = new EdgeDriver();
       driver1.get("http://www.facebook.com");
       Thread.sleep(3000);
       driver1.close();

       // ChromeDriver driver1 = new ChromeDriver();

    }

}

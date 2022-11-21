package SSLCertificateHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HandleSSLCertificate {

    public static void main(String[] args) throws InterruptedException {

       ChromeOptions chromeOptions = new ChromeOptions();
        //chromeOptions.setHeadless(true);
         chromeOptions.setAcceptInsecureCerts(true);

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.get("https://expired.badssl.com/");

        String title = driver.getTitle();
        System.out.println(title);

       String text = driver.findElement(By.id("content")).getText();
        System.out.println(text);

        Thread.sleep(5000);

        driver.quit();
    }

}

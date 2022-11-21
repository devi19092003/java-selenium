package iframes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class IframeExample2 {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/frames");

        List<WebElement> iframeElement = driver.findElements(By.tagName("iframe"));
        System.out.println(iframeElement.size());

       // WebElement element = driver.findElement(By.xpath("//h1[@id='sampleHeading']"));

        driver.switchTo().frame(driver.findElement(By.xpath("//h1[@id='sampleHeading']")));

        //driver.switchTo().frame(5);

       // driver.switchTo().frame("frame1");

        //driver.findElement(By.id("sampleHeading"));

        String s = driver.findElement(By.id("sampleHeading")).getText();

        System.out.println(s);



     //   Thread.sleep(3000);
        driver.close();

    }

}

package alertautomation;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConfirmAlert {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\LENOVO\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://courses.letskodeit.com/practice");

        WebElement textBox = driver.findElement(By.id("name"));
        textBox.sendKeys("digital partners");

        WebElement confirmBtn = driver.findElement(By.id("confirmbtn"));
        confirmBtn.click();

        Thread.sleep(3000);

        Alert alert = driver.switchTo().alert();
        //alert.accept();
        alert.dismiss();

        driver.close();
    }
}

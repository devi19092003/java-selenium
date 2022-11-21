package SeleniumMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelected {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\LENOVO\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://courses.letskodeit.com/practice");

        WebElement radioBtn = driver.findElement(By.id("bmwradio"));
        System.out.println("Before Selection "+ radioBtn.isSelected());

        radioBtn.click();
        System.out.println("After Selection "+radioBtn.isSelected());

        Thread.sleep(3000);

        driver.close();
    }
}

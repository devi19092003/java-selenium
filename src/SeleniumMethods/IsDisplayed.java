package SeleniumMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayed {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\LENOVO\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://courses.letskodeit.com/practice");

        WebElement showBtn = driver.findElement(By.id("show-textbox"));
        showBtn.click();

        WebElement textBox = driver.findElement(By.id("displayed-text"));
        System.out.println(textBox.isDisplayed());

        WebElement hideBtn = driver.findElement(By.id("hide-textbox"));
        hideBtn.click();

        Thread.sleep(3000);

        System.out.println(textBox.isDisplayed());

        Thread.sleep(3000);

        driver.close();
    }
}

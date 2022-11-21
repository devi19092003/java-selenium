package dropdownautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultipleDropDownAuto {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\LENOVO\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://selenium08.blogspot.com/2019/11/dropdown.html");

        WebElement multipleDropDown = driver.findElement(By.name("Month"));

        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].scrollIntoView();",multipleDropDown);

        Select select = new Select(multipleDropDown);

        select.selectByIndex(2);
        select.selectByIndex(3);
        select.selectByIndex(4);
        select.selectByIndex(5);

        select.selectByValue("Nov");
        select.selectByVisibleText("January");

        Thread.sleep(3000);

        select.deselectByIndex(3);
        select.deselectByValue("Nov");
        select.deselectByVisibleText("January");

        Thread.sleep(3000);

        select.deselectAll();

        Thread.sleep(3000);

        driver.close();
    }
}

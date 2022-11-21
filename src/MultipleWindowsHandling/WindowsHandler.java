package MultipleWindowsHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class WindowsHandler {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\LENOVO\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://demo.automationtesting.in/Windows.html");

        driver.findElement(By.xpath("//button[text()='    click   ']")).click();

        String parentWindow = driver.getWindowHandle();

        Set<String> childWindow = driver.getWindowHandles();

        System.out.println(parentWindow);
        System.out.println(childWindow);

        Thread.sleep(3000);

        for(String s : childWindow){
            if(!parentWindow.contentEquals(s)){

                driver.switchTo().window(s);
                System.out.println(driver.getTitle());
                driver.close();
            }
            driver.switchTo().window(parentWindow);
        }

        Thread.sleep(3000);

        driver.close();

        // driver.quit();
    }
}

package cookieHandling;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class Cookiess {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://courses.letskodeit.com/practice");

        Cookie cookie = new Cookie("Digital","Partners");
        driver.manage().addCookie(cookie);

        Set<Cookie> allCookies = driver.manage().getCookies();

        for(Object o : allCookies){
            System.out.println(o);
        }

        System.out.println("------------------------------------------------");

        Cookie getCookiesByName = driver.manage().getCookieNamed("Digital");
        //System.out.println(getCookiesByName);

        driver.manage().deleteCookie(getCookiesByName);

        Set<Cookie> allCookiess = driver.manage().getCookies();

        for(Object o : allCookiess){
            System.out.println(o);
        }

        System.out.println("------------------------------------------------");

        driver.manage().deleteAllCookies();

        Set<Cookie> allCookiesss = driver.manage().getCookies();

        for(Object o : allCookiesss){
            System.out.println(o);
        }

        System.out.println("------------------------------------------------");


       // Thread.sleep(3000);
        driver.quit();
    }
}

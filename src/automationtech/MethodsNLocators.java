package automationtech;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class MethodsNLocators {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\LENOVO\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //get method :- you can open link
        //driver.get("http://www.facebook.com");

        //navigate method :- you can open link
        driver.navigate().to("https://mail.rediff.com/cgi-bin/login.cgi");
       // driver.navigate().forward();
      //  driver.navigate().back();

        //getTitle method :- used to get title of the website
        //System.out.println(driver.getTitle());

        //getPageSource method :- source code of the page is returned
        //System.out.println(driver.getPageSource());

        //getCurrentUrl method :- used to fetch url of any page
        //System.out.println(driver.getCurrentUrl());

        //1st locator :- Id
       // WebElement userName = driver.findElement(By.id("login1"));
        //userName.sendKeys("devi1909");

        //providing wrong id :-
       // WebElement userName = driver.findElement(By.id("logindesf"));
       // userName.sendKeys("devi1909");

        //2nd Locator :- LinkText
        //WebElement forgotPassword = driver.findElement(By.linkText("Forgot Password?"));
        //forgotPassword.click();

        //3rd Locator :- ClassName

        //providing wrong class name
       /* List<WebElement> createNewAccount = driver.findElements(By.className("dtdtfugiuh"));
        Thread.sleep(3000);

        for(WebElement e : createNewAccount){
            System.out.println(e);
        }*/

      /*  List<WebElement> createNewAccount = driver.findElements(By.className("create-new-account"));
        Thread.sleep(3000);

        for(WebElement e : createNewAccount){
            System.out.println(e);
        }*/

        //4th Locator :- name
       /* WebElement userName = driver.findElement(By.name("login"));
        userName.sendKeys("devi1909");
        Thread.sleep(3000);*/

       //5th Locator :- partialLinkText
        /*WebElement forgotPassword = driver.findElement(By.partialLinkText("Forgot"));
        forgotPassword.click();*/

       //6th Locator :- tagName

        //for input tag :-
      /* List<WebElement> inputTag = driver.findElements(By.tagName("input"));
        for(WebElement element : inputTag){
            System.out.println(element);
        }*/

      // for div tag :-
      /* List<WebElement> divTag = driver.findElements(By.tagName("div"));
        for(WebElement element : divTag){
            System.out.println(element);
        }*/

      //7th Locator :- css selector

        //by id
       /* WebElement userName = driver.findElement(By.cssSelector("input[id='login1']"));
        userName.sendKeys("devi1909");*/

        /*WebElement userName = driver.findElement(By.cssSelector("input#login1"));
        userName.sendKeys("devi1909");*/

       //by attribute
       // WebElement userName = driver.findElement(By.cssSelector("div[class='cell'"));

        //WebElement userName = driver.findElement(By.cssSelector("div.cell"));


     //   userName.sendKeys("devi1909");

       /* List<WebElement> userName = driver.findElements(By.id("loginhi"));
        System.out.println("Size of array "+userName.size());
        for(WebElement element : userName) {
            System.out.println(element);
        }*/

        Thread.sleep(3000);

        driver.close();
    }

}

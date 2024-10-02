package SeleniumTest;

import com.google.errorprone.annotations.Var;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginAutomation {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.navigate().to("https://www.saucedemo.com/");

        WebElement usrName = driver.findElement(By.id("user-name"));
        usrName.sendKeys("standard_user");

        WebElement paswrd = driver.findElement(By.id("password"));
        paswrd.sendKeys("secret_sauce");

        WebElement clklogin = driver.findElement(By.id("login-button"));
        clklogin.submit();

        System.out.println("welcome to the Dashboard Standard User");
    }
}

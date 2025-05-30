import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.sql.Driver;
import java.util.List;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");

        WebElement webElement = driver.findElement(By.linkText("Dropdown"));
        webElement.click();
        Thread.sleep(5000);

        WebElement webElement1 = driver.findElement(By.id("dropdown"));
        Select select = new Select(webElement1);
        select.selectByValue("1");


        Thread.sleep(5000);
        driver.quit();
    }
}


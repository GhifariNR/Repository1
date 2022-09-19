import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertTrue;

public class seleniumTest {
    @Test
    public void firstTest()throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://saucedemo.com");

        driver.findElement(By.id("user-name")).sendKeys("Karim");
        driver.findElement(By.id("password")).sendKeys("Karim");
        driver.findElement(By.id("login-button")).click();

        Thread.sleep(7000);

        WebElement cobacari=driver.findElement(By.xpath("//div[@class=\"error-message-container error\"]"));
        assertTrue(cobacari.isDisplayed());
        driver.quit();

    }
    @Test
    public void secondTest() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://profile.w3schools.com/log-in?redirect_url=https%3A%2F%2Fmy-learning.w3schools.com");

        driver.findElement(By.xpath("//*[@id=\"modalusername\"]")).sendKeys("danang.nugroho@telkom.co.id");
        driver.findElement(By.xpath("//*[@id=\"current-password\"]")).sendKeys("Karim123");
        driver.findElement(By.xpath("//button[@class=\"Button_button__URNp+ Button_primary__d2Jt3 Button_fullwidth__0HLEu\"]")).click();

        Thread.sleep(7000);

        WebElement cobacari2=driver.findElement(By.xpath("//div[@class=\"Alert_iwrp__5q1xH Alert_danger__Wsdhv\"]"));
        assertTrue(cobacari2.isDisplayed());
        driver.quit();
    }
}

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.junit.Test;


public class TestCases {
    @Test
    public void fill_form() {
        System.setProperty("webdriver.chrome.driver", "/Users/oscarrodriguez/Documents/prueba pragma/Prueba_pragma/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/");
        driver.manage().window().setSize(new Dimension(1428, 1200));
        driver.findElement(By.cssSelector(".card:nth-child(1) svg")).click();
        driver.findElement(By.cssSelector(".show #item-0 > .text")).click();
        driver.findElement(By.id("userName")).click();
        driver.findElement(By.id("userName")).sendKeys("alsdkfj");
        driver.findElement(By.id("userEmail")).click();
        driver.findElement(By.id("userEmail")).sendKeys("asdf");
        driver.findElement(By.id("currentAddress")).click();
        driver.findElement(By.id("currentAddress")).sendKeys("asdf");
        driver.findElement(By.id("permanentAddress")).click();
        driver.findElement(By.id("permanentAddress")).sendKeys("asdf");
        driver.findElement(By.id("submit")).click();
        driver.quit();
    }
}
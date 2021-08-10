import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class FirstTest {

    WebDriver driver;

    @BeforeEach
    void setUp()
    {
    driver = new ChromeDriver();
    }

     @AfterEach
    void teardown()
    {
    driver.quit();
    }

    @Test
    public void test1()
    {
        System.out.println("Test Started");
        driver.get("http://google.com");
        driver.findElement(By.cssSelector("[title='Search']")).sendKeys("Selenium" + Keys.ENTER);
        //String Str = (driver.findElement(By.tagName("h3")).getText().split(" ")[0]);
        String Str = (driver.findElement(By.tagName("h3")).getText().split(" ")[0]).substring(0,8);
        Assertions.assertEquals("Selenium",Str);

    }
}

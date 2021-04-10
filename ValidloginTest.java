// Generated by Selenium IDE
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
public class ValidloginTest {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Before
  public void setUp() {
    driver = new ChromeDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  @After
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void validlogin() {
    // Test name: valid_login
    // Step # | name | target | value
    // 1 | open | https://twitter.com/ | 
    driver.get("https://twitter.com/");
    // 2 | setWindowSize | 697x768 | 
    driver.manage().window().setSize(new Dimension(697, 768));
    // 3 | click | linkText=Masuk | 
    driver.findElement(By.linkText("Masuk")).click();
    // 4 | click | name=session[username_or_email] | 
    driver.findElement(By.name("session[username_or_email]")).click();
    // 5 | type | name=session[username_or_email] | zulava
    driver.findElement(By.name("session[username_or_email]")).sendKeys("zulava");
    // 6 | click | name=session[password] | 
    driver.findElement(By.name("session[password]")).click();
    // 7 | type | name=session[password] | Mahatma35
    driver.findElement(By.name("session[password]")).sendKeys("Mahatma35");
    // 8 | click | css=.css-1dbjc4n:nth-child(2) > form .css-18t94o4 > .css-901oao | 
    driver.findElement(By.cssSelector(".css-1dbjc4n:nth-child(2) > form .css-18t94o4 > .css-901oao")).click();
    // 9 | runScript | window.scrollTo(0,100) | 
    js.executeScript("window.scrollTo(0,100)");
    // 10 | runScript | window.scrollTo(0,1288) | 
    js.executeScript("window.scrollTo(0,1288)");
    // 11 | runScript | window.scrollTo(0,661) | 
    js.executeScript("window.scrollTo(0,661)");
    // 12 | runScript | window.scrollTo(0,1561) | 
    js.executeScript("window.scrollTo(0,1561)");
    // 13 | runScript | window.scrollTo(0,2653) | 
    js.executeScript("window.scrollTo(0,2653)");
    // 14 | runScript | window.scrollTo(0,0) | 
    js.executeScript("window.scrollTo(0,0)");
    // 15 | click | css=.r-i49rur | 
    driver.findElement(By.cssSelector(".r-i49rur")).click();
    // 16 | mouseOver | css=.css-1dbjc4n:nth-child(1) > .css-1dbjc4n:nth-child(2) > .css-1dbjc4n:nth-child(1) > .css-1dbjc4n:nth-child(1) > .css-1dbjc4n:nth-child(1) > .css-4rbku5:nth-child(1) .css-9pa8cd:nth-child(2) | 
    {
      WebElement element = driver.findElement(By.cssSelector(".css-1dbjc4n:nth-child(1) > .css-1dbjc4n:nth-child(2) > .css-1dbjc4n:nth-child(1) > .css-1dbjc4n:nth-child(1) > .css-1dbjc4n:nth-child(1) > .css-4rbku5:nth-child(1) .css-9pa8cd:nth-child(2)"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    // 17 | mouseOut | css=.css-1dbjc4n:nth-child(4) > .css-1dbjc4n:nth-child(1) > .css-1dbjc4n:nth-child(1) > .css-1dbjc4n:nth-child(1) > .css-1dbjc4n:nth-child(1) > .css-1dbjc4n:nth-child(1) > .css-1dbjc4n:nth-child(2) > .css-1dbjc4n:nth-child(1) > .css-1dbjc4n:nth-child(1) > .css-1dbjc4n:nth-child(1) > .css-4rbku5:nth-child(1) .css-9pa8cd:nth-child(2) | 
    {
      WebElement element = driver.findElement(By.tagName("body"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element, 0, 0).perform();
    }
    // 18 | click | css=.r-obd0qt > .r-1fmj7o5 circle:nth-child(2) | 
    driver.findElement(By.cssSelector(".r-obd0qt > .r-1fmj7o5 circle:nth-child(2)")).click();
    // 19 | click | css=.css-4rbku5 > .css-1dbjc4n > .css-901oao > .css-901oao > .css-901oao | 
    driver.findElement(By.cssSelector(".css-4rbku5 > .css-1dbjc4n > .css-901oao > .css-901oao > .css-901oao")).click();
    // 20 | click | css=.css-18t94o4:nth-child(2) > .css-901oao > .css-901oao > .css-901oao | 
    driver.findElement(By.cssSelector(".css-18t94o4:nth-child(2) > .css-901oao > .css-901oao > .css-901oao")).click();
  }
}

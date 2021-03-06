import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class MOOD950444T3Test {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @BeforeClass(alwaysRun = true)
  public void setUp() throws Exception {
    driver = new FirefoxDriver();
    baseUrl = "https://www.katalon.com/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testMOOD950444T3() throws Exception {
    new MOOD950444T3();
    System.out.println("Hello World");
    driver.get("https://www.google.com/");
    driver.findElement(By.name("q")).clear();
    driver.findElement(By.name("q")).sendKeys("it");
    // ERROR: Caught exception [unknown command [sendKeys]]
    driver.findElement(By.name("q")).click();
    driver.findElement(By.name("q")).clear();
    driver.findElement(By.name("q")).sendKeys("it");
    // ERROR: Caught exception [unknown command [sendKeys]]
    // ERROR: Caught exception [unknown command [sendKeys]]
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Web results'])[1]/following::h3[1]")).click();
  }

  @AfterClass(alwaysRun = true)
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }
}

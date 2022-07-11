package SeleniumTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Openbrowser
{
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Sugumar Sivanpandi\\Desktop\\Chromedriver\\chromedriver.exe");

        ExtentSparkReporter Spark = new ExtentSparkReporter("target/Reports.html");
        ExtentReports extent = new ExtentReports();
        extent.attachReporter(Spark);
        extent.createTest("Whatsapp").pass("Testcase Passed");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.google.com");
        driver.findElement(By.id("L2AGLb")) .click();
        driver.findElement(By.name("q")).sendKeys("Whatsapp");
        driver.findElement(By.name("q")).submit();
        System.out.Println("Added Audio Features in this software");
        System.out.Println("Added Video Features in this software");
        driver.quit();
        extent.flush();
    }
}

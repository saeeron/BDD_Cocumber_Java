package StepDefinitions.StepDefinitionsWithHooks;

import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class SomeSteps {
    static WebDriver driver = null;

    @Before(order = 1)
    public static void browserSetup(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.manage().window().maximize();
    }

    @After(order = 1)
    public static void tearDown(){
        driver.close();
        driver.quit();
    }



    @Given("google.com is browsed")
    public void google_com_is_browsed() {
        driver.get("https://www.google.com/");

    }
    @When("google enters a text")
    public void google_enters_a_text() {
        driver.findElement(By.name("q")).sendKeys("barcelona spain", Keys.ENTER);

    }

    @Then("user is navigated to search results")
    public void user_is_navigated_to_search_results() {
        assert driver.getPageSource().contains("Wikipedia");
    }

}

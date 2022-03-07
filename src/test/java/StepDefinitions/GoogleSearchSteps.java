package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchSteps {

    WebDriver driver;

    @Given("google.com is browsed")
    public void google_com_is_browsed() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.google.com/");

    }
    @When("google enters a text")
    public void google_enters_a_text() {
        driver.findElement(By.name("q")).sendKeys("barcelona spain", Keys.ENTER);

    }
    @Then("user is navigated to search results")
    public void user_is_navigated_to_search_results() {
        assert driver.getPageSource().contains("Wikipedia");
        driver.close();
        driver.quit();
    }

}

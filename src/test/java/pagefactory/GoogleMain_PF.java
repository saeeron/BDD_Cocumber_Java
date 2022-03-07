package pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleMain_PF {

    @FindBy(name = "q")
    WebElement searchbox;

    WebDriver driver;
    public GoogleMain_PF(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, GoogleMain_PF.class);
    }
}

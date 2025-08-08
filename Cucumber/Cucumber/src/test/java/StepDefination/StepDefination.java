package StepDefination;

import Hooks.SetUp;
import io.cucumber.java.en.*;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class StepDefination {
    WebDriver driver = SetUp.driver;
    @Given("Open saucedemo application")
    public void open_saucedemo_application() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\acer\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");
    }
//    @When("Enter valid crdentails")
//    public void enter_valid_crdentails() {
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
//        driver.findElement(By.id("user-name")).sendKeys("standard_user");
//        driver.findElement(By.id("password")).sendKeys("secret_sauce");
//        driver.findElement(By.id("login-button")).click();
//    }

//    @When("Enter valid password")
//    public void enterValidPassword() {
//        driver.findElement(By.id("password")).sendKeys("secret_sauce");
//    }
//@When("Enter valid username")
//public void enterValidUsername() {
//    driver.findElement(By.id("user-name")).sendKeys("standard_user");
//}
//
//    @When("Enter invalid password")
//    public void enterInvalidPassword() {
//        driver.findElement(By.id("password")).sendKeys("rr");
//    }

    @When("Enter valid username")
    public void enterValidUsername() {
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
    }

    @When("Enter a invalid password")
    public void enterInvalidPassword() {
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
    }
    @Then("Verify Error message")
    public void verifyErrorMessage() {
        WebElement error=driver.findElement(By.xpath("//h3[@data-test='error']"));
        error.isDisplayed();
    }

    @When("Enter valid username {string}")
    public void enterValidPassword(String username) {
        driver.findElement(By.id("user-name")).sendKeys(username);
    }

    @When("Enter valid password {string}")
    public void enterInvalidPassword(String password) {
        driver.findElement(By.id("password")).sendKeys(password);
    }



//
//    @When("Enter valid password {string}")
//    public void enterValidPassword(String password) {
//        driver.findElement(By.id("user-name")).sendKeys(password);
//    }
//
//    @When("Enter valid username {string}")
//    public void enterValidUsername(String username) {
//        driver.findElement(By.id("user-name")).sendKeys(username);
//    }

//    @When("Enter valid username {string}")
//    public void enterValidUsername(String username) {
//        driver.findElement(By.id("user-name")).sendKeys(username);
//    }
//
//    @When("Enter valid password {string}")
//    public void enterValidPassword(String password) {
//        driver.findElement(By.id("password")).sendKeys(password);
//    }
    @And("click on OK")
    public void clickOnOK() {
        driver.findElement(By.id("login-button")).click();
    }
    @Then("Verify Swag Lab text on saucedemo login page")
    public void verify_swag_lab_text_on_saucedemo_login_page() {
        WebElement text = driver.findElement(By.xpath("//div[text()='Swag Labs']"));
        Assertions.assertTrue(text.isDisplayed());
    }

    @And("Close window")
    public void closeWindow() {
        driver.close();
    }

    @When("Enter a valid password")
    public void enterAValidPassword() {
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
    }

    @Then("Verify cart logo message")
    public void verifyCartLogoMessage() {
        WebElement logo = driver.findElement(By.xpath("//a[@class='shopping_cart_link']"));
        Assertions.assertTrue(logo.isDisplayed());
    }

//    @When("Enter a valid username {string}")
//    public void enterValidUsernameStandard_user(String username)  {
//        driver.findElement(By.id("user-name")).sendKeys(username);
//}



}

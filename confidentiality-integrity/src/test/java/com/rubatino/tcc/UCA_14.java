package com.rubatino.tcc;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.*;

public class UCA_14 {
    private WebDriver driver;

    @Before
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
    }

    @Given("username is valid and password is valid")
    public void usernameIsValidPasswordIsValid(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);

        driver.get("http://localhost:8080");

        WebElement loginButton = driver.findElement(By.id("login-button"));
        loginButton.click();

        WebElement username = driver.findElement(By.name("username"));
        WebElement password = driver.findElement(By.name("password"));
        username.sendKeys("user@email.com");
        password.sendKeys("senha123");
        WebElement login = driver.findElement(By.id("login-button"));
        login.click();
    }
    @When("Authenticator not provided fetch role")
    public void autenticadorNotProvidedSolicitarRole() {
        driver.get("http://localhost:8080");
        WebElement mock = mock(WebElement.class);
        verifyNoInteractions(mock);
    }
    @Then("Authenticator must provided fetch role when username is valid and password is valid")
    public void providedRequestRole(){
        WebElement mock = mock(WebElement.class);
        driver.get("http://localhost:8080");
        WebElement user = driver.findElement(By.id("user"));
        user.click();
        String currentUrl = driver.getCurrentUrl();
        assertThat(currentUrl).isEqualTo("http://localhost:8080/home-user");
        verifyNoMoreInteractions(mock);
        driver.quit();
    }
}

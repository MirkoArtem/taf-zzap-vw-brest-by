package by.brest.vw.zzap.taf.po;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class LoginPage {
    WebDriver driver;
    private By nickNameInput = By.xpath("//*[@id='login_modal']");
    private By passwordInput = By.xpath("//*[@id='pass_modal']");
    private By loginButton = By.xpath("//*[@id='go_modal']");
    private By loginFormHeader = By.xpath("//div[@class='auth-form__title auth-form__title_big auth-form__title_condensed-default']");
    private By errorMessage = By.xpath("//*[@id='lgnform_modal']/div[3]");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }
    public void typeNickNameInput(String nickname) {driver.findElement(nickNameInput).sendKeys(nickname);}

    public void typePasswordInput(String password) {
        driver.findElement(passwordInput).sendKeys(password);
    }

    public void clickLoginButton() {
        driver.findElement(loginButton).click();
    }
    public String getErrorMessageText(){
        return driver.findElement(errorMessage).getText();
    }


}

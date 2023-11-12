package by.brest.vw.zzap.taf.po;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    WebDriver driver;
    private By nickNameInput = By.xpath("//*[@id='login_modal']");
    private By passwordInput = By.xpath("//*[@id='pass_modal']");
    private By loginButton = By.xpath("//*[@id='go_modal']");
    private By errorMessage = By.xpath("//*[@id='lgnform_modal']/div[3]");
    private By clientName = By.xpath("//*[@id='logInModal']/span");

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
    public String getClientName(){
        return driver.findElement(clientName).getText();
    }


}

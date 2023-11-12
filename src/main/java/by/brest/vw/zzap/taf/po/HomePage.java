package by.brest.vw.zzap.taf.po;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
    private WebDriver driver;
    private String loginButton = "//a[@class = 'logButton']";
    private String copyright = "//div[@class = 'fr-col-xs-12 fr-col-sm-5 footCopy']";
    private String searchLine = "//input[@id = 'pcode']";
    private String searchSubmit = "//button[@type = 'submit']";

    public HomePage(WebDriver driver){ this.driver = driver; }

    public void clickLoginButton(){
        WebElement loginButtonElement = driver.findElement(By.xpath(loginButton));
        loginButtonElement.click();
    }
    public String getCopyright() {
        WebElement copyrightTextElement = driver.findElement(By.xpath(copyright));
        return copyrightTextElement.getText();
    }
    public void clickSearchLine(){
        WebElement searchLineElement = driver.findElement(By.xpath(searchLine));
        searchLineElement.click();
    }
    public void clickSearchSubmit(){
        WebElement searchSubmitElement = driver.findElement(By.xpath(searchSubmit));
        searchSubmitElement.click();
    }
    public void typePartNumber(){
        WebElement typePertNumberElement = driver.findElement(By.xpath(searchLine));
        typePertNumberElement.sendKeys("SPP3011");
    }
}

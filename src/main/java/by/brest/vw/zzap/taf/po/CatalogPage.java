package by.brest.vw.zzap.taf.po;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CatalogPage {
    private WebDriver driver;
    private String basketButton = "//*[@id='searchResultsTable']/tbody/tr[2]/td[12]/div/div/div/button/span";
    private By partInBasketSubmit = By.xpath("//*[@id='ui-tooltip-0-content']");

    public CatalogPage(WebDriver driver) {this.driver = driver;}

    public void clickBasketButton() {
        WebElement clickBasketButtonElement = driver.findElement(By.xpath(basketButton));
        clickBasketButtonElement.click();
    }
    public String getPartInBasketSubmit(){
        return driver.findElement(partInBasketSubmit).getText();
    }
}

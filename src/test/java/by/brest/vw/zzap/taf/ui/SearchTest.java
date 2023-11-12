package by.brest.vw.zzap.taf.ui;
import by.brest.vw.zzap.taf.po.CatalogPage;
import by.brest.vw.zzap.taf.po.HomePage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.concurrent.TimeUnit;

public class SearchTest extends BaseTestForSearchTest{

    @Test
    public void testFindPartNumberInCatalog(){
        HomePage homePage = new HomePage(driver);
        homePage.clickSearchLine();
        homePage.typePartNumber();
        homePage.clickSearchSubmit();
        CatalogPage catalogPage = new CatalogPage(driver);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        catalogPage.clickBasketButton();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        String expectedResult = "Товар добавлен в корзину";
        String actualResult = catalogPage.getPartInBasketSubmit();
        Assertions.assertEquals(expectedResult, actualResult);
    }

}

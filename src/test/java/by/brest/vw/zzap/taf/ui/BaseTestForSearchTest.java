package by.brest.vw.zzap.taf.ui;
import by.brest.vw.zzap.taf.po.HomePage;
import by.brest.vw.zzap.taf.po.LoginPage;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTestForSearchTest {
    WebDriver driver;
    @BeforeEach
    public void driverSetup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://zzap.vw-brest.by/");
    }
    @BeforeEach
    public void testLoginWithCorrectEmailAndPassword(){
        HomePage homePage = new HomePage(driver);
        homePage.clickLoginButton();
        LoginPage loginPage = new LoginPage(driver);
        loginPage.typeNickNameInput("aikmir64@gmail.com");
        loginPage.typePasswordInput("QAZwsx123");
        loginPage.clickLoginButton();
        String expectedResult = "Мирко Артём";
        String actualResult = loginPage.getClientName();
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @AfterEach
    public void driverShutDown() {
        driver.quit();
    }
}

package by.brest.vw.zzap.taf.ui;
import by.brest.vw.zzap.taf.po.HomePage;
import by.brest.vw.zzap.taf.po.LoginPage;
import by.brest.vw.zzap.taf.utils.Util;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LoginPageTest extends BaseTest {
    @Test
    public void testLoginWithRandomNickAndRandomPassword(){
        HomePage homePage = new HomePage(driver);
        homePage.clickLoginButton();
        LoginPage loginPage = new LoginPage(driver);
        loginPage.typeNickNameInput(Util.generateNickname(8));
        loginPage.typePasswordInput(Util.generatePassword());
        loginPage.clickLoginButton();
        String expectedResult = "Неверный логин/пароль!";
        String actualResult = loginPage.getErrorMessageText();
        Assertions.assertEquals(expectedResult, actualResult);
    }
    @Test
    public void testLoginWithCorrectEmailAndRandomPassword() {
        HomePage homePage = new HomePage(driver);
        homePage.clickLoginButton();
        LoginPage loginPage = new LoginPage(driver);
        loginPage.typeNickNameInput("aikmir64@gmail.com");
        loginPage.typePasswordInput(Util.generatePassword());
        loginPage.clickLoginButton();
        Assertions.assertEquals("Неверный логин/пароль!", loginPage.getErrorMessageText());
    }
    @Test
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
}

package by.brest.vw.zzap.taf.ui;

import by.brest.vw.zzap.taf.po.HomePage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HomeTest extends BaseTest {
    @Test
    public void testHomePageOpened() {
        HomePage homePage = new HomePage(driver);
        String actualCopywriterText = homePage.getCopyright();
        String extendsCopywriterText = "© 2023, Все права защищены.\n" +
                "Интернет-магазин запчастей.";
        Assertions.assertEquals(extendsCopywriterText, actualCopywriterText);
    }
}

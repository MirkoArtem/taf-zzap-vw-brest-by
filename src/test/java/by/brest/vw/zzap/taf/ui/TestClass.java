package by.brest.vw.zzap.taf.ui;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestClass {
    @Test
    public void checkWebDriverOpenURL() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://zzap.vw-brest.by/");
    }
}

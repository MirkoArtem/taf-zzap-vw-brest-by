package by.brest.vw.zzap.taf.api;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.when;

public class BaseUrlTest {
    @Test
    public void testBaseUrl() {
        when().get("https://zzap.vw-brest.by/").then().statusCode(200);
    }
}

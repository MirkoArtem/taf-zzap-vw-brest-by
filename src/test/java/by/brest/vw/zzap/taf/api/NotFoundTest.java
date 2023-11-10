package by.brest.vw.zzap.taf.api;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.when;

public class NotFoundTest {
    @Test
    public void notFoundTest(){
        when().get("https://zzap.vw-brest.by/notfound").then().statusCode(404);
    }
}

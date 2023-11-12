package by.brest.vw.zzap.taf.api;
import org.junit.jupiter.api.Test;
import static io.restassured.RestAssured.given;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LoginTest {
    @Test
    public void shouldSuccessfullyLogin() {
        String response = given()
                .contentType("multipart/form-data")
                .multiPart("login", "aikmir64@gmail.com")
                .multiPart("pass", "QAZwsx123")
                .header("Connection", "keep-alive")
                .header("Accept-Encoding", "gzip, deflate, br")
                .header("Accept", "*/*")
                .header("User-Agent", "PostmanRuntime/7.35.0")
                .when()
                .post("https://zzap.vw-brest.by/")
                .then().statusCode(200)
                .extract().body().asPrettyString();

        assertTrue(response.contains("Мирко Артём"));
    }
}
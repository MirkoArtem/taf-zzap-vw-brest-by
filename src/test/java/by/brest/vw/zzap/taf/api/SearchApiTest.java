package by.brest.vw.zzap.taf.api;
import io.restassured.RestAssured;
import org.junit.jupiter.api.Test;
import static org.hamcrest.Matchers.equalTo;

public class SearchApiTest {
    @Test
    public void shouldSuccessfullyFindPartNumber() {
        String searchProductNumber = "spp3011";
        String searchProductId = "pcode";

        RestAssured
                .given()
                .header("Content-Type", "multipart/form-data")
                .header("Content-Lenght", "167")
                .header("Host","zzap.vw-brest.by")
                .param("pcode", searchProductNumber)
                .when().get("https://zzap.vw-brest.by/search/?pcode=spp3011")
                .then()
                .assertThat()
                .body("value", equalTo(searchProductNumber));
    }
}

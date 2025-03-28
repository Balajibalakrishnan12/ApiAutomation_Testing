import static org.testng.Assert.assertEquals;

import java.net.Authenticator.RequestorType;

import org.junit.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class JavaProgram1 {

	public void getRequest() {
	
		//step1 Request-Method,resources url,parameters,body,headers,authorization
		//Get Method- resource URl, parameter,send request
		RestAssured.baseURI="https://gorest.co.in/public";//it is a property
		//RequestSpecification request= RestAssured
		Response response= RestAssured
				.given().queryParam("gender", "female")//only for readablity
				.queryParam("id",7795710 )
				.when()//we will say what method 
				.get("/v2/users")
				.then()
				.extract().response();//method chaining 
		System.out.println(response.getBody().asPrettyString());
		//Step2 Response-Status code,Response payload(body),Response headers(transaction id will be check if required)

	}
	//@Test
	public void putRequest() {
		RestAssured.baseURI="https://reqres.in/";//it is a property
		//RequestSpecification request= RestAssured
		Response response= RestAssured
				.given()//only for readablity
				.body("{\r\n"
						+ "    \"name\": \"morpheus\",\r\n"
						+ "    \"job\": \"zion resident\"\r\n"
						+ "}")
				.when()//we will say what method 
				.put("/api/users/2")
				.then()
				.extract().response();//method chaining 
		System.out.println(response.getBody().asPrettyString());
	}
	//@Test
	public void postRequest() {
		RestAssured.baseURI="https://reqres.in/";//it is a property
		//RequestSpecification request= RestAssured
		Response response= RestAssured
				.given()//only for readablity
				.body("{\r\n"
						+ "    \"name\": \"morpheus\",\r\n"
						+ "    \"job\": \"zion resident\"\r\n"
						+ "}")
				.when()//we will say what method 
				.post("/api/users")
				.then()
				.extract().response();//method chaining 
		System.out.println(response.getBody().asPrettyString());
	}
	@Test
	public void deleteRequest() {
		RestAssured.baseURI="https://reqres.in/";//it is a property
		//RequestSpecification request= RestAssured
		Response response= RestAssured
				.given()//only for readablity
				.when()//we will say what method 
				.delete("/api/users/2")
				.then()
				.extract().response();//method chaining 
		System.out.println(response.getBody().asPrettyString());
		System.out.println(response.statusCode());
		assertEquals(204, response.statusCode());
	}
}

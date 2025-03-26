import java.net.Authenticator.RequestorType;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class JavaProgram1 {

	public static void main(String[] args) {
	
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

}

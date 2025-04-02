package automation;

import static io.restassured.RestAssured.given;

import org.junit.Test;

public class AuthenticationTesting {
	String token ="";
	
		//@Test
		public void getRequest() {
			String responsebody=
					given()
						.baseUri("https://api.github.com")
						.auth()
						.oauth2(token)
						
					.when()
						.get("/users/Balajibalakrishnan12/repos")
					.then()//validation
						
						.extract()
						.response().body().asString();
					
			System.out.println(responsebody);	
	}
		//@Test
		public void postRequest() {
			String responsebody=
					given()
						.baseUri("https://api.github.com")
						.auth()
						.oauth2(token)
						.contentType("application/json")
						.body("{\n" +  
				                "\"name\": \"my-new-repository\",\n" +
				                "\"description\": \"This is a test repository.\"\n" +
				            "}")
					.when()
						.post("/user/repos")
					.then()//validation
						
						.extract()
						.response().body().asString();
					
			System.out.println(responsebody);	
		}
		@Test
		public void patchRequest() {
			String responsebody=
					given()
						.baseUri("https://api.github.com")
						.auth()
						.oauth2(token)
						.contentType("application/json")
						.body("{\n" +  
				                "\"name\": \"Apiupdated-repository\",\n" +
				                "\"description\": \"This is an updated test repository.\"\n" +
				            "}")
					.when()
						.patch("/repos/Balajibalakrishnan12/my-new-repository")
					.then()//validation
						.statusCode(200)
						.extract()
						.response().body().asString();
					
			System.out.println(responsebody);	
			
		}
		//@Test
		public void deleteRequest() {
			String responsebody=
					given()
						.baseUri("https://api.github.com")
						.auth()
						.oauth2(token)	
					.when()
						.delete("/repos/Balajibalakrishnan12/Apiupdated-repository")
					.then()//validation
						.statusCode(204)
						.extract()
						.response().body().asString();
					
			System.out.println(responsebody);
			
		}
}



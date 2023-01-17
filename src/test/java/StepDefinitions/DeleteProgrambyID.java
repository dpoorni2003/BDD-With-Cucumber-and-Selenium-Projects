package StepDefinitions;

import io.cucumber.java.en.*;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import static io.restassured.RestAssured.given;
import static org.testng.Assert.ARRAY_MISMATCH_TEMPLATE;

public class DeleteProgrambyID {
	
	private static String BASE_URL="http://lms-backend-service.herokuapp.com/lms";
	Response response;
	boolean isAPIHit = false;

	@Given("^The end point of API with base URL$")
	public void the_end_point_of_api_with_base_url() {
		RestAssured.baseURI=BASE_URL;
		System.out.println("Inside Given method");	
		System.out.println("BaseURL:"+RestAssured.baseURI);
	}

	@When("^Program ID is entered$")
	public void program_id_is_entered() {
			System.out.println("Inside When method");
			RestAssured.requestSpecification = given();
			response = RestAssured.requestSpecification.when()
			 .delete("/deletebyprogid/5988").then().extract().response();
							 
System.out.println("response value:"+response.asPrettyString());
System.out.println("response code:"+response.getStatusCode());
System.out.println("response code:"+given().request().toString());
	}

	@And("^Click on Delete or Send button$")
	public void click_on_delete_or_send_button() {
		System.out.println("Inside And method");
		
		if (response.getStatusCode()==200){
			String responsebody=response.getBody().asPrettyString();
			System.out.println("ResponseBody of the Delete request"+ responsebody);	
			isAPIHit = true;
			System.out.println("isAPIHit:"+isAPIHit);

		}else
			System.out.println("Delete by Program ID is not success. Error code : " +response.getStatusCode()) ;
		
	}

	@Then("^Return the success response code and delete the program$")
	public void return_the_success_response_code_and_delete_the_program() {
		System.out.println("Inside Delete method");
		int statuscode=response.getStatusCode();
		System.out.println(statuscode);
				
	}


}

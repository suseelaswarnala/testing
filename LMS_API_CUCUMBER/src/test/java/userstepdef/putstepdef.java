package userstepdef;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class putstepdef {
		
	@Given("User set PUT API endpoint")
	public void user_set_put_api_endpoint() {
			}

	@When("User add an existing programid  with new programName,new programDescription and new online status")
	public void user_add_an_existing_programid_with_new_program_name_new_program_description_and_new_online_status() {
			}

	@Then("User should receive a valid status code in response")
	public void user_should_receive_a_valid_status_code_in_response() {
		
	}

	
	@When("User enters an none existing program Id,valid program name,valid program description,valid online status")
	public void user_enters_an_none_existing_program_id_valid_program_name_valid_program_description_valid_online_status() {
			}

	@Then("User should receive Status should be 400 Bad Request")
	public void user_should_receive_status_should_be_bad_request() {
		
	}

	@When("User enters  null programID,valid program name,valid program description,valid online status")
	public void user_enters_null_program_id_valid_program_name_valid_program_description_valid_online_status() {
		
	}

	@Then("User recieves status 400 Bad Request")
	public void user_recieves_status_Bad_request() {
		 
			}

	@When("User specifies an existing programid as alphanumeric  with new programName,new programDescription and new online field")
	public void user_specifies_an_existing_programid_as_alphanumeric_with_new_program_name_new_program_description_and_new_online_field() {
			}

	@Then("User receives 405 Method not allowed message")
	public void user_receives_Method_not_allowed_message() {
		
	}

	@When("User enters an  existing program Id,valid new program name,valid program description,valid online status")
	public void user_enters_an_existing_program_id_valid_new_program_name_valid_program_description_valid_online_status() {
		
	}
	@Then("User should receive a status 200 OK message")
	public void user_should_receive_a_status_ok_message() {
		
	}

	@When("User enter an existing program Id,valid  program name,alphanumeric  program description,valid online status")
	public void user_enter_an_existing_program_id_valid_program_name_alphanumeric_program_description_valid_online_status() {
		
	}

	@Then("User should receive a valid status 200 code in response")
	public void user_should_receive_a_valid_status_in_response() {
			}
	
	

}

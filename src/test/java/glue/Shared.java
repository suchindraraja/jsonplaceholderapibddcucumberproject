package glue;

import org.json.JSONObject;

import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Shared
{
	//Create global properties
	RequestSpecification req;
	Response res;
	Scenario s;
	JsonPath jp;
	JSONObject jo;
	
	@Before
	public void method(Scenario s)
	{
		this.s=s;
	}
}

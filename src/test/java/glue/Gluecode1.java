package glue;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.http.Method;
import junit.framework.Assert;

public class Gluecode1
{
	public Shared sh;
	
	public Gluecode1(Shared sh)
	{
		this.sh=sh;
	}
	
	@Given("^registered uri/endpoint is \"(.*)\"$")
	public void method1(String x)
	{
		RestAssured.baseURI=x;
	}
	
	@When("^create a default HTTP request$")
	public void method2()
	{
		sh.req=RestAssured.given();
	}
	
	@And("^submit request to service via GET method with path parameter as \"([a-zA-Z]+)\" and get response$")
	public void method3(String x)
	{
		sh.res=sh.req.request(Method.GET,"/"+x);
	}
	
	@Then("^status code is \"(.*)\" and content type is \"(.*)\"$")
	public void method4(int x,String y)
	{
		int sc=sh.res.getStatusCode();
		String ct=sh.res.getHeader("Content-Type");
		if(sc==x && ct.contains(y))
		{
			sh.s.write("Posts/Post retrieving/creation tests passed");
			Assert.assertTrue(true);
		}
		else
		{
			sh.s.write("Posts/Post retrieving/creation tests failed");
			Assert.assertTrue(false);
		}
	}
	
	@And("^submit request to service via GET method with path parameter as \"([a-zA-Z]+)\" and id as \"([0-9]{1,3})\" and get response$")
	public void method5(String x,String y)
	{
		sh.res=sh.req.request(Method.GET,"/"+x+"/"+y);
	}
}

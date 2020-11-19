package glue;

import java.util.List;
import java.util.Map;

import org.json.JSONObject;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.RestAssured;
import io.restassured.http.Method;
import junit.framework.Assert;

public class Gluecode2
{
	public Shared sh;

	public Gluecode2(Shared sh)
	{
		this.sh=sh;
	}

	@Then("^status code is \"(.*)\" and content type is \"(.*)\" with id value as \"(.*)\" in response body$")
	public void method6(String x,String y,String z)
	{
		int scfstep=Integer.parseInt(x);
		int scfres=sh.res.getStatusCode();
		String ct=sh.res.getHeader("Content-Type");
		sh.jp=sh.res.jsonPath();
		//int idfres=jp.getInt("id");
		String idvalue=sh.jp.getString("id");
		int idfres=Integer.parseInt(idvalue);
		int idfstep=Integer.parseInt(z);
		if(scfstep==scfres && ct.contains(y) && idfstep==idfres)
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

	@And("^attach data to be sent to service like \"(.*)\",\"(.*)\",\"(.*)\",\"(.*)\"$")
	public void method7(String x,String y,String z,String w)
	{
		sh.jo=new JSONObject();
		sh.jo.put("userId",x);
		sh.jo.put("id",y);
		sh.jo.put("title",z);
		sh.jo.put("body",w);
		sh.req.header("Content-Type","application/json");
		sh.req.body(sh.jo.toString());
	}

	@And("^submit request to service via POST method with path parameter as \"([a-zA-Z]+)\" and get response$")
	public void method8(String x)
	{
		sh.res=sh.req.request(Method.POST,"/"+x);
	}

	@Given("^test restful service$")
	public void method9(DataTable dt)
	{
		List<Map<String,String>> l=dt.asMaps();
		for(Map<String,String> m:l)
		{
			String uri=m.get("uri");
			String uid=m.get("uid");
			String id=m.get("id");
			String title=m.get("title");
			String body=m.get("body");
			String cr=m.get("criteria");
			int sc=Integer.parseInt(m.get("Status_code"));
			RestAssured.baseURI=uri;
			sh.req=RestAssured.given();
			sh.jo=new JSONObject();
			sh.jo.put("userId",uid);
			sh.jo.put("id",id);
			sh.jo.put("title",title);
			sh.jo.put("body",body);
			sh.req.header("Content-Type","application/json");
			sh.req.body(sh.jo.toString());
			sh.res=sh.req.request(Method.POST,"/posts");
			int statuscode=sh.res.getStatusCode();
			if(cr.equals("unique") && statuscode==sc)
			{
				sh.s.write("Service is working correctly in new posts creation");
				Assert.assertTrue(true);
			}
			else
			{
				sh.s.write("Service is not working correctly in new posts creation as statuscode recieved from service is "+statuscode+" which is not "+sc);
				Assert.assertTrue(false);
			}
		}
		/*for(int i=0;i<l.size();i++)
		{
			String uri=l.get(0).get("uri");
		}*/
	}
}

import static org.junit.Assert.assertEquals;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.junit.Test;

import com.qa.app.Account;
import com.qa.app.ServiceCalss;

public class ServiceTester {

	@Test
	public void testAdd()
	{
		int accTrackingNum1 = ServiceCalss.AddAccount("John", "Doe");;
		int accTrackingNum2 = ServiceCalss.AddAccount("Jane", "Doe");
		
		assertEquals("John", ServiceCalss.getAccount(accTrackingNum1).getFirstName());
	}
	
	@Test
	public void testJsonConversion()
	{
		int accTrackingNum1 = ServiceCalss.AddAccount("John", "Doe");;
		int accTrackingNum2 = ServiceCalss.AddAccount("Jane", "Doe");
		Account AccAtZero = null;
		
		JSONObject jo = ServiceCalss.getJsonMap();
		try { 
			
			AccAtZero = (Account) jo.get("0");
			 
		} catch (JSONException e) {
			e.printStackTrace();
		}
		assertEquals("John", AccAtZero.getFirstName());
		
		System.out.println("pause");
	}
	
	
}

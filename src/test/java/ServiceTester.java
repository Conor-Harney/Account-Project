import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.qa.app.ServiceCalss;

public class ServiceTester {

	@Test
	public void testAdd()
	{
		int accTrackingNum1 = ServiceCalss.AddAccount("John", "Doe");;
		int accTrackingNum2 = ServiceCalss.AddAccount("Jane", "Doe");
		
		assertEquals("John", ServiceCalss.getAccount(accTrackingNum1).getFirstName());
	}
	
}

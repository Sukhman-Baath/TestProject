package listeners;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

//@Listeners({ listeners.TestNGListeners.class })

public class ListenerDemo2 {

	
	@Test
	public void test4()
	{
		System.out.println(" this is test 1");
	}
	
	@Test
	public void test5()
	{
		System.out.println(" this is test 2");
	
	}
	
	@Test
	public void test6()
	{
		System.out.println(" this is test 3");
		
	}
	@Test
	public void test8()
	{
		System.out.println(" this is test 4");
	}	
	
}

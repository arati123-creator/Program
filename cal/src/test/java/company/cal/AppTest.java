package company.cal;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */



public class AppTest 
    extends TestCase
{
	public void testSum() 
	{
		System.out.println("sum");
		Integer x = 15;Integer y = 15;
		Integer expResult = 30;
		Integer result = Calculator.sum(x, y);
		assertEquals(expResult, result);
		assertEquals(null, Calculator.sum(15, null));
		assertEquals(null, Calculator.sum(null, 15));
		assertEquals(null, Calculator.sum(null, null));
	}
	

	
	
	public void testSub() 
	{
		System.out.println("sub");
		Integer x = 15;Integer y = 15;
		Integer expResult = 30;
		Integer result = Calculator.sum(x, y);
		assertEquals(expResult, result);
		assertEquals(null, Calculator.sum(15, null));
		assertEquals(null, Calculator.sum(null, 15));
		assertEquals(null, Calculator.sum(null, null));
	}
	
	
	
	
	
	
	
	
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }
}

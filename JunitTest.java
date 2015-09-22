package JunitTesting;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class JunitTest {
    @BeforeClass
    public static void stepUpClass()
    {
    	System.out.println("Before Test");
    }
    @AfterClass
    public static void tearDownClass()
    {
    	System.out.println("After Test");
    }
    @Before
    public void stepUp(){};
    @After
    public void tearDown(){};
    
	@Test
	public void test() {
		System.out.println("Truong hop co 2 nghiem:");
		quadratic q=new quadratic(1,-3,2);
		assertEquals(2,q.solve());
		System.out.println("Truong hop co nghiem kep:");
		quadratic q1=new quadratic(1,2,1);
		assertEquals(1,q1.solve());
		System.out.println("Truong hop vo nghiem:");
		quadratic q2=new quadratic(1,4,5) ;
		assertEquals(0,q2.solve());
		System.out.println("Truong hop khong phai pt b2:");
		quadratic q3=new quadratic(0,2,3);
		assertEquals(-1,q3.solve());
	}

}

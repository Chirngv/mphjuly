package com.mph.mvnproj;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.*;
import org.junit.rules.ExpectedException;

public class CalculateTest {
	Calculate calc;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception{
		
		System.out.println("@Before Class Called");
	}
	
	@AfterClass
	public static void tearDownAfterClass() throws java.lang.Exception
	{
		System.out.println("@AfterClass Called");
	}
	
	@Before
	public void setUp() throws java.lang.Exception
	{
		System.out.println("@Before Called");
		calc = new Calculate();
	}
	
	@After
	public void tearDown() throws java.lang.Exception
	{
		calc=null;
		System.out.println("@After Called");
	}
	
	@Test
	public void testAdd()
	{
		System.out.println("Add Test");
		assertEquals(50,calc.add(10,20,20));
	}
	
	@Test
	public void testMultiply()
	{
		System.out.println("Multiply Test");
		assertNotEquals(1,calc.Multiply(2,3,1));
		
	}
	
	@Rule
	public ExpectedException exception = ExpectedException.none();
	
	public void testDivide()
	{
		System.out.println("Divide Test");
		calc.divide();
		exception.expect(ArithmeticException.class);
		exception.expectMessage("Rule says DONT devide by 0 ;(");
	}
}

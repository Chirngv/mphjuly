package com.mph.mvnproj;

import org.junit.*;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.*;
import static org.junit.Assert.*; 

@RunWith(Parameterized.class)
public class MyParamTest {
	
	private int x,y,result;
	Calculate calc;
	
	public MyParamTest(int x,int y,int result)
	{
		super();
		this.x = x;
		this.y = y;
		this.result = result; 
	}
	
	@Before
	public void setUp()
	{
		System.out.println("@Before called");
		calc = new Calculate();
	}
	
	@After
	public void tearDown()
	{
		calc = null;
		System.out.println("@After called");
	}
	
	@Parameters
	public static Collection data()
	{
		return Arrays.asList(new Object[][] {{10,20,30},{20,20,40},
				{200,300,500},{20,10,50}});
	}
	
	@Test
	public void testSum()
	{
		System.out.println("Add Test");
		assertEquals(result,calc.add(x,y));
	}
	
	
}

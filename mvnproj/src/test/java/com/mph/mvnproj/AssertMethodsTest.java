package com.mph.mvnproj;

import static org.junit.Assert.*;

import org.junit.Test;

public class AssertMethodsTest {
	
	@Test
	public void testAllAssertMethods()
	{
		String str1 = new String("chiru");
		String str2 = new String("chiru");
		String str3 = null;
		String str4 = "chiru";
		String str5 = "chiru";
		
		int val1 = 5;
		int val2 = 6;
		
		String arr1[] = {"ten","twenty","thiry"};
		String arr2[] = {"ten","twenty","thiry"};
		
		assertEquals(str1,str2);
		assertNotNull(str1);
		assertNull(str3);
		assertSame(str4,str5);
		
		assertTrue(val1<val2);
		assertFalse(val1>val2);
		assertArrayEquals(arr1,arr2);
				
				
	}
}

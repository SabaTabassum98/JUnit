package day19;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class AssertionDemo {
	
		@Test
		public void simple()
		{
			int A = 1;
			int B = 1;
		 	assertEquals(A, B);
		}
		@Test
     	public void simple1()
		{
			float A =  9;
			float B = 9;
			assertEquals(A, B);
			}
		
		@Disabled
		@Test
		public void simple2()
		{
			String A = "New";
			String B = "Old";
			assertEquals(A, B);
			}
		}
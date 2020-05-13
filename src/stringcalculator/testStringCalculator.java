package stringcalculator;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class testStringCalculator {

	@Test
	void test0Numbers() {
		String number = "";
		
		//act 
		int result = StringCalculator.add(number);
		
		//assert
		assertEquals(0,result);
	}
	

	@Test
	void test1Numbers() {
		String number = "1";
		
		//act 
		int result = StringCalculator.add(number);
		
		//assert
		assertEquals(1,result);

	}
	
	@Test
	void test3Numbers() {
		String number = "1,2";
		
		//act 
		int result = StringCalculator.add(number);
		
		//assert
		assertEquals(3,result);

	}
	
	@Test
	void testunKnownAmountNumbers() {
		String number = "1,2,7,9";
		
		//act 
		int result = StringCalculator.add(number);
		
		//assert
		assertEquals(19,result);

	}
	@Test   //not working with multiple delimiters
	void testNewLine() {
		String number = "1\n2,3";
		
		//act 
		int result = StringCalculator.add(number);
		
		//assert
		assertEquals(6,result);

	}
	@Test    //could not figure out how to add \n line with more than one delimiter
	void testDelimiter() {
		String number = "//;\n1;2";
		
		//act 
		int result = StringCalculator.add(number);
		
		//assert
		assertEquals(3,result);
	
	
	}	
	
	@Test    //could not figure out how to add \n line with more than one delimiter
	void testDiffDelimiter() {
		String number = "//;,!1;2";
		
		//act 
		int result = StringCalculator.add(number);
		
		//assert
		assertEquals(3,result);
		
	}	
		
		@Test    //could not figure out how to add \n line with more than one delimiter
		void testNegativeNums() {
			String number = "-1,-3,2";
			
			//act 
			int result = StringCalculator.add(number);
			
			//assert
			assertEquals(2,result);
			
	}	
		
		@Test    //could not figure out how to add \n line with more than one delimiter
		void testBigNumbers() {
			String number = "2,1005";
			
			//act 
			int result = StringCalculator.add(number);
			
			//assert
			assertEquals(2,result);
	
}	
		
		@Test    //could not figure out how to add \n line with more than one delimiter
		void testDelimiterLength() {
			String number = "//,,,3,,,4,,,7";
			
			//act 
			int result = StringCalculator.add(number);
			
			//assert
			assertEquals(14,result);
	}
		
		@Test    //could not figure out how to add \n line with more than one delimiter
		void testMultipleDilimeters() {
			String number = "//,;;,,3,,!,4,,,7";
			
			//act 
			int result = StringCalculator.add(number);
			
			//assert
			assertEquals(14,result);
		
		
		
		
		
		
		
		
		}		
		
	
}	
	
	


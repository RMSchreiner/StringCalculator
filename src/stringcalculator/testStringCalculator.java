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
	@Test
	void testNewLine() {//not working at the moment
		String number = "1\n2,3";
		
		//act 
		int result = StringCalculator.add(number);
		
		//assert
		assertEquals(4,result);

	}
	@Test
	void testDelimiter() {//not working at the moment
		String number = " 1,\n1,2";
		
		//act 
		int result = StringCalculator.add(number);
		
		//assert
		assertEquals(4,result);
	
	
	}	
	
}	
	
	


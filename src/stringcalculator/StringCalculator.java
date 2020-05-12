package stringcalculator;

import java.lang.reflect.Array;

public class StringCalculator {


	//"\\t|,|;|\\.|\\?|!|-|:|@|\\[|\\]|\\(|\\)|\\{|\\}|_|\\*|/"

	public static int add (String number) {
		if(number.matches(".*\\d.*")) {
			String[] itteration = number.split(",");
			int sum = 0;
			for(String split : itteration) {
				int i = Integer.parseInt(split);
				sum += i;	
			}
			return sum;}
	return 0;
	}

	
	
	
}

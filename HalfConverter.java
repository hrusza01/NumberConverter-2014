public class HalfConverter
{
	// These two arrays cover the letters for every number from 1 - 99.
	private static final String[] firstNumbersArray = {"", " one", " two", " three", " four", " five", " six", " seven", " eight", " nine", " ten", " eleven", " twelve", " thirteen", " fourteen", " fifteen", " sixteen", " seventeen", " eighteen", " nineteen"};

	private static final String[] secondNumbersArray = {"", " ten", " twenty", " thirty", " forty", " fifty", " sixty", " seventy", " eighty", " ninety"};
	
	// This method will convert any number from 1 to 999 into the String representation. I am dealing with numbers up to six digits so it will convert half of the possible maximum digits.
	public static String convertHalf(int half) 
	{
		String finalResult;
		
		if (half % 100 < 20)
		{
	      		finalResult = firstNumbersArray[half % 100];
	      		half /= 100; 
		}

		else 
		{
			finalResult = firstNumbersArray[half % 10];
			half /= 10;

			finalResult = secondNumbersArray[half % 10] + finalResult;
			half /= 10;
		}

		if (half == 0) 
		{
			return finalResult;
		}
    
		return firstNumbersArray[half] + " hundred" + finalResult;
	}
}

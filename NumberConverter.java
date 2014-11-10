import java.text.DecimalFormat;

public class NumberConverter
{
	// This method will convert any number between -999999 and 999999 to the String representation.
	public static String convertToLetters(String number)
	{
		// This is what will be printed to output.
		String finalResult = "";

		// First convert the input String to an int.
		int mynumber = Integer.parseInt(number);

		// Since the letters for "zero" are only used for 0, I will deal with it seperately here.
		if (mynumber == 0)
		{
			return "zero";
		}

		// Only accept integers between -999999 and 999999.
		if (mynumber > 999999 || mynumber < -999999)
		{
			return "Please enter an integer between -999999 and 999999.";
		}

		// Deals with negative numbers by adding the word "negative" before converting the number to a positive.
		if (mynumber < 0)
		{
			finalResult += "negative";
			mynumber = Math.abs(mynumber);
		}

		// Converts any number into six digit format.
		String digits = "000000";
		DecimalFormat myformat = new DecimalFormat(digits);
		String mynumber2 = myformat.format(mynumber);

		// Splits the six digit string in half.
		int firstHalf = Integer.parseInt(mynumber2.substring(0,3));
		int secondHalf = Integer.parseInt(mynumber2.substring(3,6));

		// Uses the half converter to find the letters for the first three digits and appending the word "thousand".
		if (firstHalf != 0)
		{
			finalResult += HalfConverter.convertHalf(firstHalf) + " thousand";
		}

		// Uses the half converter to find the letters for the last three digits and adding them to the string to complete the number.
		finalResult = finalResult + HalfConverter.convertHalf(secondHalf);

		// Returns the full string while trimming off unnecessary spaces.
		return finalResult.trim();
	}
}

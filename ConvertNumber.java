public class ConvertNumber
{
	// The main program receives a number on the command line before sending it to be converted to letters. The program completes by printing the result.
	public static void main(String[] args) 
	{
		for (String s: args) 
		{
    			System.out.println(NumberConverter.convertToLetters(s)); 
		}
	}
}

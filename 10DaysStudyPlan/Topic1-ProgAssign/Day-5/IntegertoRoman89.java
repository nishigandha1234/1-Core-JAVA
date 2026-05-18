/*89 Integer to string conversion LC 12 */
/*12. Integer to Roman
Seven different symbols represent Roman numerals with the following values:
Symbol	Value
I 1  V 5  X 10  L 50  C	100 D 500  M 1000
Roman numerals are formed by appending the conversions of decimal place values from highest to lowest. Converting a decimal place value into a Roman numeral has the following rules:*/

class IntegertoRoman89
{
	public static void main(String x[])
	{
		int num = 3749;
		System.out.println(intToRoman(num));
	}
	public static String intToRoman(int num) 
	{
        int[] values = {1000,900, 500, 400, 100,90,50,40,10,9,5,4,1};
		String[] roman = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
		String ans= "";
		for(int i = 0 ; i < values.length ; i++)
		{
			while(num >= values[i])
			{
				ans += roman[i];
				num -= values[i];
			}
		}
		return ans;
    }
}

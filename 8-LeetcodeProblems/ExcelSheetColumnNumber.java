/*171. Excel Sheet Column Number
Given a string columnTitle that represents the column title as appears in an Excel sheet, return its corresponding column number.
For example:A -> 1 B -> 2 C -> 3...Z -> 26 AA -> 27 AB -> 28...
Example 1: Input: columnTitle = "A" Output: 1
Example 2: Input: columnTitle = "AB" Output: 28*/

class ExcelSheetColumnNumber
{
	public static void main(String x[])
	{
		String columnTitle = "A";
		System.out.println(titleToNumber(columnTitle));
	}
	public static int titleToNumber(String columnTitle) 
	{
		int result = 0;
		
		for(int i = 0 ; i < columnTitle.length() ; i++)
		{
			char ch = columnTitle.charAt(i);
			int value = ch-'A'+1;
			result = result*26+value;
		}
		return result;
    }
}
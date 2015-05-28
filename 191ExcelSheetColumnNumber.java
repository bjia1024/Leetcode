// Related to question Excel Sheet Column Title

// Given a column title as appear in an Excel sheet, return its corresponding column number.

// For example:

//     A -> 1
//     B -> 2
//     C -> 3
//     ...
//     Z -> 26
//     AA -> 27
//     AB -> 28 

public class Solution {

	private static String str = " ABCDEFGHIJKLMNOPQRSTUVWXYZ";	
	
	public static void main(String[] args) {
		Solution s = new Solution();
		System.out.println(s.titleToNumber("ZZ"));
	}

	public int titleToNumber(String s) {
		int result = 0;
	    char[] array = s.toCharArray();
	    
	    for (int i = 0; i < array.length; i++) {
	    	int index = str.indexOf(array[i]);
	    	result = (int) (result * 26 + index);
	    }
	    
	    return result;
    }
}

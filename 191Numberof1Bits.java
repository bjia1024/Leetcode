// Write a function that takes an unsigned integer and 

// returns the number of ’1' bits it has 

// (also known as the Hamming weight).

// For example, the 32-bit integer ’11' has binary 

// representation 00000000000000000000000000001011, 

// so the function should return 3.

/****************** Solution 1 ******************/
// This solution failed because 'need to treat n as an unsigned value'
// Input:	  2147483648 (10000000000000000000000000000000)
// Output:	0
// Expected:	1

public class Solution {
	public int hammingWeight(int n) {
		long ln = n;
		int count = 0;
		while(true) {
			if (ln == 0) return count;
			if (ln % 2 == 1) count++;
			ln /= 2;
		}
	}
}

/****************** Solution 2 ******************/
// This solution failed because the following is -1 as int
// So the first loop, it evaluate as '-1 % 2' and equal to '-1'
// Input:	  0b11111111111111111111111111111111
// Output:	31
// Expected:	32
public class Solution {
	public int hammingWeight(int n) {
		int count = 0;
		// Test the 31th first which is sign
		while(true) {
			if (n == 0) return count;
			if (n % 2 == 1) count++;
			n = n >>> 1;
		}
	}
}

/****************** Solution 3 ******************/
// Fix but in S2, deal with special case first
public class Solution {
	public int hammingWeight(int n) {
		int count = 0;

		if ((n & 0b00000000000000000000000000000001) == 1) count++;
		n = n >>> 1;	

		while(true) {
			
			if (n == 0) return count;
			if (n % 2 == 1) count++;
			n = n >>> 1;		
		}
	}
}

/****************** Solution 4 ******************/
// More compact
public class Solution {
	public int hammingWeight(int n) {
		int count = 0;

		while(true) {
			
			if (n == 0) return count;
			if (n % 2 == 1 || n % 2 == -1) count++;
			n = n >>> 1;		
		}
	}
}

/****************** Sum up ******************/
// 1, Java has no unsigned data type
// 2, Dig more to big operator
// 3, -1 % 2 equals -1
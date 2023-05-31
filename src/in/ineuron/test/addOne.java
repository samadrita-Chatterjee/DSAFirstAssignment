package in.ineuron.test;

import java.io.*;
import java.util.*;

class addOne {

public static void plus_one(Vector<Integer> digits,int n)
{

	// We are reversing the original arr
	// So that we need to iterate from Back.
	Collections.reverse(digits);

	// Taking a carry variable in case if there is any carry
	int carry = 0;
	for(int i = 0; i < n; i++)
	{

	// initially carry is 0 so this is base case
	if(i == 0)
		digits.set(i, digits.get(i) + 1 + carry);

	// If carry is not equal to zero it should be added to
	// array element at that position.
	else if(carry != 0)
		digits.set(i, digits.get(i) + carry);

	// Now to get carry, i.e.
	// If digits[i]>9 we get the value at tens place in carry
	// or else if digits[i]<9 carry will be 0
	carry = digits.get(i) / 10;

	// Now if carry is not equal to 0
	// so at that index we should keep the value present
	// at the ones place so we get digits[i]%10
	if(carry != 0)
		digits.set(i, digits.get(i) % 10);
	}

	// After doing all that if carry is still there which means
	// one more element is needed to be added to the array
	if(carry != 0)
	digits.set(digits.size() - 1, carry);

	// Now we reverse the array so that we get the final array
	Collections.reverse(digits);
}

public static void main (String[] args)
{
	Vector<Integer> digits = new Vector<Integer>(Arrays.asList(9,8,9,9));
	int n = digits.size();
	plus_one(digits, n);
	for(int i = 0; i < n; i++)
	{
	System.out.print(digits.get(i) + " ");
	}
}
}




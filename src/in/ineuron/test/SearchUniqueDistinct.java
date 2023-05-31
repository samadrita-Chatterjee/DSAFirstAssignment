package in.ineuron.test;


import java.io.*;
import java.lang.*;
import java.util.Arrays;
 
class SearchUniqueDistinct{
    
    public boolean containsDuplicate(int[] nums) {
 
        // sorting the array
        Arrays.sort(nums);
        
        for(int index = 1; index < nums.length; index++) {
            if(nums[index ] == nums[index - 1]) {
                return true;
            }
        }
 
        return false;
    }
    
    public static void main (String[] args) {
	    
    	SearchUniqueDistinct sol= new SearchUniqueDistinct();
	    
	int nums[]= {1, 2, 3, 1};
	    
	boolean res = sol.containsDuplicate(nums);
	    
	System.out.println(res);
    }
}
package week1.day3;

import java.util.Arrays;

public class SecongLargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int nums[]= {3,2,11,4,6,7};
		int length=nums.length;
		Arrays.sort(nums);
		
System.out.println(nums[length-2]);
	}

}

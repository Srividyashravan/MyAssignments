package week1.day3;

import java.util.Arrays;

public class MissingElement {

	public static void main(String[] args) {
		
		int nums[]= {1,2,3,4,6,7,8};
		Arrays.sort(nums);
		
		int length=nums.length;
		
		for(int i=1;i<=length-1;i++)
		{
			
			if (i!=nums[i-1])
				
			{
				System.out.println(i);
			}
			
		}
			
		

	}

}

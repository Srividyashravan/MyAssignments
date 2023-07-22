package week1.day3;

public class printDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int nums[]= {10,10,11,12,12,13,14,14,15,15,16,17,17,18,19,19,20,20};
		
		int length=nums.length;
		
		for(int i=0;i<=length-1;i++)
			
		{
			if(nums[i]==nums[i+1])
			{
				System.out.println(nums[i]);
			}
		}
		
		
		
		
	}

}

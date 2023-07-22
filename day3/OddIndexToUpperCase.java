package week1.day3;

public class OddIndexToUpperCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="changeme";
			
		char[] ch=s.toCharArray();
		
		for(int i=0;i<=ch.length-1;i++)
			
		{
			if(i%2==0)
			{
		
			ch[i]= Character.toUpperCase(ch[i]);
		
				
			}
		}
		
			System.out.println(ch);
		
				
				
		}
	
}
		
	

		

		
		
		
		
		

	}

}

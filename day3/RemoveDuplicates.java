package week1.day3;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

String text = "We learn java basics as part of java sessions in java as week1 sessions";
		
		//int count=0;
		 
		String[] s = text.split(" ");
		
		System.out.println("After removing the duplicate, the string is: ");
				
		for(int i=0; i<s.length;i++) 
		{
			for (int j=i+1;j<s.length;j++)
			{
			if(s[i].equals(s[j]))
			{
				s[j]="";					
			}
		}
	}
		for(int i=0;i<s.length;i++) {
		//String replace = text.replaceAll("java", "");
		System.out.print(s[i]+" ");
		}
	}

		
		
		
		
		
	}

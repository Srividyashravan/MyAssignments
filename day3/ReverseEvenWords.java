package week1.day3;

public class ReverseEvenWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String text="I am a software tester";
		String[] split = text.split("");
		char[] ch=text.toCharArray();
		
		for(int i=0;i<=ch.length-1;i++)
			
		{
			if(i%2==0)
				
			{
				System.out.println(ch[i]);
			}
			
		}
		
		for(int j=ch.length-1;j>=0;j--)
			
		{
			System.out.println(ch[j]);
		}
	}
	
	

}

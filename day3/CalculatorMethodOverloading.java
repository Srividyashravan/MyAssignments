package week2.day3;

public class CalculatorMethodOverloading {

	
	public void add(int x,int y) {
	
          System.out.println(x+y);
          
	}
	
	public void add(int x,int y,int a1) {
		
		System.out.println(x-y-a1);
		
	}
	
	public void multiple(float x,float y) {
	
			System.out.println(x*y);

	}
	
		public void multiple(float a, float b,float c) {
	System.out.println((a*b)/c);

	}
	public static void main(String[] args) {
		
		CalculatorMethodOverloading poly = new CalculatorMethodOverloading();
		
		poly.add(10, 20);
		poly.add(700, 500, 50);
		poly.multiple(5.2f, 7.9f);
		
	poly.multiple(5.6f, 8.89f, 1.36f);
		
		

	}

}

package week2.day3.assignment1.org.system;

public class Desktop extends Computer {
	
	public void desktopSize() {
		System.out.println("Desktop is good");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Computer mobile=new Computer();
		Desktop object=new Desktop();
		object.desktopSize();
		mobile.computerMode1();
		
		
		
	}

}

package week2.day3.assignment4;

public class Students {

public void getStudentInfo1(int id1){
	
	System.out.println("The Details of student 1 is"+id1);
	
	
}

public void getStudentInfo1(int id1,int id2) {
	
	System.out.println("The Details of student 2 is"+id1);
	
}

public static void main(String[] args) {
	
	Students detail = new Students();
	detail.getStudentInfo1(112);
	detail.getStudentInfo1(113);

}




}

package week2.day3;

public class MyPhone {

	
	public static void main(String[] args) {
		
		IPhone mobile=new IPhone();
		mobile.StartApp();
		mobile.IncreaseVolume();
		mobile.ShutDown();
		mobile.MakeCall();
		mobile.SendSms();
		
		
		IPad pad=new IPad();
		pad.watchmovie();
		pad.StartApp();
		pad.IncreaseVolume();
		pad.ShutDown();
		
		
		
		
	}
}

package javabasicday1;

public class mobile {
	public void sendSms (String sms)
	{System.out.println("sendSms");
	System.out.println(sms);
}
	public void takeSnapshot (String TakeSnapshot)
	{System.out.println(TakeSnapshot);

}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
mobile m = new mobile ();
m.sendSms("Welcome");
m.takeSnapshot("ScreensHOT");
	}

}

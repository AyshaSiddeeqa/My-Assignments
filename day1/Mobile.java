package week1.day1;

public class Mobile {
  public void sendSms() {
	  System.out.println("Hello World");

  } 
	  public void makeCall() {
		  System.out.println("Calling");
	
	  	   	  	  	  	  }
    
	public static void main(String[] args) {
		String mobileModel = "Ipohone";
		float mobileWeight = 240.6f;
		  boolean fullcharge = true;
		  int mobileCost = 2000;		
		
System.out.println("This is my mobile");
		Mobile m=new Mobile();
		m.sendSms();
		m.makeCall();
		System.out.println(mobileModel);
		System.out.println(mobileWeight);
		System.out.println(fullcharge);
		System.out.println(mobileCost);
	
	}		
}

	
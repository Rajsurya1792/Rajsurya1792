package TYPES2;

public class Testgeneralization {

	public static void main(String[] args) 
	{
		System.out.println("---------Properties of jio-------------");
		Jio j =new Jio();
		j.sms();
		j.audiocalling();
		j.internet();
		j.newfeatureA();
		System.out.println("---------Properties of VI-------------");
		VI v =new VI();
		v.sms();
		v.audiocalling();
		v.internet();
		v.newfeatureB();
		
		System.out.println("---------Properties of Airtel-------------");
		Airtel v1 =new Airtel();
		v1.sms();
		v1.audiocalling();
		v1.internet();
		v1.newfeatureC();


	}

}

package TYPES;

public class Testgeneralization 
{

	public static void main(String[] args)
	{
		System.out.println(".............Properties of JIO...................");
		JIO J=new JIO();
		J.Audiocalling();
		J.internet();
		J.newfeature();
		J.SMS();
		
		System.out.println("................Properties of Airtel..............");
		Airtel A=new Airtel();
		A.Audiocalling();
		A.internet();
		A.newfeature();
		A.SMS();
		
		System.out.println("................Properties of VI..................");
		VI V=new VI();
		V.Audiocalling();
		V.internet();
		V.newfeature();
		V.SMS();
		
		
		

	}

}

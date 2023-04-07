package ABSTARCT_ENCAPSULAT_GENERALISE;

public class Test_Generalistion {

	public static void main(String[] args) {
		System.out.println( "*******Specification of JIO********");
		Jio x= new Jio ();
		
		x.AudioCalling();
		x.Text_Massage();
		x.Internet();
		x.freeTop_Up();
		x.NewFeatures();
		
		System.out.println( "*******Specification of BSNL********");
		BSNL y= new BSNL ();
		
		y.AudioCalling();
		y.Text_Massage();
		y.Internet();
		y.freeTop_Up();
		
		System.out.println( "*******Specification of VI********");
		VI z= new VI ();
		
		z.AudioCalling();
		z.Text_Massage();
		z.Internet();
		z.freeTop_Up();
		z.NewFeatures2();
	}
}

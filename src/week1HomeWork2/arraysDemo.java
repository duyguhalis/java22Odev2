package week1HomeWork2;

public class arraysDemo{
	String ogrenci1="ali";
	String ogrenci2="veli";
	String ogrenci3="ayşe";
	
	{
		System.out.println(ogrenci1);
		System.out.println(ogrenci2);
		System.out.println(ogrenci3);
	}
	{System.out.println("____________________");}
	

	public static void main(String[] args) {
		String[] ogrenciler= new String[3];
		ogrenciler[0]="ali";
		ogrenciler[1]="veli";
		ogrenciler[2]="ayşe";
		
		for(int i= 0;i<ogrenciler.length;i++){
			System.out.println(ogrenciler[i]);
		}
		System.out.println("............................");
		for (String ogrenci:ogrenciler) {
						
			System.out.println(ogrenci);
		}
		System.out.println("...................................");
		String []	cicekler =new String[5];
		cicekler[0]="papatya";
		cicekler[1]="gül";
		cicekler[2]="lale";
		cicekler[3]="kaktüs";
		cicekler[4]="nergis";
		for(String cicek:cicekler) {System.out.println(cicek);
		
			
		}
	}	

}

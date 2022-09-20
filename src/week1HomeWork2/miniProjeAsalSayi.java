package week1HomeWork2;

public class miniProjeAsalSayi {

	public static void main(String[] args) {
		int number=8;
		boolean isPrime=true;
		
		if(number==1) {System.out.println("Asal Değildir");
		return;
		}
		
		
		if(number<1) {System.out.println("Geçersiz Sayı");}
		
	for(int i=2;i<number;i++)
	if(number%i==0) {isPrime=false;}
	
	if(isPrime) {
	System.out.println("Asaldır");}
	else {System.out.println("Asal Değildir");

	}

}
}
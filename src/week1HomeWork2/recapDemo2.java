package week1HomeWork2;

public class recapDemo2 {

	public static void main(String[] args) {
		double [] sayiListesi = {0.1,2.3,4.5};
		double total=0;
		double enBuyuk=sayiListesi[0];
		
		
		for (double number:sayiListesi) {
			if ( enBuyuk<number) {
			enBuyuk=number;
			
			
		}
		System.out.println(number);
		total =total+number;	
			
			
		}System.out.println("toplam"+total);
		 System.out.println("toplam"+total);


	}

}

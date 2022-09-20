package week1HomeWork2;

public class loop {
	//For döngüsü
		public static void main(String[] args) {
		for(int i=1; i<10; i++){
		System.out.println(i);}
		System.out.println("Döngü Bitti");
		
		for(int i=2; i<10; i+=2){
			System.out.println(i);}
			System.out.println("Çift Döngü Bitti");
			for(int i=10; i<101		; i+=10){
				System.out.println(i);}
				System.out.println("Onluk Döngü Bitti");
		
		// While
		
		int i=1;
		while (i<10) {
			System.out.println(i);
		 i+=1;}
				System.out.println("While Döngü Bitti");
				// Do-While Döngüsü
				int j=1;
				do {System.out.println(j); j++;}
				while (j<10);
				System.out.println("Do-While Döngüsü Bitti");
				
		}}
			
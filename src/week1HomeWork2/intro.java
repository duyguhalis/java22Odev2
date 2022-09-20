package week1HomeWork2;

public class intro {

	public static void main(String[] args) {
		System.out.println("Hello world!");
//Java kod metinleri ';'ile biter
		//değişken isimlendirmeleri Java'da camelCase yazılır
		String ortaMetin = "İlginizi Çekebilir";
		String altMetin = "Vade Süresi";
		// koda referans vermek için stringden sonraki kısmı çift tırnaksız yaz
		System.out.println(ortaMetin);
		//integer: tamsayı
		int vade	=	12;
		//double: ondalıklı değer
		double dolarDun = 18.14 ;
		double dolarBugun = 18.14;
		// iki seçenekli true/false durumları için 'boolean' kodu kullanılır
		Boolean dolarDustumu = false ;
		String okYonu = "";
				if (dolarBugun<dolarDun) {//true
				okYonu ="down.svg";
				System.out.println(okYonu);
					
				}
				else if (dolarBugun>dolarDun) {//false
					okYonu ="up.svg";
					System.out.println(okYonu);}
					else { okYonu ="equal.svg";
					System.out.println(okYonu);}
				//array: listeler için kullanılır [] ile yazılır
				String [] krediler = {"Hızlı Kredi","Maaş Hesaplı Kredi","xxxxxx","yyyyyyy"};
				System.out.println(krediler[0]);// her bir öğeyi diziliş sırasına göre listeler, öğeler '0'dan başlar
				System.out.println(krediler[1]);
				System.out.println(krediler[2]);
				System.out.println(krediler[3]);
				// çok fazla öğenin olduğu durumlarda döngülerle listeleme yapılır
				String[] flowers = {"gül","lale","papatya","sümbül","q","a","z","s","d","f","g","h","j","k","l","m","n","b","v","f","g","h","j","g"};
				 for (int i = 0; i < flowers.length; i++) {
				System.out.println(flowers[i]);	
				}
				}
					
				
				
	}



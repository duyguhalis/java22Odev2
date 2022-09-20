package week1HomeWork2;

public class stringsDemo {

	public static void main(String[] args) {
		String mesaj="Bugün hava çok güzel.";
		//String mesaj2=mesaj.concat("Yaşasın!");
		//String mesaj3="Yaşasın!";
		//System.out.println(mesaj);

		//System.out.println("Mesajın Eleman Sayısı:"+mesaj.length());
		//System.out.println("4.Karakter:"+mesaj.charAt(3));
		//System.out.println(mesaj.concat(".Yaşasın!"));
		//System.out.println("..........................");
		//System.out.println(mesaj2);
		//System.out.println("..........................");
		//System.out.println(mesaj+mesaj3);
		
		
		
		//System.out.println(mesaj.startsWith("A"));
		//System.out.println(mesaj.endsWith("."));
		//char[] karakterler= new char[5];
		//mesaj.getChars(0, 5, karakterler, 0);// '0'. karakterde 5. karaktere kadar alır belirlenen 'karakterler' charına 0.satırdan başlayarak yazar
		//System.out.println(karakterler);
		//System.out.println(mesaj.indexOf('a'));
		//System.out.println(mesaj.indexOf("av"));// aramaya soldan sayarak başlar
		//System.out.println(mesaj.lastIndexOf("av"));}// aramaya sağdan sayarak başlar
		String yeniMesaj=mesaj.replace(' ', '-');// mesaj.replace () komutu metin içindeki seçili karakterleri yazılan karakterle değiştirir
		System.out.println(yeniMesaj);
		System.out.println(mesaj.substring(2));//mesajı seçili karakterden itibaren gösterir
		System.out.println(mesaj.substring(0,4));// 0-4 arasını yazar
		
		for(String kelime:mesaj.split(" ") )
		System.out.println(kelime);
		System.out.println("....................");
		
		System.out.println(mesaj.toLowerCase());//küçük harfe çevirir
		System.out.println(mesaj.toUpperCase());//büyük harfe çevirir
		System.out.println(mesaj.trim());// başındaki ve sonundaki boşlukları alır.
		}
			
		

}

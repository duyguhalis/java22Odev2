package week1HomeWork2;

public class switchDemo {

	public static void main(String[] args) {
		char grade = 'ı';
				switch (grade) {
				case 'A':
					System.out.println("Mükemmel, geçtiniz.");
					break;
				case'B':
					System.out.println("iyi, geçtiniz.");
					break;
				case'C':
				case'D':
					System.out.println("Orta,geçtiniz.");
					break;
				case'F':
					System.out.println("Kaldınız.");
					break;
					default:
						System.out.println("Geçersiz not girdiniz.");
						break;
				}

	}

}

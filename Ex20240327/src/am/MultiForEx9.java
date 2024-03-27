package am;

public class MultiForEx9 {

	public static void main(String[] args) {
		// A B C D E
		// F G H I J
		// K L M N O
		
//		char a = 'A';
//		char b = (char) ((int)a+1);
		
		int charInt = 65;
		
		for(int i=0; i<3; i++) {
			for(int j=0; j<5; j++) {
				System.out.printf("%2c",(char) charInt);
				charInt++;
			}
			System.out.println();
		}
		
		System.out.println("\n+++++++++++");
		
		
		char count = 'A';
		
		for(int i=0; i<3; i++) {
			for(int j=0; j<5; j++) {
				System.out.printf("%2c", count);
				count++;
			}
			System.out.println();
		}
		
		System.out.println("\n-----------");
		
		// * * * * *
		// * * * * *
		// * * * * *
		// * * * * *
		
		for(int i=0; i<4; i++) {
			for(int j=0; j<5; j++) {
				System.out.printf("%2c", '*');
			}
			System.out.println();
		}
		
	}

}

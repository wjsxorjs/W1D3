package am;

public class MultiForEx8 {

	public static void main(String[] args) {
		/*
		   1  2  3  4
		   5  6  7  8
		   9 10 11 12		   
		*/

//		for(int i=0; i<9; i+=4) {
		for(int i=0; i<3; i++) {
			for(int j=1; j<5; j++) {
//				System.out.printf("%4d", j+i);
				System.out.printf("%4d", j+(4*i));
			}
			System.out.println();
		}
		// 밑에 방법으로 알려주셨다.
		System.out.println("\n\n++ count 변수 사용 ++\n");
		int count = 1;
		for(int i=0; i<3; i++) {
			for(int j=1; j<=4; j++) {
				System.out.printf("%4d", count);
				count++;
			}
			System.out.println();
		}
		
		
		
		
	}

}

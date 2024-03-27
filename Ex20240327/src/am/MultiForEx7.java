package am;

public class MultiForEx7 {

	public static void main(String[] args) {
		/*
		 화면에
		 1 2 3 4
		 이렇게 출력하고자 한다.
		 */
		
		for(int i=1; i<=4; i++) {
//			System.out.printf("%-3d", i);
			if(i==4) {
				System.out.printf("%d", i);
				break;
			}
			System.out.printf("%-2d", i);
		}

		/*
		 이번에는 화면에
		 1 2 3 4
		 1 2 3 4
		 1 2 3 4
		 이렇게 출력하고자 한다.
		 */
		
		System.out.println("\n-- 3번반복 --");
		
		for(int j=0; j<3; j++) { // 행단위 반복
			for(int i=1; i<=4; i++) { // 열단위 반복
//				System.out.printf("%-3d", i);
				if(i==4) {
					System.out.printf("%d", i);
					break;
				}
				System.out.printf("%-2d", i);
			}
			System.out.println();
		}
		

	}

}

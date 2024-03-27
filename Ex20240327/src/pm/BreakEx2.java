package pm;

public class BreakEx2 {

	public static void main(String[] args) {
		// BREAK문 (탈출문)
		/*
		 
		 	1 2 3 4 5
		 	1 2 3 4 5
		 	1 2 3 4 5
		 
		 */
		
		for(int i=0; i<3; i++) {
			for(int j=1; j<=5; j++) {
				System.out.printf("%2d", j);
			}
			System.out.println();
		}
		
		System.out.println("------------");

		/*
		 
		 	1 2 3
		 	1 2 3
		 	1 2 3
		 
		 */
		
		for(int i=0; i<3; i++) {
			for(int j=1; j<=5; j++) {
				System.out.printf("%2d", j);
				if(j==3) break; // j가 3과 같다면 가장 가까운 반복문'만' 탈출(break;)
			}
			System.out.println();
		}
		
		

	}

}

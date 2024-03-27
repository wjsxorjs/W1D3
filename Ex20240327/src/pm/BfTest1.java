package pm;

public class BfTest1 {

	public static void main(String[] args) {
		System.out.println("구구단을 외자! 구구단을 외자!");
		for(int i = 2; i<10; i++) {
			System.out.printf("\n---------------- %d단 ----------------\n", i);
			for(int j = 1; j<10; j++) {
				System.out.printf("%d * %d = %2d", i,j,i*j);
				if(j%3==0) { // 구구단이 세 번씩(3, 6, 9) 출력됐다면
					System.out.println();
				} else { // 그게 아니라면
					System.out.print(" | ");
				}
			}
		}
	}
	

}

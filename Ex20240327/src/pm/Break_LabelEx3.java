package pm;

public class Break_LabelEx3 {

	public static void main(String[] args) {

		// bk라는 이름으로 바깥쪽 for에게 명칭을 부여함
		bk:for(int i=0; i<3; i++) {
			for(int j=1; j<=5; j++) {
				System.out.printf("%2d", j);
				if(j==3) break bk; // j가 3과 같다면 가장 가까운 반복문'만' 탈출(break;)
								   // bk라는 명칭을 가진 반복문 탈출
			}
			System.out.println();
		}
		
		
	}

}

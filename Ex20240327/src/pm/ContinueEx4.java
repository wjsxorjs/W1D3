package pm;

public class ContinueEx4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1 2 3 4 5
		// 1 2 3 4 5
		// 1 2 3 4 5
		
		
		for(int i=1; i<=3; i++) {
			for(int j=1; j<=5; j++) {
				
				//j값을 출력하기 전에 i가 3의 배수면 건너뛰어라
				if(j%3==0) continue;
				System.out.printf("%2d", j);
			} // 열을 반복하는 for문의 끝
			System.out.println();
		} //행을 반복하는 for문의 끝
	}

}

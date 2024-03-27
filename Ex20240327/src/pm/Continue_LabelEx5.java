package pm;

public class Continue_LabelEx5 {

	public static void main(String[] args) {

		//Label은 반복문 앞에서만 선언이 가능하다.
		cnt: for(int i=1; i<=3; i++) {
			for(int j=1; j<=5; j++) {
				
				//j값을 출력하기 전에 i가 3의 배수면 건너뛰어라
				if(j%3==0) continue cnt;
				System.out.printf("%2d", j);
			} // 열을 반복하는 for문의 끝
			System.out.println();
		} //행을 반복하는 for문의 끝

	}

}

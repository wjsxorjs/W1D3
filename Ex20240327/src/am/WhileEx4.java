package am;

public class WhileEx4 {

	public static void main(String[] args) {
		// 프로그램 시작
		
		/*
		  숫자 1 ~ 45 수들 중 난수를 생성하고
		  출력하는 것을 WHILE문을 사용하여 구현하라
		 */

		
		int i = 0;
//		int randNum = 0;
		
		while(i<6) { //조건식을 불만족하면 하위 실행문을 아예 실행하지 않을 수도 있다.
			int randNum = (int) (Math.random() * 45 + 1); // 난수 발생
														  // | 반복문이 한 번 끝나고 돌아올 때 소멸되므로
														  // | 선언 중복에 문제가 생기지않는다.
			System.out.printf("Random Number #%d: %d\r\n", i+1, randNum);
			i++;
		}

		
	}

}

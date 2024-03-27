package am;

public class WhileEx3 {

	public static void main(String[] args) {
		// 프로그램 시작
		
		//1 ~ 10까지의 합을 구하는 while문을 구현하자.
		
		int summ = 0; //합을 저장할 누적변수
		
		int i = 1; // while문 조건식에 사용될 변수
		
		// 1 ~ 10까지 반복하는 while문
		while(i<=10) {
//			summ = summ + i;
//			i++;
			// 윗 두 줄을 한 줄로 나타내었을 때 다음과 같다.
			summ += i++; // summ = summ + i++;과 같은 의미이다.
			
		}
		
		System.out.printf("Sum from 1 to 10: %-3d\r\n", summ); // %-3d는 세자리의 십진수를 표현하고 좌측으로 정렬하여라.
														 // 우측으로 정렬하려면 %3d로 작성하면 된다.
		

	}

}

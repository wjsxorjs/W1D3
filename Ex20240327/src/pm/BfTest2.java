package pm;

import java.util.Scanner;

public class BfTest2 {

	public static void main(String[] args) {
		/*
		  구구단 게임
		  구구단이 나온다. (2단 ~ 9단)
		  답을 입력한다. (당신이!)
		  틀릴 때까지 계속한다.
		  10연속 정답마다 축하메시지가!
		  구구단을 외자! 구구단을 외자!
		 */
		
		
//		boolean win = true; // 현재 boolean win은 true
		System.out.println("구구단을 외자! 구구단을 외자!\n");
		
		Scanner scanAns = new Scanner(System.in); // 답을 입력받을 Scanner 생성
		
		int winCount = 0;
		
//		while(win) {
		while(true) {
			int dan = (int) (Math.random() * 8 + 2); //단을 난수로 받음
			int mulVal = (int) (Math.random() * 9 + 1); //해당 단의 몇 번째?인지를 난수로 받음
			System.out.printf("%d X %d = ", dan, mulVal);
			
			int answer = scanAns.nextInt(); // 사용자로부터 답을 입력받음
			
			if(answer == dan*mulVal) { //입력받은 답과 실제 답이 같다면
				System.out.println("정답입니다!\n");
				winCount++; // 정답 수 증가
			} else { //입력받은 값과 실제 값이 같지 않다면
				System.out.println("오답입니다...\n나가주세요\n");
//				win = false; // boolean win을 false로 변경 < 조건식 불만족 =  while문 탈출
				break;
			}
			
			if(winCount%10 == 0) { //winCount가 10의 배수일 때
				System.out.printf("=============\n%d연속 정답!!\n=============\n\n", winCount);
			}
		}
		
		System.out.printf("총 정답 수: %d\n", winCount);
	}
	
	
}

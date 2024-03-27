package am;

import java.util.Scanner;

public class BfTest {

	public static void main(String[] args) {
		// 7번 문제 24.03.27에 수정됨
		// 실수형 x에 5.0을, 실수형 y에 0.0을 저장하고,
		// 실수형 z에 5.0을 y로 나눈 나머지 값을 저장한 후
		// 조건문 중 비교문(분기문)을 사용하여 특정 조건을 만족할 경우
		// "0.0으로 나눌 수 없습니다."를 출력하라.
		// 해당 조건을 만족시키지 못한다면
		// 실수형 result에 z값에 10을 더한 값을 저장한 후
		// "결과: [result 값]"이 되도록 출력하라.
		
		System.out.println("\n---7번 문제---");
		double x2 = 5.0;
		double y2 = 0.0;
		double z2 = x2 % y2;
		if (Double.isNaN(z2)) { // 검색해서 알아낸 방법. z2가 x2/y2 였다면 Double.isInfinte(z2)를 사용하여 확인함.
	//  if (y2 == 0) { // 처음에는 y2가 0과 같은지 비교하는 방법을 사용함
			System.out.println("0.0으로 나눌 수 없습니다.\r\n");
		} else {
			double result1 = z2 + 10;
			System.out.printf("결과: %f\r\n\r\n", result1);
		}
		
		
		Scanner scanR = new Scanner(System.in);
		//문장 입력받기
		System.out.print("반복할 문장을 입력하세요: ");
		String tarStr = scanR.nextLine();
		//숫자 입력받기
		System.out.print("몇 번 반복할 지 입력하세요(1~10): ");
		int rotNum = scanR.nextInt();
		
		//범위 밖 숫자 최소치, 최대치로 변경하기.
		if(rotNum<1) {
			rotNum = 1;
		} else if(rotNum>10) {
			rotNum = 10;
		}
		
		//입력받은 숫자만큼 입력받은 문장 반복하기
		for(int i=1; i<=rotNum; i++) {
			System.out.printf("#%d: %s\r\n",i,tarStr);
		}
		
		System.out.println(" --------------------\r\n  Program Terminated \r\n --------------------\r\n");
		
		
		
	}

}

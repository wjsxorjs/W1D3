package am;
import java.util.Scanner;

public class DoWhileEx6 {

	public static void main(String[] args) {
		/* [문제]
				키보드로부터 '단'을 입력받는다.
				do~while로 해당 단의 구구단을 출력한다.
	
		*/
	

	System.out.print("몇 단을 외울까요? :   ");
	Scanner scanInt = new Scanner(System.in); // System.in 은 System '안에' in이라는 뜻
											  // in은 소문자로 시작하고 괄호가 없으므로 변수다.
	
	int dan = scanInt.nextInt();
	// 입력받은 dan이 범위(2~9) 밖에 있을 경우 올바른 값이 되도록 처리
	if(dan<0) {    // 음수일때
		dan *= -1; // 양수로 변환
	}
	dan %= 10;     //10 이상일때 나머지 값으로
	if (dan < 2){  // 처리 후 결과가 2 미만일때 (0. 1)
		dan = 2;   // dan을 2로 변환
	}
	System.out.printf("\r\n------- %d단 -------\r\n",dan);
	
	int i = 1; // 1~9까지 증가해야하는 값
	
	do {
		System.out.printf("%d * %d = %2d", dan, i, dan * i);
		if(i%3==0) {
			System.out.print("\r\n");
//			System.out.println(); < 얘도 줄바꿈으로 사용할 수 있다. 
		} else {
			System.out.print("\s\s\s\s");
		}
		i++;
	} while(i<=9);
	

//	System.out.println("System.out: " + System.out);
//	System.out.println("System.in: " + System.in);
	
	
	}
	
}

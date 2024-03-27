package pm;

import java.util.Scanner;

public class TestEx6 {

	public static void main(String[] args) {
		Scanner scanGuess = new Scanner(System.in);
		String cntGame = "Y";
		
		do {
			// 컴퓨터가 가지는 난수 발생 (1~100)
			int com = (int) (Math.random() * 100 + 1);
			
			//화면에 "짝수는 1, 홀수는 2를 선택하도록 출력
			System.out.println("짝수: 1, 홀수: 2");
			// 키보드에서 1,2 중 하나를 입력을 받아
			bk:while(true) {
				int cmd = scanGuess.nextInt();
				
				switch(cmd) {
					case 1: // 짝수를 선택
						if(com%2 == 0) {
							System.out.println("짝수가 맞습니다.");
							break bk;
						} else {
							System.out.println("짝수가 아닙니다.");
						} break;
					
					case 2: // 홀수를 선택
						if(com%2 == 1) {
							System.out.println("홀수가 맞습니다.");
							break bk;
						} else {
							System.out.println("홀수가 아닙니다.");
						} break;
					
					default: System.out.println("1 또는 2 둘 중 하나를 입력하세요.");
						
				}
			}
			System.out.printf("생성된 난수: %d\n", com);
			
			System.out.println("\n계속 하시겠습니까? Y/N");
			scanGuess.nextLine();
			while(true) {
				cntGame = scanGuess.nextLine();
				if(!cntGame.equals("Y") && !cntGame.equals("N")) {					
					System.out.println("다시 제대로 입력하세요.");
				} else{
					break;
				}
			}

		} while(cntGame.equals("Y"));
	}
}












package am;

public class ForEx1 {

	public static void main(String[] args) {
		//반복문 연습
		
		/*
		  [문제]
		   총 6번을 반복하면서 1~45까지의 수들 중 난수를 발생시켜보자.
		   TIP!
		    난수 생성은  Math.random()이며 특정 범위의 값을 원한다면 해당 범위값을 곱해준다.
		    특정값으로 시작하는 것을 원한다면 해당 시작값을 더해준다.
		    생성된 난수는 double형이기에 int나 long형을 원할 시 강제 형변환을 해주어야한다.
		 
		 
		 */
		
		for(int i=0; i<6; i++) { // 자료형이 변수 앞에 있다면 해당 변수를 선언한 것이다.
								 // 어디서 선언됐느냐가 증요한 이유는 사용 범위(영역)를 알 수 있기 때문이다.
			
			int randNum = (int) (Math.random()*45+1); // 1~45까지의 수증 둥 난수 발생 후
													  // 정수형으로 강제변환 (소수점 잘라내기)
													  // 정수형 변수인 randNum에 해당 값 저장
			
			System.out.printf("Random Number #%d: %d\r\n", i+1, randNum); // 출력. format은 숫자(%d)로 해준다.
																		// 앞 %d에 들어가는 내용은 i+1,
																		// 뒤 %d에 들어가는 내용은 randNum이다.
			
		}

		
		
		
	}

}

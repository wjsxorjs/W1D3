package pm;

public class ArrayEx7 {

	public static void main(String[] args) {
		

		/*
		 배열은 같은 자료형들이 여러개가 하나로 묶인 것
		 int[] ar;
		 ar = new int[3]; < ar이라는 변수에는 배열의 주소값이 저장된다.
		 
		 배열의 첫번째는 0번지, 그 다음부터 1, 2, 3... index로 접근한다.
		 ar[2] = 20; : ar의 2번지에 20에 저장하라.
		
		*/
		
		
		// 문자형 배열을 선언하고 생성하자.

//		char[] ar1; // 1) 배열 선언
//		ar1 = new char[3]; // 2) 배열 생성 | 변수가 생성된 배열을 레퍼런스한다. 참조(레퍼런스) 변수
		char[] ar1 = new char[3]; // 선언 + 생성
		ar1[0] = 'A';
		ar1[1] = 'B';
		ar1[2] = 'C';
		
		System.out.println(ar1[0]);
		
//		for(int i=0; i<3; i++) {
		for(int i=0; i<ar1.length; i++) {
			System.out.printf("ar1[%d] : %c\n", i, ar1[i]);
		}

	}

}

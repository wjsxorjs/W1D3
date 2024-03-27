package pm;

public class ArrayEx7 {

	public static void main(String[] args) {
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

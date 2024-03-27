package pm;

public class LottoEx11 {

	public static void main(String[] args) {
		// 정수 6개를 저장하는 배열 생성
		int[] lotto = new int[6];
		
		// 1~45까지의 수들 중 난수를 발생하여 lotto라는 배열에
		// 저장시킨다. 단, 중복이 되어서는 안된다.
		
			for(int i=0;i<lotto.length; /*i++*/) {				// 증감식 생략 가능
				int lotNum = (int) (Math.random() * 45 + 1); 	// 난수 생성
				//중복체크를 위한 반복문
				boolean chk = true; 							// 중복되지않았을때 true, 중복됐을 때 false로 정한다.
				for(int j=0; j<i; j++) {						//1개라도 중복되었을 때만 chk를 false로 바꾼다.
					if(lotNum == lotto[j]) {
						chk = false;
						break; 									// 이미 찾았으므로 불필요한 반복문 탈출
					}
				} // 해당 반복문의 결과는 "중복되었느냐, 중복되지않았느냐"로 나온다.
				
				if(chk) {
					lotto[i] = lotNum;
					i++;
				}
				
				
		}
		
		
		System.out.println("로또 당첨 번호는?\n+++++++++++++++++++++");
		
		for(int j=0; j<lotto.length; j++) {
			System.out.printf("%3d", lotto[j]);
		}
		
		System.out.println();

	}

}

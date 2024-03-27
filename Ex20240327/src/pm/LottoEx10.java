package pm;

public class LottoEx10 {

	public static void main(String[] args) {
		// 정수 6개를 저장하는 배열 생성
		int[] lotto = new int[6];
		
		// 1~45까지의 수들 중 난수를 발생하여 lotto라는 배열에
		// 저장시킨다. 단, 중복이 되어서는 안된다.
		
		int uniNums = 0;
		
//		while(true) {
			for(int i=0;i<lotto.length;) {
				boolean unique = true;
				int lotNum = (int) (Math.random() * 6 + 1); 	// 난수 생성
				for(int j=0; j<uniNums; j++) { 					//지금까지 저장된 값들까지만 비교
					if(lotto[j] == lotNum) { 					//중복값이 있다면
						unique = false;
					}
				}
				System.out.println(lotNum);
				if(unique) { 				// 중복 안됐을때만
											//  | 중복값이 있다면 unique는 false가 되어 
											//  | 해당 조건식 아래 명령문을 수행하지않는다.
					lotto[i] = lotNum;		// lotto배열에 새로운 값 저장
					i++;					// lotto 배열 i값 증가
					uniNums++;				// 저장된 값의 수 증가
				}
		}
		
		
		System.out.println("로또 당첨 번호는?\n+++++++++++++++++++++");
		
		for(int j=0; j<lotto.length; j++) {
			System.out.printf("%3d", lotto[j]);
		}
		
		System.out.println();
	}

}

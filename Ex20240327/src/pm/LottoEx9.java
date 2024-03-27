package pm;

public class LottoEx9 {

	public static void main(String[] args) {
		// 정수 6개를 저장하는 배열 생성
		int[] lotto = new int[6];
		
		// 1~45까지의 수들 중 난수를 발생하여 lotto라는 배열에
		// 저장시킨다. 단, 중복이 되어서는 안된다.
		int indCnt = 0;
		cnt:while(indCnt<6) {
			int lotNum = (int) (Math.random() * 45 + 1); // 난수 생성
//			System.out.println(lotNum); // 중복값이 나오는지 확인용
			for(int i=0; i<indCnt; i++) { // 중복값 확인용 반복문
				if(lotto[i] == lotNum) continue cnt; // 중복 시 while문 continue
			}
			lotto[indCnt] = lotNum; // 중복이 아닐시에만 이 명령문 수행
			indCnt++; // 로또 저장 수 증가
		}
		
		
		System.out.println("로또 당첨 번호는?\n+++++++++++++++++++++");
		
		for(int j=0; j<lotto.length;j++) {
			System.out.printf("%3d", lotto[j]);
		}
		
		System.out.println();
	}

}

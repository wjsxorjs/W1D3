package am;

public class DoWhileEx5 {
	
	public static void main(String[] args) {
		//프로그램 시작
		//do~while의 구성
		/*
		 	do{
		 		실행문1;
		 		실행문2;
		 	} while(조건식);
		 
		 	1~10까지 반복수행하는  do~while문 구현!
		 */
		
		
		
		int i = 1;
		
		// int i = 11; 
		
		do {
			System.out.println(i);
			i++;
		} while(i<=10);
		// 선처리 후비교이므로 조건에 맞지않아도 한 번은 무조건 수행함
		
		
		System.out.println("\r\n-------- 1~100까지의 합을 구하는 반복문(do~while) --------");
		
		int j = 1;
		int summ = 0;
		
		do {
			summ += j++;
		} while(j<=100);
		
		System.out.printf("  Sum of 1~100 : %d\r\n", summ);
		
	}

}

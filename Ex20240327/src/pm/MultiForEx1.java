package pm;

public class MultiForEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 
		 	[결과]
		 	*
		 	* *
		 	* * *
		 	* * * *
		 	* * * * *
		 
		 
		 */
	
	for(int i=1; i<=5;i++) {
		for(int j=0; j<i; j++) {
			System.out.print("* ");
//			System.out.printf("%-2s",'*');
		}
		System.out.println();
	}

	System.out.println("-------------");
	
	/*
	 
 	[결과]
 	* * * * *
 	* * * *
 	* * *
 	* *
 	*
 
 
    */
	
	for(int i=0; i<5;i++) {
		for(int j=0; j<5-i; j++) {
//			System.out.print("* ");
			System.out.printf("%-2s",'*');
		}
		System.out.println();
	}
	
	System.out.println("-------------");
	//아래와 같은 방법으로도 가능하다.
	for(int i = 5; i>0; i--) {
		for(int j=0; j<i; j++) {
			System.out.printf("%-2s", '*');
		}
		System.out.println();
	}
	
	
	
	System.out.println("-------------");
	
	for(int i=0; i<11;i++) {
		if(i<6) {
			for(int j=0; j<=i; j++) {
				System.out.printf("%-2s",'*');
			}
		} else {
			for(int k=0; k<11-i; k++) {
				System.out.printf("%-2s",'*');
			}
		}
		System.out.println();
	}
	
	
	

	
	}
}

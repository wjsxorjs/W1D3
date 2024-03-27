package pm;

public class ArrayEx8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] ar1 = new char[10];
		
		char alpha = 'A';
		
		for (int i=0; i<10; i++) {
			ar1[i] = alpha++;
		}
		
		for(int j=0; j<10; j++) {
			System.out.printf("ar1[%d] : %c\n", j, ar1[j]);
		}
		
		
	} 

}

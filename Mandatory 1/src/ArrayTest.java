
public class ArrayTest {

	public static void main(String[] args) {
		
		int[] ArrayFun = new int[10];
		int i = 0, j = 0, k = 0, count = 0;
//		
//		for(i = 0; i < ArrayFun.length; i++) {
//			
//			for(j = 0; j < ArrayFun.length; j++) {
//				
//				for(k = 0; k < ArrayFun.length; k++) {
//					count++;
//					System.out.println("i = " + i + "\tj = " + j + "\tk = " + k);
//				}
//			}
//		}
//	
//		System.out.println(count);
		
		count = 0;
		int tempCount;
		for(i = 0; i < ArrayFun.length; i++) {
			tempCount = 0;
			System.out.println("\ni = " + i + "\n");
			for(j = i + 1; j < ArrayFun.length; j++) {
				
				for(k = j + 1; k < ArrayFun.length; k++) {
					count++;
					tempCount++;
					System.out.println("i = " + i + "\tj = " + j + "\tk = " + k);
				}
			}
		
			System.out.println("\nGennemkørsler for i = " + i + ": " + tempCount);
		}
		
		System.out.println(count);
	}

}

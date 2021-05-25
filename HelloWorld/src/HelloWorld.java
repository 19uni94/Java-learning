
public class HelloWorld {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("HelloWorld!");
		//第一天學習
		int i,j = 0;
		//迴圈
		outerLoop:
		for (i=0;i<100;i++) {
			innerLoop:
				for(j=0;j<100;j++) {
					if(i == 20 && j== 20) {
						break outerLoop;
					}
					System.out.println("j:" + j);
				}	
			System.out.println("i:" + i);
		}
	System.out.println("i:" + i + "j:" + j);
	System.out.println();
	Degree();
	
	int x = 5;
    float y = 1.5f;//java 無法直接編譯float為小數整數型態,可以在小數數字後加f，或者寫成float x = (float)1.5
    System.out.println((new StringBuffer("x = ")).append(x).append(", y = ").append(y).toString());
	
	}
	
	private static void Degree() {
		int a;
		int b;
		for(a=0; a<20; a++) {
			if(a<=20) {
				System.out.println("a:"+ a);
			}
		}
		
	}
	

}

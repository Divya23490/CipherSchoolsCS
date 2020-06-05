
public class Mirrors {

	static int SIZE=7;
	public static void main(String[] args ) {
		line();
		topHalf(SIZE);
		bottomHalf(SIZE);
		line();
	}
	 // outputs a solid line
    public static void line() {
    	System.out.print("+");
        for (int i = 1; i <= (2*SIZE); i++) {
            System.out.print("-");
        }
        System.out.println("+");
        
    }
	public static void topHalf(int SIZE) {
		
		int size1=SIZE;
		for (int line=1;line<=size1;line++) {
			 System.out.print("|");
		for(int space=1;space<SIZE;space++){
		
			System.out.print(" ");
		}
		if(SIZE==1) {
			
			System.out.print("<");
			for(int i=1;i<size1;i++) {
				if(size1%2==0) {
					System.out.print("--");
				}
				else {
					System.out.print("==");
				}
			}
			System.out.print(">");
		}
		else if(SIZE%2==0) {
			System.out.print("/");
			for(int i=0;i<(size1-SIZE);i++) {
				System.out.print("==");
			}
			System.out.print("\\");
		}
		else {
			System.out.print("/");
			for(int i=0;i<(size1-SIZE);i++) {
				System.out.print("--");
			}
			System.out.print("\\");
		}
		for(int space=1;space<SIZE;space++){
			
			System.out.print(" ");
		}
			System.out.println("|");
		SIZE--;
		}

	}
	public static void bottomHalf(int SIZE) {
		int size1=SIZE;
		for (int line=1;line<size1;line++) {
			 System.out.print("|");
		for(int space=0;space<=(size1-SIZE);space++){
		
			System.out.print(" ");
		}
		if(SIZE%2==0) {
			System.out.print("\\");
			for(int i=2;i<SIZE;i++) {
				System.out.print("==");
			}
			System.out.print("/");
		}
		else {
			System.out.print("\\");
			for(int i=2;i<SIZE;i++) {
				System.out.print("--");
			}
			System.out.print("/");
		}
		for(int space=0;space<=(size1-SIZE);space++){
			
			System.out.print(" ");
		}
			System.out.println("|");
		SIZE--;
		}

		
	}
	
}

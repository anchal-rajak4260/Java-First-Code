package sectionBfees;

public class ArithmeticException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = new int[5];
		
		
		System.out.println("hello Bye");
		
		System.out.println(a[8]);	
		
		System.out.println("hello world");
		
		
		int b = 5;
		int c = 0;
		
		try {
			System.out.println(a[8]);
			
			System.out.println(b/c);
			
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("good bye");
		}
		
	}

}

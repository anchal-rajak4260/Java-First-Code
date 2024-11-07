package sectionBfees;

public class StringBasicToAdvance {
	public static void main(String[]args) {
		String s1 = "Rishika";
		String s2 = "Solanki";
		String s3 = s1.concat(s2);
		
		System.out.println(s3);
		
		
		
		char c[] = {'a', 'n','c','h','a','l'};	
		String name ="Anchal Rajak ";  // String Literal ("")	
		String sameName ="Anchal";
		String newName = new String ("Rajak");
		
		System.out.println(c);
		System.out.println(name);
		System.out.println(sameName);
		System.out.println(newName);
		
		
		
		if(name.equals(newName)){// equals() string method 
			System.out.println("Both are same");	
		}
		else {
			System.out.println("Not same");	
		}
		
		
		
		
        String greeting = "Hello, World!";
        
        int length = greeting.length();
        String upper = greeting.toUpperCase();
        String sub = greeting.substring(0, 5);

        System.out.println("Length: " + length);
        System.out.println("Upper: " + upper);
        System.out.println("Substring: " + sub);
		
        String d4 = "Hello Java    ";
        System.out.println( d4 + " String Method");
        System.out.println( d4.trim() + " String Method");
        
		//if(name == sameName) {// ==operators string method 
		// System.out.println("Both are same");
		//}
		

		
		
		
	}

}

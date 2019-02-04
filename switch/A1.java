import java.util.Scanner;
class A1{
	public static void main(String args[]) {
		char c;
		Scanner obj = new Scanner(System.in);
	 	System.out.println("Enter the character:");
	 	c=obj.next().charAt(0);
        
		switch(c)
		{
			case 'A':
			case 'a':
				System.out.println("Vowel");
				break;
			

			case 'E':
			case 'e':
				System.out.println("Vowel");
				break;
			

			case 'I':
			case 'i':
				System.out.println("Vowel");
				break;
			

			case 'O':
			case 'o':
				System.out.println("Vowel");
				break;
			

			case 'U':
			case 'u':
				System.out.println("Vowel");
				break;
			
			default:{
				System.out.println("Not a Vowel");
			} 
		}
		}
		
	}

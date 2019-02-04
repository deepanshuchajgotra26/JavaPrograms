//Program to show that the given character is Upper case, lower case or special case
import java.util.Scanner;
class A{
	 public static void main(String[] args) {
	 	 char c;
	 	Scanner obj = new Scanner(System.in);
	 	System.out.println("Enter the character:");
	 	c=obj.next().charAt(0);

	 	if(c>='a' && c<='z'){
	 		System.out.println("This is lower case");
	 	}
	 	else if(c>='A' && c<='Z'){
	 		System.out.println("This is upper case");
	 	}
	 	else{
	 		System.out.println("Special case");
	 	}


	}
}

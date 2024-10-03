package Data;
import java.util.Scanner;

public class Math {
	
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("For Yes Enter 1 and For No Enter 0 :");
		int num = sc.nextInt();
		
		while(num !=0) {
		
		System.out.print("Enter the 1 st number :");
		int a = sc.nextInt();
		
		System.out.print("Enter the operator +,-,/,*,% :");
		String operator = sc.next();
		
		System.out.print("Enter the 2 st number :");
		int b = sc.nextInt();
		
		switch(operator) {
		
		case"+":
			System.out.println(a+b);
		break;
		
		case"-":
			System.out.println(a-b);
		break;
		case"*":
			System.out.println(a*b);
		break;
		case"/":
			if(b==0) {
				System.out.println("not define");
			}
			else
			{
				System.out.println(a/b);
			}
		break;
		case"%":
			System.out.println(a%b);
			break;
			
		default:
			System.out.println("Enter the valid ");
		}
		
		}
		
		
		
				
	}

}

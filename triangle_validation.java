import java.util.Scanner;
public class triangle_validation {
	public static void main(String[] args)
	{
		Scanner sc =new Scanner(System.in);
	/*	int a,b,c;
		System.out.println("Enter the value of a");
		a=sc.nextInt();
		System.out.println("Enter the value of b");
		b=sc.nextInt();
		System.out.println("Enter the value of c");
		c=sc.nextInt();
		sc.close();
		if((a+b)>c)
		{
			System.out.println("Valid Triangle");
		}
		else if((b+c)>a) System.out.println("valid triangle");
		else if((c+a)>b) System.out.println("valid triangle");
		else System.out.println("Invalid triangle");
		*/
	
		System.out.println("Enter the character");						//check cases for alphabets
		char c=sc.next().charAt(0);
		int n=(int)c;
		if(n>64 && n<91)
			System.out.println("Upper case");
		else if(n>96 && n<123) System.out.println("lower case");
		else if(n>47 && n<58) System.out.println("Numeric number");
		else System.out.println("Specical character");
		
	}

}

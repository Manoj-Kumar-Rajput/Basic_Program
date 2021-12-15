import java.util.Scanner;
public class Simple_program 
{
	public static void main(String[] args)
	{
		Scanner sc =new Scanner(System.in);
		int n1,sum,n2;
		System.out.println("Enter the first number");
		n1=sc.nextInt();
		System.out.println("Enter the first number");
		n2=sc.nextInt();
		sc.close();
		sum=n1+n2;
		System.out.println("Sum = "+sum);         // sum of two numbers
	}

}

import java.util.Scanner;
public class fibonacci {
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		int num1 =0;
		int num2=1;
		int sum=0;
		System.out.println("Enter the number where you want fibonacci series");
		int n=s.nextInt();
		System.out.println(" Your Fibonacci series is :");
		System.out.print(num1+" "+num2+" ");
		for(int i=0;i<n-2;i++)
		{
			sum=num1+num2;
			num1=num2;
			num2=sum;
			System.out.print(sum+" ");
		}
	}

}

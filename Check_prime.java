import java.util.Scanner;
public class Check_prime {
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=s.nextInt();
		int ch=0;
		int di=1;
		while(di<=num)
		{ 
			if(num%di==0)
			{
				ch++;
			}di++;
			
		}
		
		if(ch==2)
		{
			System.out.println("This no.is a prime number");
		}
		else
		{
			System.out.println("This no.is not prime number");
		}
	
	}

}

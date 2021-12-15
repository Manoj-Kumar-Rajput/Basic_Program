import java.util.Scanner;
public class pallidrome 
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
        System.out.println("Enter the number");
		int num=s.nextInt();
		int save=num;
		int rev=0;
		int sum=0;
		while(num>0)
		{
				rev=num%10;
				sum=(sum*10)+rev;
				num=num/10;
		}
			if(sum==save)
			{
				System.out.println(save+" is a pallindrome");
				
			}
			else
			{
				System.out.println(save+" is not pallindrome");
			}
	}
}

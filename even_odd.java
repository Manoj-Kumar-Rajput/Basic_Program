import java.util.Scanner;
public class even_odd {
	public static void main(String[] args)
	{
Scanner sc=new Scanner(System.in);
		
	    System.out.print("enter the number");             //even or odd program
	    int no=sc.nextInt();
	    if(no%2==0)
	    {
	    	System.out.println("Even no.");
	    	no=sc.nextInt();
	    }
	    else
	    	System.out.println("Odd no.");
	    	no=sc.nextInt();
	}

}

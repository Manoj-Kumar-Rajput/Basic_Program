import java.util.Scanner;
public class factorial {
	public static void main(String[] args)
	{
        Scanner sc=new Scanner(System.in);
		
	    System.out.print("enter the number");             //factorial program
	    int no=sc.nextInt();
	    int fact=no;
	    while(no>1)
	    {
	    	fact=fact*(no-1);
	    	no--;
	    	
	    }System.out.println("Factorial is "+fact);
	    

	}

}

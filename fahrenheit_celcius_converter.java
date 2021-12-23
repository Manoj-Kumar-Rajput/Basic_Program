import java.util.Scanner;
public class fahrenheit_celcius_converter {
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		boolean condition=true;
		float choice,fah,cel;
		while(condition)
		{
			System.out.println("Press 1. for fahrenheit to celsius");
			System.out.println("Press 2. for Celsius to fahrenheit");
			System.out.println("Press any key for exit....");
			System.out.println("Enter your choice");
			choice =input.nextInt();
			if(choice==1)
			{
				System.out.println("Enter your fahrenheit value");
				fah =input.nextFloat();
				cel=(fah-32)*5/9;
				System.out.println("Celsius = "+cel+"°C");			//for temperature symbol press alt+248
			}
			else if(choice==2)
			{
				System.out.println("Enter your Celsius value");
				cel =input.nextFloat();
				fah=(cel*9/5)+32;
				System.out.println("Fahrenheit = "+fah+"°F");
			}
			else
			{
				condition=false;
			}
		}
	}
}

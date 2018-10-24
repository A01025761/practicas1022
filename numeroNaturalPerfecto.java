import java.util.Scanner;
public class numeroNaturalPerfecto
{
	/*Santiago Fernandez
	October 24, 2018
	Trabajo de intro a carrera" */

	public static void main (String[]args)
{
	int theNumber=0;
	int size=0;
	int y=0;
	int x=0;
	int counter=0;
	Scanner keyboard= new Scanner(System.in);

	//size = theNumber.length();
	System.out.println("enter a number ");
	theNumber = keyboard.nextInt();


	 for(counter=1; counter<=theNumber-1; counter++){
	  y= theNumber%counter;

	  if(y==0)
	  x= x + counter;}


	 if (x==theNumber)
	System.out.println("El numero es natural perfecto");
	else
	System.out.println("El numero NO es natural perfecto");
}
}

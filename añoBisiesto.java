import java.util.Scanner;
public class añoBisiesto
{
	/*Santiago Fernandez
	October 16, 2018
	Trabajo de intro a carrera" */


	public static void main (String[]args)
{
	int año= 0;
	Scanner keyboard= new Scanner(System.in);

	System.out.println("Ingrese un año");
	año=keyboard.nextInt();

	if(año%4 != 0)
	System.out.println("El año NO es bisciesto");
	else
	System.out.println("El año SI es biciesto");
}
}
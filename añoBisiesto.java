import java.util.Scanner;
public class a�oBisiesto
{
	/*Santiago Fernandez
	October 16, 2018
	Trabajo de intro a carrera" */


	public static void main (String[]args)
{
	int a�o= 0;
	Scanner keyboard= new Scanner(System.in);

	System.out.println("Ingrese un a�o");
	a�o=keyboard.nextInt();

	if(a�o%4 != 0)
	System.out.println("El a�o NO es bisciesto");
	else
	System.out.println("El a�o SI es biciesto");
}
}
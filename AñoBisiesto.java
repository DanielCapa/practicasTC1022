import java.util.Scanner;

public class A�oBisiesto {

	public static void main (String [] args) {

		int a�o;
		Scanner key = new Scanner (System.in);

		System.out.print("Introduzca el a�o para saber si es bisiesto: ");
		a�o = key.nextInt ();

		if ((a�o % 4 == 0) && (a�o % 100 != 0)) {
			System.out.println("El a�o s� es bisiesto :D");

		}

		else {
			System.out.println("El a�o no es bisiesto :C");
		}


	}
}
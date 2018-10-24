import java.util.Scanner;

public class AñoBisiesto {

	public static void main (String [] args) {

		int año;
		Scanner key = new Scanner (System.in);

		System.out.print("Introduzca el año para saber si es bisiesto: ");
		año = key.nextInt ();

		if ((año % 4 == 0) && (año % 100 != 0)) {
			System.out.println("El año sí es bisiesto :D");

		}

		else {
			System.out.println("El año no es bisiesto :C");
		}


	}
}
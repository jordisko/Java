import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

import javax.print.DocFlavor.INPUT_STREAM;

public class Ejercicio40Java {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InputStream inputStream = System.in;
		//NUMERICO
		Scanner sc = new Scanner(inputStream);
		System.out.println("Introduce un numero: ");
		int numero = sc.nextInt();
		System.out.println("El numero introducido es :" + numero);
		//BOOLEANO
		Scanner sx = new Scanner(inputStream);
		System.out.println("Introduce un booleano (true/false): ");
		boolean boleano = sx.nextBoolean();
		System.out.println("El booleano introducido es: "+ boleano);
		//STRING
		Scanner sy = new Scanner(inputStream);
		System.out.println("Introduce una cadena: ");
		String cadena = sy.nextLine();
		System.out.println("La cadena introducida es : "+ cadena);
	}

}

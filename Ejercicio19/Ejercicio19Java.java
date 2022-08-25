import java.lang.reflect.Array;

public class Ejercicio19Java {

	public static void main(String[] args) {
		//1// NumerosPares();
		//2// int[] arr = {3,6,9,10,12,15,14};
		//2// divisiblesDe3(arr);
		//3//saludos(4);
	}

	// 1
	public static void NumerosPares() {
		int numero = 2;
		while (numero <= 50) {
			System.out.println(numero);
			numero += 2;
		}
	}

	// 2
	public static int[] divisiblesDe3(int[] arr) {
		String arrTmp = "";
		for (int item : arr) {
			if (item % 3 == 0) {
				arrTmp = String.valueOf(item);
			}
			System.out.println(arrTmp);

		}

		return null;
	}

	// 3
	public static void saludos(int numerodeveces) {
		int contador1 = 0;
		do {
			System.out.println("Hola");
			contador1++;
		} while (contador1 <= numerodeveces);
	}
	//4
	public static void eliminandoAbecedario() {
		String abecedario= "ABCDEFGHIJKLMNÑOPQRSTUVWXYZ";
		String guardado = "";
		StringBuilder abecedarioalreves = new StringBuilder(abecedario);
		abecedario = abecedarioalreves.reverse().toString();
		for (char i :abecedario {
			guardado += (abecedario , abecedario.length();
			abecedario = abecedario(0,abecedario.length()-1);
			guardado += 
			
			
		}
	}
}

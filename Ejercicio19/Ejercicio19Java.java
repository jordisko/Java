import java.lang.reflect.Array;

public class Ejercicio19Java {

	public static void main(String[] args) {
		//NumerosPares();
		int[] arr = {3,6,9,10,12,15,14};
		divisiblesDe3(arr);
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
			if(item%3==0) {
				arrTmp += String.valueOf(item);
				System.out.println(arrTmp);	
			}
		}
	
		return null;
	}
}

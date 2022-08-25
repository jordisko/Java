
public class Ejercicio20Java {
	public static void main(String[] args) {
		/*1*/ bucle3();
		/*2*/ bucle4(5);
		
	}
	//1
	public static void bucle3() {
		int contador = 0;
		while (contador<3) {
			System.out.println("hola"+(contador+1));
			contador++;
		}
		
	}
	//2
	public static void bucle4(int numerodeveces) {
		int contador2=1;
		if (numerodeveces<=5) {
			while (contador2 <=5 && contador2<=numerodeveces) {
			System.out.println("Iteración"+(contador2));
			contador2++;
		}
		}
		else 
			System.out.println("Solo se puede hacer el bucle hasta 5 veces, prueba poniendo un numero igual o menor a 5");
	}

}

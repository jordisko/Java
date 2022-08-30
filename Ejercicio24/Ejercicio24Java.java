
public class Ejercicio24Java {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int contador1 =2;
		int contador2 =9;
		int contador3=0;
		String resultado ="";
		//HOJAS
		while (contador1 <=20) {
			resultado = resultado+" ".repeat(contador2)+"\033[48;5;28m*\033[0m".repeat(contador1)+" ".repeat(contador2)+"\n";
			contador1=contador1+2;
			contador2--;
		}
		//TRONCO
		if (contador1>20) {
			while(contador3<3) {
				resultado = resultado+" ".repeat(8)+"\033[48;5;215m*\033[0m".repeat(4)+" ".repeat(8)+ "\n";
				contador3++;
			}
		}
		System.out.println(resultado);
		}

	}

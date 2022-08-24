
public class Ejercicio18Java {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int contador1 =2;
	int contador2 =9;
	String resultado ="";
	//HOJAS
	while (contador1 <=20) {
		resultado = resultado+" ".repeat(contador2)+"*".repeat(contador1)+" ".repeat(contador2)+"\n";
		contador1=contador1+2;
		contador2--;
	}
	//TRONCO
	if (contador1>20) {
		resultado = resultado+" ".repeat(8)+"*".repeat(4)+" ".repeat(8)+ "\n";
		resultado = resultado+" ".repeat(8)+"*".repeat(4)+" ".repeat(8)+ "\n";
		resultado = resultado+" ".repeat(8)+"*".repeat(4)+" ".repeat(8)+ "\n";
	}
	System.out.println(resultado);
	}

}

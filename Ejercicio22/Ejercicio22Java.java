
public class Ejercicio22Java {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//UKRANIA
		String BACKROUND=("\033[48;5;");
		String AZUL=("39m");
		String AMARILLO=("220m");
		String BLANCO= ("255m");
		String ROJO= ("196m");
			
		String RESET =("\033[0m");

		String ESPACIOS= " ".repeat(24);
		//UKRANIA
		int lineasazul=0;
		int lineasamarillo=0;
		while (lineasazul<5){
			System.out.println(BACKROUND+AZUL+ESPACIOS+RESET);
			lineasazul++;
		}
		while (lineasamarillo<5) {
			System.out.println(BACKROUND+AMARILLO+ESPACIOS+RESET);
			lineasamarillo++;
		}
		//FRANCIA
		int lineas=0;
		while(lineas<10) {
			System.out.println(BACKROUND+AZUL+ESPACIOS.split(0,7));
		}
	}
}

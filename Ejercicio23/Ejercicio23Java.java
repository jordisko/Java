
public class Ejercicio23Java {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
	System.out.println(Arcoiris("Jordi Campos :)"));

	}
	public static String Arcoiris (String cadena) {
		//cambio de color de letra o background
				String BACKGROUND=(";48;5;");
				String LETRA=(";38;5;");
				//definición de colores
				String AZUL=("39");
				String AMARILLO=("220");
				String BLANCO= ("255");
				String ROJO= ("196");
				String NEGRO= ("16");
				String VERDE= ("40");
				String MAGENTA= ("128");
				String ROSA= ("201");
				//FORMATO DE LETRA
				String BOLD =("1");
				String FAINT =("2");
				String ITALIC =("3");
				String UNDERLINED =("4");
				String INVERSE = ("7");
				String STRIKETHROUGH = ("9");
				
				
				//RESET	E INICIO
				String RESET =("\033[0m");
				String FINAL=("m");
				String INICIO =("\033[");
				String formatoTexto = ("");
				String colorTexto = ("");
				String colorBackground =("");

		int numFormatoTexto = (int) (Math.random() * (6));
			switch (numFormatoTexto) {
			case 0:
				formatoTexto= BOLD;
				
				break;
			case 1:
				formatoTexto= FAINT;
				
				break;
			case 2:
				formatoTexto= ITALIC;
				
				break;
			case 3:
				formatoTexto= UNDERLINED;
				
				break;
			case 4:
				formatoTexto= INVERSE;
				
				break;
			case 5:
				formatoTexto= STRIKETHROUGH;
				
				break;
			}
		int numColorTexto = (int) (Math.random() * (8));
			switch (numColorTexto) {
		case 0:
			colorTexto= AZUL;
			
			break;
		case 1:
			colorTexto= AMARILLO;
			
			break;
		case 2:
			colorTexto= BLANCO;
			
			break;
		case 3:
			colorTexto= ROJO;
			
			break;
		case 4:
			colorTexto= NEGRO;
			
			break;
		case 5:
			colorTexto= VERDE;
			
			break;
		case 6:
			colorTexto= MAGENTA;
			
			break;
		case 7:
			colorTexto= ROSA;
			
			break;
			
			}
		int numColorBackground = (int) (Math.random() * (8));
			switch (numColorBackground) {
		case 0:
			colorBackground= AZUL;
			
			break;
		case 1:
			colorBackground= AMARILLO;
			
			break;
		case 2:
			colorBackground= BLANCO;
			
			break;
		case 3:
			colorBackground= ROJO;
			
			break;
		case 4:
			colorBackground= NEGRO;
			
			break;
		case 5:
			colorBackground= VERDE;
			
			break;
		case 6:
			colorBackground= MAGENTA;
			
			break;
		case 7:
			colorBackground= ROSA;
			
			break;}
	String resultado=(INICIO+formatoTexto+LETRA+colorTexto+BACKGROUND+colorBackground+FINAL+cadena+RESET);
	return (resultado);
	}
	
}

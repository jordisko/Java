import java.io.InputStream;
import java.util.Scanner;

public class Ejercicio41Java {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String unouno=" ",dosuno=" ",tresuno=" ",unodos=" ",dosdos=" ",tresdos=" ",unotres=" ",dostres=" ",trestres=" " ;
		
		String introduccion ="Esto es una partida de 3 en ralla. \n";
		String partida= "| |1|2|3|\n|1|"+unouno+"|"+dosuno+"|"+tresuno+"|\n|2|"+unodos+"|"+dosdos+"|"+tresdos+"|\n|3|"+unotres+"|"+dostres+"|"+trestres+"|\n";	
		int turno=0;
		String xoy="X";
		String instruccioninicialxoy="Jugador "+xoy+ ". ingresa las cordenadas (xy) para colocar la pieza.";
		while (turno<=9){
			if (turno==0 | turno%2==0) {
				xoy ="X";}
			else {
				xoy="Y";
			}
			partida= "| |1|2|3|\n|1|"+unouno+"|"+dosuno+"|"+tresuno+"|\n|2|"+unodos+"|"+dosdos+"|"+tresdos+"|\n|3|"+unotres+"|"+dostres+"|"+trestres+"|\n";
			instruccioninicialxoy="Jugador "+xoy+ ". ingresa las cordenadas (xy) para colocar la pieza.";
			InputStream inputStream= System.in;
			System.out.println(introduccion+partida+ instruccioninicialxoy);
			Scanner s0 = new Scanner (inputStream);
			int numero = s0.nextInt();
			switch (numero) {
			case (11):
				unouno=xoy;
				
				break;
			case (12):
				unodos=xoy;
				
				break;
			case (13):
				unotres=xoy;
				
				break;
			case (21):
				dosuno=xoy;
				
				break;
			case (22):
				dosdos=xoy;
				
				break;
			case (23):
				dostres=xoy;
				
				break;
			case (31):
				tresuno=xoy;
				
				break;
			case (32):
				tresdos=xoy;
				
				break;
			case (33):
				trestres=xoy;
				
				break;

			}
			turno++;
		}
		
	System.out.println("La partida ha acabado :)");	
		
	}	

}
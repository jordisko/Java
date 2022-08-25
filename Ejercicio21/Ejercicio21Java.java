
public class Ejercicio21Java {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	JavaOrNull("java");
	UsuarioContraseña("admin","1234");
	System.out.println(paroimpar(7));
	}
	public static String JavaOrNull(String parametro) {
		if (parametro == "java"){
			System.out.println("java");
		}
		else
			System.out.println("Null");
	
	return null;

	}
	//1
	public static String UsuarioContraseña(String usuario, String contraseña) {
		if (usuario=="admin" & contraseña=="1234") {
			System.out.println("Login True");
			}
		else
			System.out.println("Login False");
	return null;
	}
	public static boolean paroimpar(int number) {
		boolean resultado =false;
		if (number%2==0) {
			resultado = true;
		
			
		}
		else 
			resultado = false;
	return resultado;
	}
}

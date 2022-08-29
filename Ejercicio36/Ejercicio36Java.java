package Ejercicio36;

public class Ejercicio36Java {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
class Operario extends Empleado{

	@Override
	public String toString() {
		return "Operario []";
	}
	
}
class Directivo extends Empleado{

	@Override
	public String toString() {
		return "Directivo []";
	}
	
}
class Oficial extends Operario{

	@Override
	public String toString() {
		return "Oficial []";
	}
	
}
class Tecnico extends Operario{

	@Override
	public String toString() {
		return "Tecnico []";
	}
	
}


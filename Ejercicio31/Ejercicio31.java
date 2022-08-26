
public class Ejercicio31 {

	static String[] tecnologies = {"Markdown", "Regexp", "HTML","CSS","JS","SQL","JAVA"};
	static int numero = 0;
	static int numero2= 0;
	static int [] resultado = {1,1};
	static int contador=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		recorrerRecursivamente(tecnologies);
		recorrerRecursivamente2(tecnologies);
		fibonacciRecursivo();
	}
	
	//1
	public static void recorrerRecursivamente(String[] recorrer) {
		System.out.println(recorrer[numero]);
		numero++;
		if (numero < recorrer.length) {
			recorrerRecursivamente(recorrer);
		}
	}		
		

	//2
	public static void recorrerRecursivamente2(String[] recorrer2) {
		System.out.println(recorrer2[numero2]);
		numero2++;
		if (recorrer2[numero2] != "HTML") {
			recorrerRecursivamente2(recorrer2);

		}
	}
	//3
	public static void fibonacciRecursivo() {
		System.out.println(resultado[contador]+resultado[contador+1]);
		contador++;
		int i;
		   
	       // create a new array of size n+1
	       int resultado[] = new int[resultado.length + 1];
	   
	       // insert the elements from
	       // the old array into the new array
	       // insert all elements till n
	       // then insert x at n+1
	       for (i = 0; i < resultado.length; i++)
	           resultado[i] = resultado[i];
	   
	       resultado[resultado.length]=(resultado[contador]+resultado[contador+1]);
	       if (resultado[contador+1]<100) {
				fibonacciRecursivo();
			}
		
	}
}
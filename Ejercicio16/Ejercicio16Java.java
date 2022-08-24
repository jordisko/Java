
public class Ejercicio16Java {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	float result = Math.round(Math.random());
	System.out.println(result);
	boolean boolresult = false;
	if (result == 0) {
		boolresult=false;
	}
	if (result == 1) {
		boolresult=true;
	}
	System.out.println(boolresult);
	
	if (result ==0){
		boolresult=false;
	}
	else
		boolresult=true;
	System.out.println(boolresult);
	boolean boolresult2 = (result==0) ? false:true;
	System.out.println(boolresult2);
	//2
	double temperatura = 25.4;
	if (temperatura < 10) {
		System.out.println("Climas frios");
		if (temperatura < 5){
			System.out.println("Clima polar");
		}
		if (temperatura >=5) {
			System.out.println("Clima de alta montaña");
		}
	}
	if (temperatura >=10 & temperatura <20) {
		System.out.println("Climas templados");
		if (temperatura <13.5) {
			System.out.println("Clima Oceanico");
		}
		if (temperatura <16.5 & temperatura >=13.5) {
			System.out.println("Clima mediterraneo");
		}
		if (temperatura <20 & temperatura >=16.5) {
			System.out.println("Clima continental");
		}
	}
	if (temperatura >=20){
		System.out.println("Climas calidos");
		if (temperatura <23.5) {
			System.out.println("Clima Ecuatorial");
		}
		if (temperatura >=23.5 & temperatura <26.5) {
			System.out.println("Clima Tropical");
		}
		if (temperatura >26.5) {
			System.out.println("Clima Desertico");
		}
	}
	if (temperatura <10) {
		System.out.println("Climas frios");
		if (temperatura<5) {
			System.out.println("Clima polar");
		}
		else
			System.out.println("Clima de alta montaña");
	}
	else if (temperatura<20) {
		System.out.println("Climas templados");
		if (temperatura<13.5) {
			System.out.println("Clima Oceanico");
		}
		else if (temperatura <16.5) {
			System.out.println("Clima mediterraneo");
		}
		else
			System.out.println("clima continental");
	}
	else
		if (temperatura <23.5) {
			System.out.println("Clima Ecuatorial");
		}
		else if (temperatura <26.5) {
			System.out.println("Clima tropical");
		}
		else
			System.out.println("Clima Desertico");
	}
}

package logic;

public class Calcolatore {

	public static int somma(int a, int b) {

		return a + b;
	}

	public static int sottrazione(int a, int b) {

		return a - b;
	}

	public static int moltiplicazione(int a, int b) {

		return a * b;
	}

	public static Object divisione(int a, int b) {
		
		if(b==0) {
			
			return "Error";
		}

		return a / b;
	}

	public static void main(String[] args) {

		int a = 6;
		int b = 2;

		System.out.println(a + " + " + b + " = " + somma(a, b));
		System.out.println(a + " - " + b + " = " + sottrazione(a, b));
		System.out.println(a + " * " + b + " = " + moltiplicazione(a, b));
		System.out.println(a + " / " + b + " = " + divisione(a, b));

	}

}

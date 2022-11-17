package bestrucControlFlujo;

public class Video14_Factorial {

	public static void main(String[] args) {
		
		int numero = 5;
		int factorial = 1;
		
             //factorial de 0 y 1 es 1
		if (numero == 0 || numero == 1) {
			factorial = 1;
		} else {

			while (numero != 0) {
				factorial = factorial * numero;
				numero--;
			}
			
			System.out.println(factorial);

		}
	}
}

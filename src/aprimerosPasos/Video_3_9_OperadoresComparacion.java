package aprimerosPasos;

public class Video_3_9_OperadoresComparacion {

	public static void main(String[] args) {

		double sueldo1 = 10000.51558;
		double sueldo2 = 450055.052558;

		System.out.println(sueldo1 > sueldo2);
		System.out.println(sueldo1 < sueldo2);
		System.out.println(sueldo1 >= sueldo2);
		System.out.println(sueldo1 <= sueldo2);
		System.out.println(sueldo1 != sueldo2);
		// Sueldo 1 es igual a sueldo 2 es falso
		// Importante para comparar String usar .equals( )
		System.out.println(sueldo1 == sueldo2);
	}

}

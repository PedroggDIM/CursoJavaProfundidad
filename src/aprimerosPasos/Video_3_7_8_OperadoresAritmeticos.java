package aprimerosPasos;

public class Video_3_7_8_OperadoresAritmeticos {

	public static void main(String[] args) {

		// Operadores aritmeticos
		int suma = 10 + 20;
		System.out.println(suma);

		int resta = 20 - 10;
		System.out.println(resta);

		int multiplica = 20 * 10;
		System.out.println(multiplica);

		int divide = 20 / 10;
		System.out.println(divide);

		int modulo = 20 % 10; // resto de la división
		System.out.println(modulo);

		int count = 0;
		count++; // a count le sumo 1
		count++;
		System.out.println(count++);
		System.out.println(count);// imprime 3

		int num = 10;
		num--;
		num--;
		System.out.println(--num);

		System.out.println(num); // imprime 7
		num = num - 5; // devuelve 2
		System.out.println(num);
	}

}

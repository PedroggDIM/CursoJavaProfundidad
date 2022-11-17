package bestrucControlFlujo;

public class Video_4_2_If_Else {
	public static void main(String args[]) {

		int edad = 15;
		boolean esMayorDeEdad = edad >= 18;

		if (esMayorDeEdad) {
			System.out.println("Puede entrar");
		} else if (edad >= 15) { // Podemos poner tantas else if como queramos.
			System.out.println(("Llamamos a tus padres y no entras"));
		} else {                 // Solo poner último else porque ninguna de las otras se cumple.
			System.out.println("No entras");
		}
	}
}

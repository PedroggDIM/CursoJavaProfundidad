package bestrucControlFlujo;

public class Video_7_switch_sin_break {

	public static void main(String[] args) {
		int opcion = 0;

		switch (opcion) {
		case 0:
			System.out.println("Opción 0");
			// Imprimirá hasta break 2 al no tener el break.
		case 1:
			System.out.println("Opción 1");

		case 2:
			System.out.println("Opción 2");
			break;
		case 3:
			System.out.println("Opción 3");
			break;
		default:
			System.out.println("Opción 4");
			break;
		}

	}

}

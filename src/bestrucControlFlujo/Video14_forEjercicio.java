package bestrucControlFlujo;

public class Video14_forEjercicio {

	public static void main(String[] args) {

		outer: for (int i = 0; i <= 20; i++) {

			System.out.println("Tabla del " + i + " al 20.");

			inner: for (int j = 0; j <= 20; j++) {
				if (j % 2 == 0) {
					System.out.println(i + "x" + j + "=" + i * j); // imprimir pares
				}
				// System.out.println(i + "x" + j + "=" + i * j); //imprimir tabla 20 completa
			}
			System.out.println("\n");
		}
	}
}

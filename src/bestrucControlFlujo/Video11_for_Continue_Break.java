package bestrucControlFlujo;

public class Video11_for_Continue_Break {

	public static void main(String[] args) {

		int tabla = 2;

		for (int i = 0; i <= 10; i++) {
			if (i % 2 == 0) { 
				continue;     //continue rompe la iteración particular y vuelve al for con el ciclo
				              // por eso cuando vale 0 entra y en el continue se rompe esa iteración y sube
							  // vale 1 imprime // vale 2 con continue vuelve arriba // vale 3 no entra e imprime...	
				              // si fuera un break con el primer 0 rompe el ciclo completo  y no imprime nada
				              // con break rompe el ciclo completo // con continue rompe la iteración.
			}
			System.out.println(tabla + " x " + i + " = " + (tabla * i));
		}

	}

}

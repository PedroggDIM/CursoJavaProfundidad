package bestrucControlFlujo;

public class Video_4_1_if {

	public static void main(String args[]) {
		
		int edad = 22;
		boolean puedeEntrar = (edad>=18);   // edad>=18 es una expresión booleana (true o false)
		
		if (puedeEntrar) {
			System.out.println("Puede ingresar al lugar.");
		}else {
		    System.out.println("Solo se permiten mayores de edad.");	
		}
		
	}
}

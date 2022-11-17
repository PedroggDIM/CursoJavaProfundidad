package bestrucControlFlujo;

public class Video13_tagsCiclos {

	public static void main(String[] args) {

		outer: for (int i = 0; i <= 10; i++) {

			System.out.println("Tabla del " + i);

			inner: for (int j = 0; j <= 10; j++) {
				if (j % 2 == 0) {
					//break outer;      //Puedo romper el ciclo interno o externo.
					break inner;      
				}
				System.out.println(i + "x" + j + "=" + i * j);

			}
		}

	}

}

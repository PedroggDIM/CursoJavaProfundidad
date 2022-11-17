package cClasesObjetosConstructores;

class Persona {	
	// atributos 
   String nombre;
   int edad;
   char genero;
   
   //constructor
    Persona(){
	   this("Nombre por defecto", 22, 'M');   //Con el constructor vacío pongo parámetros por defecto.
	   System.out.println("Constructor por defecto");
   }
   
    Persona(String nombre, int edad, char genero){
	  //this();        // este this llama al constructor por defecto (se invoca en la primera línea de código)
	  this.nombre = nombre;
	  this.edad = edad;
	  this.genero = genero;
   }
   
      // metodos
  public void jugarVideojuegos(Persona p) {
	   System.out.println(nombre + " está jugando con " + p.nombre);
   }  

   public void impirmirIformacion() {
	   System.out.println("Nombre: " + nombre );
	   System.out.println("Edad: " + edad );
	   System.out.println("Genero: " + genero );
   }
   public static void main(String args[]) {
		
		Persona p = new Persona("Alex", 32, 'M');		
		p.impirmirIformacion();
		System.out.println();
		Persona p1 = new Persona("Juan", 51,'M');		
		p1.impirmirIformacion();
		
		//El objeto p llama al método, su nombre es Alex y pasa por parámetro al p1 cullo nombre es Juan
		p.jugarVideojuegos(p1);		
	}
   
   
}

/*Silvio Orozco Vizquerra
  Carne 18282
  Fecha 19072018
  EJERCICIO 2
  Archivo Clases.java*/
 
/*Clase Reptil*/
class reptil{
	/*Propiedades de la clase*/
	String nombre;
	String sonido;
	String tipo="Reptil";
	/*CONSTRUCTOR*/
	public reptil(String nomb, String soni){
		nombre=nomb;
		sonido=soni;
	}
	/*Metodos*/
	/*toString*/
	public String toString(){
		String mensaje;
		mensaje=("Hola soy un "+ tipo + ". Mi nombre es " +nombre + " y emito el sonido "+sonido +".");
		return mensaje;
	}
	
	/*ESPECIFICO arrastrar*/
	public String arrastrar(){
		String mensaje;
		mensaje="Soy un reptil que se arrastra.";
		return mensaje;
	}
}


/*Clase mamifero*/
class mamifero{
	/*Propiedades de la clase*/
	String nombre;
	String sonido;
	String tipo="Mamifero";
	/*CONSTRUCTOR*/
	public mamifero(String nomb, String soni){
		nombre=nomb;
		sonido=soni;
	}
	/*Metodos*/
	/*toString*/
	public String toString(){
		String mensaje;
		mensaje=("Hola soy un "+ tipo + ". Mi nombre es " +nombre + " y emito el sonido "+sonido +".");
		return mensaje;
	}
	
	/*ESPECIFICO caminar*/
	public String caminar(){
		String mensaje;
		mensaje="Soy un mamifero que se camina.";
		return mensaje;
	}
}

/*Clase ave*/
class ave{
	/*Propiedades de la clase*/
	String nombre;
	String sonido;
	String tipo="Ave";
	/*CONSTRUCTOR*/
	public ave(String nomb, String soni){
		nombre=nomb;
		sonido=soni;
	}
	/*Metodos*/
	/*toString*/
	public String toString(){
		String mensaje;
		mensaje=("Hola soy un "+ tipo + ". Mi nombre es " +nombre + " y emito el sonido "+sonido +".");
		return mensaje;
	}
	
	/*ESPECIFICO volar*/
	public String volar(){
		String mensaje;
		mensaje=("Soy un ave que se vuela.");
		return mensaje;
	}
}

/*Clase */
class pesa{
	/*Propiedades de la clase Ninguna*/
	/*CONSTRUCTOR vacio*/
	/*Metodos*/
	/*toString*/
	public String toString(){
		String mensaje;
		mensaje="Hola soy una pesa";
		return mensaje;
	}
	
	/*METODOS CONVERTIR*/
	public String convertir(double masa){
		double UP=masa;
		double g=UP*500;
		double kg=g/1000;
		double lb=g/453.59;
		double oz=lb*16.000;
		String mensaje; 
		mensaje=("PESO\n"+
				UP +" UP\n"+
				g +" gramos\n"+
				kg +" kilogramos\n"+
				lb +" libras\n"+
				oz +" onzas\n");		
		return mensaje;
	}
}
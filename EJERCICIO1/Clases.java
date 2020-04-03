/*Silvio Orozco Vizquerra
  Carne 18282
  Fecha 14072018
  Archivo Claes.java*/
 
/*Clase Perro*/
class perro{
	/*Propiedades de la clase*/
	int animominimo;
	int animo;
	String dueno;
	String nombreperro;
	/*CONSTRUCTOR*/
	public perro(String nombre, String due,int animom, int ani){
		System.out.println("Se ha creado un perro "+ nombre);
		nombreperro=nombre;
		animo=ani;
		dueno=due;
		animominimo=animom;
	}
	/*Metodos*/
	/*ATACAR*/
	private void atacar(){
		System.out.println("El perro te ha atacado");
	}
	
	/*JUGAR*/
	public void jugar(persona per, juguete jug, perro perr){
		if (per.getnombre()==dueno){
			jug.ruido(perr);
		}else{
			System.out.println("El perro no ha hecho nada.");
		}
	}
	
	/*LADRAR*/
	public void ladrar(persona per){
		if ((per.getnombre()==dueno)&&(animo>=animominimo)){
			System.out.println("WOOF");
		}else 
			atacar();
	}

	/*RECIBIR*/
	public void recibir(String queda, int cantidad){
		if (queda=="GALLETA"){
			animo=animo+cantidad;
			System.out.println("El perro ha recibido "+ cantidad +  " de "+queda);
		}else if(queda=="GOLPE"){
			animo=animo-cantidad;
			System.out.println("El perro ha recibido  "+ cantidad + " de "+queda);
		}else{
			System.out.println("Error. El perro solo puede recibir galletas o golpes.");
		}
	}
	public void setanimo(){
		animo=animominimo;
	}
	public void getanimo(){
		System.out.println(animo);
	}
}

/*Clase Juguete*/
class juguete{
	/*Propiedades de la clase*/
	int limiteusos;

	/*CONSTRUCTOR*/
	public juguete(int limiteuso){
		System.out.println("Se ha creado un juguete con "+limiteuso+ " limite de usos.");
		limiteusos=limiteuso;
	}
	/*Metodos*/
	/*RUIDO*/
	public void ruido(perro per){
		if (limiteusos>0){
			System.out.println("BULLA JUGUETE");
			limiteusos=limiteusos-1;
			per.setanimo();
		}else{
			System.out.println("El juguete ya no hace bulla");
		}
	}
	}


/*Clase Persona*/
class persona{
	/*Propiedades de la clase*/
	String nombrepersona;

	/*CONSTRUCTOR*/
	public persona(String nombre){
		System.out.println("Se ha creado una persona "+nombre);
		nombrepersona=nombre;
		}
	/*Metodos*/
	/*Dar*/
	public void dar(perro perroadar,String queda, int cantidad){
		if (perroadar== null){
			System.out.println("Este perro no existe");
		}else{
			perroadar.recibir(queda,cantidad);
		}
	}
	/*Instruccion*/
	public void instruccion(persona per,perro perroinst,String inst,juguete jug){
		if (perroinst== null){
			System.out.println("Este perro no existe");
		}else {
			if (inst=="JUGAR"){
				perroinst.jugar(per,jug,perroinst);
			}else if (inst=="LADRAR"){
				perroinst.ladrar(per);
			}else {
				System.out.println("Esta instruccion no existe");
			}
		}
	}
	/*Getnombre para que el perro identifique*/
	public String getnombre(){
		String nombre=nombrepersona;
		return nombre;
	}
}
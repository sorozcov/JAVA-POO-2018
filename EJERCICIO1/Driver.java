/*Silvio Orozco Vizquerra
  Carne 18282
  Fecha 14072018
  Archivo Driver.java*/
class Driver{
	public static void main (String[]args){
		/*Mostrar mensaje de pantalla*/
		System.out.println("PROGRAMA 2 PERROS, 2 PERSONAS Y JUGUETE.");
		/*2 Perros creados*/
		perro Chihuahua;
		Chihuahua = new perro("Chihuahua","Silvio",5,3);
		perro Labrador;
		Labrador = new perro("Labrador","Silvio",0,5);
		/*2 Personas creadas*/
		/*Dueno de ambos perros*/
		persona Silvio;
		Silvio = new persona("Silvio");
		/*Ladron*/
		persona Ladron;
		Ladron = new persona("Ladron");
		/*1 Peluche creado*/
		juguete Peluche;
		Peluche = new juguete(3);
		/*Pruebas*/
		/*En las pruebas ha sucedido lo esperado, primero se crean 2 personas, 2 perros y 1 juguete. 
		En este caso el juguete es el mismo para todos los perros. Se creo el labrado que tiene un 
		estado minimo de 0 y su estado inicial es 5. El chihuahua tiene un estado minimo de 5 y un 
		estado inicial de 3 pues es temperamental. El chihuahua si se la da la instruccion de ladrar
		no lo hace, pues su estado inicial es negativo. El labrador por el contrario si. Siempre y 
		cuando sea el dueno.*/
		/*De igual forma si se la da una instruccion desconocida, el programa lo indica.*/
		System.out.println("PRUEBA DE DUENO LADRAR. PRIMERO LABRADOR, LUEGO CHIHUHUA, LUEGO INSTRUCCION DESCONOCIDA");
		Silvio.instruccion(Silvio,Labrador,"LADRAR",Peluche);
		Silvio.instruccion(Silvio,Chihuahua,"LADRAR",Peluche);	
		Silvio.instruccion(Silvio,Labrador,"DESCONOCIDA",Peluche);
		
		/*Si se le dan mas de 3 galletas al chihuhua su estado cambiara a positivo. 
		Le pueden dar galletas y golpes tanto el ladron como el dueno.*/
		Silvio.dar(Chihuahua, "GALLETA", 10);
		Ladron.dar(Chihuahua, "GALLETA", 3);
		Silvio.dar(Chihuahua, "GOLPE",7);
		/*Ahora esto es lo que pasa si primero se lo pide el dueno y luego
		se lo pide el ladron al chihuahua que tiene un estado positivo..*/
		System.out.println("PRUEBA DE DUENO EN CHIHUHUA, Y LUEGO LADRON, LUEGO LADRON QUE PIDE JUGAR");
		Silvio.instruccion(Silvio,Labrador,"LADRAR",Peluche);
		Ladron.instruccion(Ladron,Chihuahua,"LADRAR",Peluche);
		Ladron.instruccion(Ladron,Chihuahua,"JUGAR",Peluche);
		/*PRUEBA DE JUGAR LABRADOR. 3 LIMITES DE USO, EN EL CUARTO YA NO HACE NADA.*/
		System.out.println("PRUEBA DE JUGAR LABRADOR. 3 LIMITES DE USO, EN EL CUARTO YA NO HACE NADA");
		Silvio.instruccion(Silvio,Labrador,"JUGAR",Peluche);
		Silvio.instruccion(Silvio,Labrador,"JUGAR",Peluche);
		Silvio.instruccion(Silvio,Labrador,"JUGAR",Peluche);
		Silvio.instruccion(Silvio,Labrador,"JUGAR",Peluche);
		
		/*Las pruebas funcionan acorde a lo programado. Las 3 clases de objeto interactuan entre ellas 
		y pueden modificarse unicamente en su clase misma. Cada objeto es instanciado con sus propios 
		atributos a partir de las propiedades generales.*/
		
	}
}
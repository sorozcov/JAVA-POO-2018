/*Silvio Orozco Vizquerra
  Carne 18282
  Fecha 281018
  Laboratorio 4
  Archivo DriverSimulador.java*/
 
/*Importamos el scanner y las librerias necesarias.*/ 
import java.util.Scanner;
import java.util.*;
import java.text.*;
import java.util.Random;
import java.util.ArrayList;

/*Clase DriverSimulador que sera nuestro driver program*/
/*Aqui se ejecutaran las funcionalidades de nuestro programa y sus clases.*/

public class DriverSimulador{
	public static void main(String args[]) {
	/*Primero creamos un scanner para pedir el nombre de nuestros 4 jugadores.*/
	Scanner leer = new Scanner(System.in);
	/*Se crean los datos de tipo String a los cuales pueden acceder todos los datos.*/
	ArrayList<String> datos= new ArrayList<String>(){{
    add("DATO 1: HOLA");
    add("DATO 2: QUE TAL");
    add("DATO 3: OTRO");
	add("DATO 4: JAJA");
}};
	String resp;
	usuario user=null;
	/*Se piden los datos para instanciar  el tipo de usuario.*/
	System.out.println("Bienvenido al sistema de retos. \n Una vez completado el reto usted es autenticado para ingresar al menu y tener las opciones segun el tipo de usuario.");
	System.out.println("Ingrese el numero del usuario que desea ser: \n 1.Gerente \n 2.Empleado \n 3.Proveedor");
	resp= leer.next();
	while (resp.equals("1")==false && resp.equals("2")==false && resp.equals("3")==false){
		System.out.println("Error, la opcion debe ser valida. \nIngrese el numero del usuario que desea ser: \n 1.Gerente \n 2.Empleado \n 3.Proveedor");
		resp= leer.next();
	}
	String nom;
	String id;
	String depar;
	String jefe;
	String quien;
	/*Segun el tipo de usuario crea est tipo de usuario
	Si la opcion es 1 entonces crea un gerente y llama su reto
	Si la opcion es 2 entonces crea un empleado y llama su reto
	Si la opcion es 3 entonces crea un proveedor y llama su reto.*/
	switch (resp) {
      case ("1"):
			System.out.println("Ingrese su nombre");
			 nom= leer.next();
			System.out.println("Ingrese su ID");
			 id= leer.next();
			System.out.println("Ingrese su Departamento");
			 depar= leer.next();		
			user=new gerente(nom,id,depar);
			System.out.println( user.info() );
			
           break;
      case ("2"):
            System.out.println("Ingrese su Nombre");
			 nom= leer.next();
			System.out.println("Ingrese su ID");
			 id= leer.next();
			System.out.println("Ingrese su Departamento");
			 depar= leer.next();	
			System.out.println("Ingrese su Jefe");
			 jefe= leer.next();
			user=new empleado(nom,id,jefe,depar);
			System.out.println( user.info() );
			
            break;
      case ("3"):
            System.out.println("Ingrese su Nombre");
			 nom= leer.next();
			System.out.println("Ingrese su ID");
			 id= leer.next();
			System.out.println("Ingrese quien le atiende.");
			 quien= leer.next();	
			user=new proveedor(nom,id,quien);
			System.out.println( user.info() );
			
            break;
      default:
           System.out.println("" );
           break;
      }
	 String a="Intente de nuevo el reto.";
	 /*Se llaman a las funciones para evaluar el reto, mientras se falle*/ 
	  while (a.equals("Intente de nuevo el reto.")){
			System.out.println(user.reto());
			resp=leer.next();
			a=user.retocomp(resp);
			System.out.println(a);
	  }
	  /*Se verifica si el reto se acerto o no, llamando a las funciones necesarias.
	  Luego muestra el menu si fue autenticado.*/ 
	  if(a.equals("Usuario autenticado.")){
		System.out.println(user.showMenu());  
		resp=leer.next();
		
		while(resp.equals("1")==true || resp.equals("2")==true || resp.equals("3")==true || resp.equals("4")==true){
			/*Muestra los datos*/
			System.out.println("A continuacion se muestran los datos segun su acceso");
			if(resp.equals("1")){
				for(int x=0; x<datos.size();x++){
					if(user.consultarDatos((x+1))==true){
						System.out.println(datos.get(x));
					}
				}
				/*Verifica accesos y cambia datos.*/
			}else if(resp.equals("2")){
				if(user.getTipo().equals("Proveedor")==false){
					System.out.println("Ingrese el nuevo dato a ingresar en el registro");
					String l = leer.next();
					int num;
					try {
						System.out.println("Ingrese una posicion a editar.");
						num = leer.nextInt();
						if (num<=datos.size()){
							if(user.modificarDatos(num)==false){
								System.out.println("Error, usted solo puede modificar registros pares.");
							}else{
								datos.set((num-1 ),l);
								System.out.println("Dato "+ num+ " ha sido cambiado a "+l);
								
							};
						}else{
							System.out.println("Error posicion ingresada es mayor a la cantidad de datos.");
						}
					
					} catch (InputMismatchException e) {
						System.out.println("Error. Debe ingresar una posicion valida. ");
					} 
				}else{
					resp="5";
				}
				/*Verifica accesos y crea un nuevo dato.*/
			}else if(resp.equals("3")){
				if(user.getTipo().equals("Proveedor")==false){
					System.out.println("Ingrese el nuevo dato a ingresar en el registro");
					String l = leer.next();
					l="DATO "+(datos.size()+1) +": "+l;
					datos.add(l);
					System.out.println(l+" anadido al registro.");
				}else{
					resp="5";
				}
				/*Verifica accesos y muestra cantidad de datos.*/
			}else if(resp.equals("4")){
				if(user.getTipo().equals("Proveedor")==false){
					System.out.println(("La cantidad de datos totales es "+datos.size()));resp="5";
				}else{
					resp="5";
				}
				
			}
			/*Muestra el menu*/
			System.out.println(user.showMenu()); 
			resp=leer.next();
		}	
	  }
	  /*Fin del programa.*/
	  System.out.println("Gracias por utilizar el programa. Adios.");
}}
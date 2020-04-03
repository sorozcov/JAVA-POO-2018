/*Silvio Orozco Vizquerra
  Carne 18282
  Fecha 281018
  Laboratorio 4
  Archivo empleado.java*/
 
 /*Importamos el scanner y las librerias necesarias.*/ 
import java.util.Scanner;
import java.util.*;
import java.text.*;
import java.util.Random;
import java.util.ArrayList;

/*Clase empleado*/ 
public class empleado extends usuario implements administrador{
	/*Propiedades
	Son las mismas que para todos los usuarios.*/
	protected String jefeInmediato;
	protected String departamento;
	
	/*Metodos*/
	/*Instancia un nuevo empleado con las propiedades necesarias.*/
	public empleado(String nom,String id, String jefe, String depar){
		nombre=nom;
		tipo="Empleado";
		ID=id;
		jefeInmediato=jefe;
		departamento=depar;
		menu=menu+tipo+op1+op2+op3+op4+op5;
	}
	
	/*Fichado si falla el reto tres veces*/ 
	public String fichado(){
		String fich;
		fich="Usted ha sido fichado por fallar su reto tres veces.";
		fich=(fich+"\n Nombre:" +nombre +"\n ID:" +ID+"\n Jefe Inmediato:" +jefeInmediato);  
		return fich;
	}
	
	/*Muestra el reto*/ 
	public String reto(){
		String r="Su reto es acertar el numero default entre el 1 y el 5 para entrar al sistema.";
		return r;
	}
	
	/*Verifica si el reto fue acertado o no.*/ 
	public boolean retoacertado(String valor){
		boolean reto=false;
		if(valor.equals("3")){
			reto=true;
		}
		return reto;
	}
	
	public boolean modificarDatos(int pos){
		boolean mod=false;
		if (pos%2==0){
			mod=true;
		}
		return mod;
	}
	
	public boolean consultarDatos(int pos){
		boolean mod=true;
		
		return mod;
	}

	
	
}
/*Silvio Orozco Vizquerra
  Carne 18282
  Fecha 281018
  Laboratorio 4
  Archivo proveedor.java*/
 
 /*Importamos el scanner y las librerias necesarias.*/ 
import java.util.Scanner;
import java.util.*;
import java.text.*;
import java.util.Random;
import java.util.ArrayList;

/*Clase proveedor*/ 
public class proveedor extends usuario implements normie{
	/*Propiedades
	Son las mismas que para todos los usuarios.*/
	protected String quienAtiende;
	
	/*Metodos*/
	/*Instancia un nuevo empleado con las propiedades necesarias.*/
	public proveedor(String nom,String id, String quien){
		nombre=nom;
		tipo="Proveedor";
		ID=id;
		quienAtiende=quien;
		menu=menu+tipo+op1+op5;
	}
	/*Fichado si falla el reto tres veces*/ 
	public String fichado(){
		String fich;
		fich="Usted ha sido fichado por fallar su reto tres veces.";
		fich=(fich+"\n Nombre:" +nombre +"\n ID:" +ID+"\n Atendido por:" +quienAtiende);  
		return fich;
	}
	/*Muestra el reto*/ 
	public String reto(){
		String r="Su reto es acertar el nombre(solo el primer nombre) del profesor de Programacion Orientada a Objetos";
		return r;
	}
	/*Verifica si el reto fue acertado o no.*/ 
	public boolean retoacertado(String valor){
		valor=valor.toUpperCase();
		System.out.println(valor);
		boolean reto=false;
		if(valor.equals("TOMAS")){
			reto=true;
		}
		return reto;
	}
	
	
	public boolean modificarDatos(int pos){
		boolean mod=false;
		return mod;
	}
	
	public boolean consultarDatos(int pos){
		boolean mod=false;
		if(pos%2==1){
			mod=true;
		}
		return mod;
	}
	

	
	
	
}
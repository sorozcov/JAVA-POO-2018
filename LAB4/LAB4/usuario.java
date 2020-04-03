/*Silvio Orozco Vizquerra
  Carne 18282
  Fecha 281018
  Laboratorio 4
  Archivo usuario.java*/
 
 /*Importamos el scanner y las librerias necesarias.*/ 
import java.util.Scanner;
import java.util.*;
import java.text.*;
import java.util.Random;
import java.util.ArrayList;

/*Clase usuario*/ 
public abstract class usuario implements retable{
	/*Propiedades
	Todas ellas son protected al ser parte de un tipo de herencia y que a su vez son para una clase abstracta.
	Estas permitiran darle nombre al usuario y un ID. De esta forma heredaran tipos.*/
	protected String nombre;
	protected String tipo;
	protected String ID;
	protected String menu=("Menu de "); 
	protected String op1= ("\n \t 1. Leer cualquier posicion de los datos.");
	protected String op2= ("\n \t 2. Modificar cualquier posicion de los datos.");
	protected String op3=("\n \t 3. Agregar un nuevo dato.");
	protected String op4=("\n \t 4. Consultar la cantidad de datos.");
	protected String op5= ("\n \t Cualquier otra cosa para salir.");
	
	protected boolean fichado=false;
	int fallos=0;
	/*Metodos*/
	
	
	/*Devuelve el nombre*/
	public String getnombre(){
		return nombre;
	}
	
	/*Devuelve el ID*/
	public String getID(){
		return ID;
	}
	/*Devuelve la info de un usuario.*/
	public String info(){
		String inf;
		inf=("Nuevo: "+ tipo+"\nNombre "+ nombre +"\n"+"ID "+ ID +"\n");
		return inf;
	}
	
	/*Devuelve el menu.*/
	public String showMenu(){
		return menu;
	}
	
	/*Devuelve el tipo.*/
	public String getTipo(){
		return tipo;
	}
	
	
	/*Se ficha el usuario.*/
	public void fichar(){
		fichado=true;
	}
	/*Metodos abstractos que se definen luego.*/
	public abstract boolean consultarDatos(int pos);
	public abstract boolean modificarDatos(int pos);
	public  abstract boolean retoacertado(String val);
	public abstract String fichado();
	/*Se verifica si se completa el reto o no.*/
	public String retocomp(String val){
		boolean completo=retoacertado(val);
		fallos=fallos+1;
		String fal= "";
		if (completo){
			fichado=false;
			fal="Usuario autenticado.";
		
		}else{
			fichado=true;
			fal="Intente de nuevo el reto.";
		}
		
		if (fallos==3 && fichado==true){
			fal=fichado();
		}
		return fal;
	}
	
	
}

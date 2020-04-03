/*Silvio Orozco Vizquerra
  Carne 18282
  Fecha 281018
  Laboratorio 4
  Archivo administrador.java*/
  
  /*Interfaz administrador*/
  public interface administrador{
		/*Estos son los metodos a los cuales tiene poder los administradores
		A los cuales logran acceder los empleados y los gerentes. Sin embargo,
		los empleador solo pueden modoficar los datos Pares.*/
		
		public boolean consultarDatos(int pos);
		public boolean modificarDatos(int pos);
  }
 
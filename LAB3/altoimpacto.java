/*Silvio Orozco Vizquerra
  Carne 18282
  Fecha 161018
	LAB3
  Archivo altoimpacto.java*/
  
  /*Interfaz arma*/
  public class altoimpacto implements arma{
		/*Lo que deben tener todas las armas metodo y caracteristica*/
		protected String nombre="Alto Impacto";
		
		/*Ataque arma*/
		public String ataquearma(){
			String u="\nHa atacado con un arma de Alto Impacto";
			return u;
		}
		/*Obtener nombre*/
		public String getNombre(){
			return nombre;
		}
  }
 
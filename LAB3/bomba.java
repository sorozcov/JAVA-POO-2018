/*Silvio Orozco Vizquerra
  Carne 18282
  Fecha 161018
	LAB3
  Archivo bomba java*/
  
  /*Interfaz arma*/
  public class bomba implements arma{
		/*Lo que deben tener todas las armas metodo y caracteristica*/
		protected String nombre="Bomba";
		
		/*Ataque arma*/
		public String ataquearma(){
			String u="\nHa atacado con un arma de Bomba";
			return u;
		}
		/*Obtener nombre*/
		public String getNombre(){
			return nombre;
		}
  }
 
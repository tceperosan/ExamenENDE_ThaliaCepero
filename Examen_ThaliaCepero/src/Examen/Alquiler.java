package Examen;
/**Esta clase es la clase main dodne se ejecuta nuestro programa
 @since 19/12/2025
 @author tcepe
 @version 1.0 */
public class Alquiler {
	/**Esta clase es la clase main dodne se ejecuta nuestro programa
	 @since 19/12/2025
	 @author tcepe
	 @version 1.0 */
	public static void main(String[] args) {
		/**Creación del vehiculo 1 con el constructor con parametros
		 @param matricula
		 @param marca
		 @param modelo
		 @param prestado
		 @since 19/12/2025
		 @author tcepe
		 @version 1.0 */
		Vehiculo vehiculo1=new Vehiculo("1234 AAA","Examen", "Thalia" ,19.12);
		/**Imprime el vehiculo que hemso creado en un toString
		 @param matricula
		 @param marca
		 @param modelo
		 @param prestado
		 @return devuelve un toString de los parametros
		 @since 19/12/2025
		 @author tcepe
		 @version 1.0 */
		System.out.println(vehiculo1.toString());
	}

}

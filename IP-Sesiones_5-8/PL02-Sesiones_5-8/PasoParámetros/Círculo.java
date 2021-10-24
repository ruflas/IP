/** Representa objetos Círculo, con un campo Radio
 *  @author los profesores de IP
 *  @version 1.0  */
public class Círculo {
	/**Valor del radio del objeto Círculo*/
	private double radio;
	/**Constante matemática pi */
	private static final double PI=3.1416;
	
	/**Devuelve el valor del radio del objeto Círculo
	 * @return el radio del objeto */
	public double getRadio() {
		return radio;
	}

	/**Cambia el valor del radio del objeto, para que valga r
	 * @param r nuevo valor para el radio del objeto 
	 * @return nada  */
	public void setRadio(double r) {
		radio=r;
	}
	
	/**Devuelve el área del objeto Círculo
	 * @return el valor del área del Círculo*/
	public double calculaÁrea() {
		return PI*radio*radio;
	}
	
	/**Cambia el valor del radio del objeto, para que valga lo
	 * mismo que el radio del objeto pasado como parámetro
	 * @param c objeto Círculo del que vamos a copiar el radio 
	 * @return nada  */
	public void copiaRadio(Círculo c) {
		setRadio(c.getRadio());
	}
}

/** Representa objetos Fecha
 *  @author los profesores de IP
 *  @version 1.0  */
public class Fecha {
	/**Valor del día del objeto Fecha*/
	private short día;
	/**Valor del mes del objeto Fecha*/
	private short mes;
	/**Valor del año del objeto Fecha*/
	private short año;
	
	/**Devuelve el valor del día del objeto Fecha
	 * @return el día del objeto */
	public short getDía() {
		return día;
	}

	/**Cambia el valor del día del objeto, para que valga d
	 * @param d nuevo valor para el día del objeto 
	 * @return nada  */
	public void setDía(short d) {
		día=d;
	}
	
	/**Devuelve el valor del mes del objeto Fecha
	 * @return el mes del objeto */
	public short getMes() {
		return mes;
	}

	/**Cambia el valor del mes del objeto, para que valga m
	 * @param m nuevo valor para el mes del objeto 
	 * @return nada  */
	public void setMes(short m) {
		mes=m;
	}

	/**Devuelve el valor del año del objeto Fecha
	 * @return el año del objeto */
	public short getAño() {
		return año;
	}

	/**Cambia el valor del año del objeto, para que valga a
	 * @param a nuevo valor para el año del objeto 
	 * @return nada  */
	public void setAño(short a) {
		año=a;
	}
	
	/**Cambia la fecha completa del objeto
	 * @param d nuevo valor para el día del objeto
	 * @param m nuevo valor para el mes
	 * @param a nuevo valor para el año 
	 * @return nada  */
	public void setFecha(short d, short m, short a) {
		setAño(a);
		setMes(m);
		setDía(d);
	}
	
	/**Imprime la fecha en consola en formato dd/mm/aaaa
	 * @return nada */
	public void imprimeFecha() {
		System.out.printf("%02d/%02d/%04d",getDía(),getMes(),getAño());
	}
}

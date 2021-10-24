/** Representa objetos Círculo, con un campo Radio
 *  @author los profesores de IP
 *  @version 1.0  */
public class Círculo {
	/**Valor del radio del objeto Círculo*/
	private double radio,x,y;
	/**Constante matemática pi */
	private static final double PI=3.1416;
	/**Devuelve el valor del radio del objeto Círculo
	 * @return el radio del objeto */
	public double getRadio() {
		return radio;
	}
	public double getX() {
		return x;
	}
	public double getY() {
		return y;
	}

	/**Cambia el valor del radio del objeto, para que valga r
	 * @param r nuevo valor para el radio del objeto 
	 * @return nada  */
	public void setRadio(double r) {
		radio=r;
	}
	public void setX(double x) {
		this.x=x;
	}
	public void setY(double y) {
		this.y=y;
	}
	
	/**Devuelve el área del objeto Círculo
	 * @return el valor del área del Círculo*/
	public double calculaÁrea() {
		return PI*radio*radio;
	}
	public double calculaPerimetro() {
		return 2 * PI * getRadio();
	}
	public void  copiaCentro(Círculo c2) {
		 c2.setX(getX());
		 c2.setY(getY());
	}
	public double diferenciaArea(Círculo c2) {
		return calculaÁrea() - c2.calculaÁrea();
	}
	public void ajustaRadio(Círculo c2) {
		double x = Math.sqrt( (Math.pow((getX()-getY()), 2)) + (Math.pow((c2.getX()-c2.getY()), 2))  );
		c2.setRadio(x);
	}
}

/** Representa objetos Círculo, con un campo Radio
 *  @author los profesores de IP
 *  @version 1.0  */
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;
public class Circulo extends JPanel{
	/**Valor del radio del objeto Círculo*/
	private int radio;
	private int x;
	private int y;
	
	/**Constante matemática pi */
	private static final double PI=3.1416;
	
	/**Devuelve el valor del radio del objeto Círculo
	 * @return el radio del objeto */
	public int getRadio() {
		return radio;
	}
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}

	/**Cambia el valor del radio del objeto, para que valga r
	 * @param r nuevo valor para el radio del objeto 
	 * @return nada  */
	public void setRadio(int r) {
		if(r >= 0) radio=r;
	}	
	public void setX(int nuevaX) {
		x = nuevaX;
	}
	public void setY(int nuevaY) {
		y = nuevaY;
	}

	/**Devuelve el área del objeto Círculo
	 * @return el valor del área del Círculo*/
	public double calculaÁrea() {
		return PI*radio*radio;
	}
	public double calculaPerímetro() {
		return 2*PI*radio;
	}
	public void copiaCentro(Circulo c) {
		this.setX(c.getX());
		this.setY(c.getY());
	}
	public double diferenciaÁrea(Circulo c) {
		return this.calculaÁrea() - c.calculaÁrea();
	}
    public void paintComponent(Graphics g) {
    	super.paintComponent(g);
    	g.setColor(Color.red);
    	g.fillOval( getX(), getY(), getRadio()*2,getRadio()*2);
    	g.setColor(Color.blue);
    	g.drawOval( getX(), getY(),getRadio()*2,getRadio()*2);
    }
}

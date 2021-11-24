/** Representa objetos Rectángulo
 *  @author los profesores de IP
 *  @version 1.0  */
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Color;
public class Rectangulo extends JPanel{
	
    //Atributos
    /** Representa la coordenada X del Rectángulo */
    private int x;
    /** Representa la coordenada Y del Rectángulo */
    private int y;
    /** Representa la base del Rectángulo */
    private int base;
    /** Representa la altura del Rectángulo */
    private int altura;
    
    public Rectangulo() {
    	setX(0);
    	setY(0);
    	setBase(1);
    	setAltura(1);
    }
    
    public Rectangulo(int x, int y, int base, int altura) {
		setX(x);
    	setY(y);
    	setBase(base);
    	setAltura(altura);
	}
    
    public Rectangulo(Rectangulo r) {
    	this(r.getX(),r.getY(),r.getBase(),r.getAltura());
    }

	//Métodos públicos
    /** Devuelve el valor de la coordenada x del Rectángulo
     * @return el valor de x  */
    public int getX() {
        return x;
    }

    /** Cambia el valor de la coordenada x del Rectángulo
     * @param x nuevo valor para la coordenada x   */
	public void setX(int v) {
        x = v;
    }

     /** Devuelve el valor de la coordenada y del Rectángulo
      * @return el valor de y  */
	public int getY() {
       return y;
    }

    /** Cambia el valor de la coordenada y del Rectángulo
      * @param y nuevo valor para la coordenada y   */
    public void setY(int v) {
        y = v;
    }	

    /** Devuelve el valor de la base del Rectángulo
     * @return el valor de base  */
    public int getBase() {
        return base;
    }

    /** Cambia el valor de la base del Rectángulo
     * @param v nuevo valor para la base   */
    public void setBase(int v) {
        if (v > 0 ) base = v;
    }	

    /** Devuelve el valor de la altura del Rectángulo
      * @return el valor de altura  */
	public int getAltura() {
       return altura;
    }

	/** Cambia el valor de la altura del Rectángulo
     * @param v nuevo valor para la altura   */
    public void setAltura(int v) {
        if (v > 0 ) altura = v;
    }		
    
    public void paintComponent(Graphics g) {
    	super.paintComponent(g);
    	g.setColor(Color.red);
    	g.fillRect( getX(), getY(), getBase(), getAltura());
    	g.setColor(Color.blue);
    	g.drawRect( getX(), getY(), getBase(), getAltura());
    }
    
    /**Calcula el área del Rectángulo
     * @return el área */ 
    public double calculaÁrea() {
        return getBase()*getAltura();
    }

    /**Calcula el perímetro del Rectángulo
     * @return el perímetro */ 
    public double calculaPerímetro() {
        return getBase()*2+getAltura()*2;
	}	
}


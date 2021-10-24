
public class Punto {
	private double x,y;
	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}
	
	public String imprime() {
		String s = String.format("[%f , %f]\n", getX(),getY());
		return s;
	}
	
	public double DistanciaAlOrigen() {
		double punto = getY() -  getX();
		return Math.sqrt((Math.pow(punto , 2)));
	}
}

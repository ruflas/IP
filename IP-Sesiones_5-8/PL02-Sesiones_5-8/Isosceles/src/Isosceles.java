
public class Isosceles {
	private int base,altura;

	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = base;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}
	
	public double calculaArea() {
		return (getBase()+getAltura())/2;
	}
	public double calculaPerimetro() {
		double lado = Math.sqrt( (Math.pow((getBase()/2), 2) ) + Math.pow(getAltura(), 2) );
		return (lado*2)+getBase();
	}
}

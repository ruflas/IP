
public class Rectangulo {
	private int x,y,base,altura;

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		if (base > 0) {
			this.base = base;
		}
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		if (altura > 0) {
			this.altura = altura;
		}
	}
	
	public double calculaArea() {
		return getBase()*getAltura();
	}
	public double calculaPerimetro() {
		return (getBase()*2) + (getAltura()*2);
	}
}

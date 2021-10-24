
public class Ventana {
	private int ancho,alto,marco;
	
	public Ventana() {
		this.setAncho(120);
		this.setAlto(100);
		this.setMarco(6);
	}
	public Ventana(Ventana v) {
		this.setAncho(v.getAncho());
		this.setAlto(v.getAlto());
		this.setMarco(v.getMarco());
	}
	public Ventana(int ancho,int alto) {
		this.setAncho(ancho);
		this.setAlto(alto);
		this.setMarco(6);
	}
	public Ventana(int ancho,int alto,int marco) {
		this.setAncho(ancho);
		this.setAlto(alto);
		this.setMarco(marco);
	}
	public int getAncho() {
		return ancho;
	}
	public int getAlto() {
		return alto;
	}
	public int getMarco() {
		return marco;
	}
	public void setAncho(int ancho) {
		this.ancho=ancho;
	}
	public void setAlto(int alto) {
		this.alto=alto;
	}
	public void setMarco(int marco) {
		this.marco=marco;
	}
	public double calculaSuperficieCristales() {
		return (getAncho()-(4*getMarco()))*(getAlto()-(2*getMarco()));
	}
	public boolean tieneMasCristal(Ventana v) {
		return calculaSuperficieCristales()>v.calculaSuperficieCristales();
	}
	
	@Override
	
	public String toString() {
		String s=String.format("%d cm. ancho x %d cm. alto, Marco %d cm.",getAncho(),getAlto(),getMarco());
		return s;
	}
}

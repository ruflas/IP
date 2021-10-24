public class Ventana{
	private int ancho,alto,marco;
	public Ventana(int ancho,int alto,int marco){
		this.getAncho(ancho);
		this.getAlto(alto);
		this.getMarco(marco);
	}
	public Ventana(){
		this.getAncho(120);
		this.getAlto(100);
		this.getMarco(6);
	}
	public Ventana(Ventana v){
		this.setAncho(v.getAncho());
		this.setAlto(v.getAlto());
		this.setMarco(v.getMarco());
	}
	public Ventana(int ancho,int alto){
		this.getAncho(ancho);
		this.getAlto(alto);
		this.getMarco(6);
	}
    public int getAncho(){
		return ancho;
	}
	public int getAlto(){
		return alto;
	}
	public int getMarco(){
		return marco;
	}
	public double calculaSuperficieCristales(){
		return ((getAncho()-(4*getMarco()))*((getAlto()-(2*getMarco());
	}
	public boolean tieneMasCristal(Ventana v){
		if(calculaSuperficieCristales()>v.calculaSuperficieCristales()) return true;
		else return false;
	}
	@Override
	public String toString(){
		String s=String.format("Ventana %d cm ancho x %d cm alto,Marco %d cm",getAlto(),getAncho(),getMarco());
		return s;
	}
}
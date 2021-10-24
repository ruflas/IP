public class LamparaDespacho{
	private int Rb,Rl,L;
	private double PI=3.1416;
	public LamparaDespacho(int Rb,int Rl,int L){
		this.setRb(Rb);
		this.setRl(Rl);
		this.setL(L);
	}
	public LamparaDespacho(){
		this.setRb(50);
		this.setRl(25);
		this.setL(120);
	}
	public LamparaDespacho(int Rb){
		this.setRb(Rb);
		this.setRl(25);
		this.setL(120);
	}
	public  LamparaDespacho(LamparaDespacho l){
		this.setRb(l.getRb());
		this.setRl(l.getRl());
		this.setL(l.getL());
	}
	public int getRb(){
		return Rb;
	}
	public int getRl(){
		return Rl;
	}
	public int getL(){
		return L;
	}
	public void setRb(int Rb){
		if(Rb<50 || Rb>90) this.Rb=50;
		else this.Rb=Rb;
	}
	public void setRl(int Rl){
		if(Rl<25 || Rl>40) this.Rl=25;
		else this.Rl=Rl;
	}
	public void setL(int L){
		if(L<120 || L>500) this.L=120;
		else this.L=L;
	}
	public double areaBase(){
		return (4*(Math.PI()))*(Math.pow(Rb,2));
	}
	public double areaLuz(){
		return (4*(Math.PI()))*(Math.pow(Rl,2));
	}
	public double precioVentaRecomendado(){
		double coste_brazos=(38/1000)*this.getL()*2;
		double coste_luz= (50/1000000)*this.getRl();
		double coste_base=(50/1000000)*this.getRb();
		double coste_total=1.10*(coste_base+coste_brazos+coste_luz);
		return coste_total;
	}
	public boolean masBarata(LamparaDespacho l){
		if(this.precioVentaRecomendado()<l.precioVentaRecomendado()) return true;
		else return false;
	}
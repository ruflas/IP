public class Cono{
	private double radio,altura;
	public Cono(double radio,double altura){
		setRadio(radio);
		setAltura(altura);
	}
	public Cono(){
		this(1.0,1.0);
	}
	public Cono(Cono c){
		setRadio(c.getRadio());
		setAltura(c.getAltura());
	}
	public double getRadio(){
		return radio;
	}
	public double getAltura(){
		return altura;
	}
	public void setAltura(double altura){    
		if(altura>0)                   
			this.altura=altura;
	}
	public void setRadio(double radio){
		if(radio>0)
			this.radio=radio;              
	}     
	public double calculaGeneratriz(){ 
		return Math.sqrt(((Math.pow(getAltura(),2))+(Math.pow(getRadio(),2))));
	}
	public double calculaArea(){
		return (Math.PI()*Math.pow(getRadio(),2))+(Math.PI()*getRadio()*calculaGeneratriz());
	}
	public double calculaVolumen(){
		return (Math.PI()*(Math.pow(getRadio(),2))*calculaArea())/3;
	}
	public boolean esMayor(Cono c){
		if(calculaVolumen()>c.calculaVolumen()){
			returºn true;
			}
		else return false;
	}
	

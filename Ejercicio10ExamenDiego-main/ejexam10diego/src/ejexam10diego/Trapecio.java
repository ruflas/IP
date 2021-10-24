package ejexam10diego;

public class Trapecio {
	public double base1,base2,altura;
	public Trapecio(double base1,double base2){
		setBase1(base1);
		setBase2(base2);
		setAltura(1.0);
	}
	public Trapecio(double base1,double base2,double altura){
		setBase1(base1);
		setBase2(base2);
		setAltura(altura);
	}
	public Trapecio(Trapecio t){
		setBase1(t.getBase1());
		setBase2(t.getbase2());
		setAltura(t.getAltura());
	}
	public double getbase1() {
		return base1;
	}
	public double getbase2() {
		return base2;
	}
	public double getaltura() {
		return 1.0;
	}
	public void setbase1(double base1) {
		this.base1=base1;
	}
	public void setbase2(double base2) {
		this.base2=base2;
	}
	public void setaltura(double altura) {
		this.altura=altura;
	}
	
	public double calculaArea(double base1, double base2, double base3) {
		return ((getbase1()+getbase2())/2)*getaltura();
			
	}
	public boolean BasesMayores(Trapecio t1) {
		if (getbase1()> t1.getbase1() && getbase2()> t1.getbase2()) {
			return true;
		}
		else{
			return false;
		}
	}

}

public class Colchon {
 //Declaracion de variables
private double largo,ancho,grosor;
private int tipo;
 public Colchon(double largo,double ancho,double grosor, int tipo){
 	setLargo(largo);
	setAncho(ancho);
	setGrosor(grosor);
	setTipo(tipo);
 }
 public Colchon(){
 	this(190,90,21,1);
 }
 public Colchon(int tipo){
 	this(190,90,21,tipo);
 }
 public Colchon(Colchon c){
 	this(c.getLargo(),c.getAncho(),c.getGrosor(),c.getTipo());
 }
 public int getLargo() {
	 return largo;
 }
 public int getAncho() {
	 return ancho;
 }
 public int getGrosor() {
	 return grosor;
 }
 public int getTipo() {
	 return tipo;
 }
 public void setLargo(double largo) {
	 if(valor==180 || valor==190 || valor==200) this.largo=largo;
 }
 public void setAncho(double ancho) {
	 if(valor==90 || valor==135 || valor==200) this.ancho=ancho;
 }
 public void setGrosor(double grosor) {
	 if(valor>=10) this.grosor=grosor;
 }
 public void setTipo(int tipo) {
	if(tipo>=1 && tipo <= 4) this.tipo=tipo;
 }
/*
 * Metodo calculaVolumen
 * @return double Volumen del Colchon
*/
public double calculaVolumen() {
	return getLargo()*getAncho()*getGrosor();
}
/*
 * Metodo esMasVoluminoso
 * @param c
 * @return boolean true o false segun si...
 */
public boolean esMasVoluminoso(Colchon c) {
	if(calculaVolumen()>c.calculaVolumen()) return true;
	else return false;
}
	
@Override
public String toString() {
	String tipo= "";
	if (getTipo() == 1) tipo = "espuma";
	else if (getTipo() == 2) tipo = "visco";
	else if (getTipo() == 3) tipo = "latex";
	else tipo = "muelles";
	String s = String.format("Tipo : %s. Medidas %.02f x cm %.02f x cm %.02f cm", tipo,getLargo(),getAncho(),getGrosor());
	return s;
	}
}

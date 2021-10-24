/*
 * @Author UO282978
 */
public class Piscina {
   //Creamos las variables largo y ancho como números enteros y profundidad como double o número con decimales.
	private int largo,ancho;
   private double profundidad;
   
   //Creamos los metodos get correspondientes.
   public int getLargo() {
	   return largo;
   }
   public int getAncho() {
	   return ancho;
   }
   public double getProfundidad() {
	   return profundidad;
   }
   
   //creamos los metodos set correspondientes.
   public void setLargo(int largo) {
	   this.largo=largo;
   }
   public void setAncho(int ancho) { 
	   this.ancho=ancho;
   }
   public void setProfundidad(double profundidad) {
	   this.profundidad=profundidad;
   }
   
   //Creamos el metodo muestraPiscina que muestra los datos introducidos en Testpiscina.
   public void muestraPiscina() {
	   System.out.printf("Datos de la Piscina Piscina: %d x %d, %f mts.\n", getLargo(),getAncho(),getProfundidad());
   }
   
   //creamos el metodo calculalitrosAgua que calcula los litros necesarios para llenar la piscina.
   public double calculalitrosAgua() {
	   return ((getLargo()*getAncho()*getProfundidad())*1000);
   }
   
   //Creamos el metodo esMenor que devuelve cierto si el objeto con que se llama al metodo es menor que el objeto que se pasa como parametro.
   //En caso contrario devolvera false.
   public boolean esMenor(Piscina p) {
	   if(calculalitrosAgua()<p.calculalitrosAgua()) {
		   return true;
	   }
	   else {
		   return false;
	   }
   }
}

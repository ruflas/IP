/** Ejemplo del paso de parámetros a métodos 
 *  @author los profesores de IP  */
public class PasoParámetros {
    
	public static void incrementaInt(int n) {
		n=n+1;
	}
	
	public static void incrementaRadio(Círculo c) {
		c.setRadio( c.getRadio()+1 );	
	}
	
	public static void main(String[ ] args) {
		//Variable entera
		int num=5;
		System.out.printf("\nAntes de la llamada num=%d",num);
		incrementaInt(num);
		System.out.printf("\nDespués de la llamada num=%d",num);
		
		//Objeto de la clase Círculo
		Círculo cir = new Círculo();
		System.out.printf("\nAntes de la llamada radio=%f",cir.getRadio());
		incrementaRadio(cir);
		System.out.printf("\nDespués de la llamada radio=%f",cir.getRadio());
		
		//Usamos un método de la clase Círculo que recibe un objeto Círculo
		Círculo otro = new Círculo();
		otro.copiaRadio(cir);
		System.out.printf("\nradio=%f",otro.getRadio());
	}
}
package exam2021ej6;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner t=new Scanner(System.in);
		System.out.println("Dame funcion de nivel de compra (O,H,P): ");
		char op1=t.next().charAt(0);
		System.out.println("Dame el producto (H,M): ");
		char op2=t.next().charAt(0);
		System.out.println("El descuento del cliente es "+Calcula(op1,op2)+"%");
		t.close();

	}
    public static int Calcula(char op1, char op2) {
    	int descuento;
    	if(op1=='O') {
    		if(op2=='H') descuento=5;
    		else descuento=5;
    	}
    	else if(op1=='H') {
    		if(op2=='H') descuento=10;
    		else descuento=20;
    	}
    	else {
    		if(op2=='H') descuento=15;
    		else descuento=20;
    	}
    	return descuento;
    }
}

import java.util.Scanner;
public class Sesion16 {
	//Sesion 16 entera
	//Tarea 3
	public static int[] NuevoVector() {
		Scanner t = new Scanner(System.in);
		System.out.print("\nIntroduce el temaño del vector: ");
		int tamaño = t.nextInt();
		int[] v = new int[tamaño];
		for(int i = 0; i<v.length;i++) {
			System.out.print("\nIntroduce un numero al vector: ");
			int n = t.nextInt();
			v[i] = n;
		}
		t.close();
		return v;
	}
	//Tarea 3
	public static void LeeVector(int[] v) {
		for(int j = 0; j< v.length; j++) {
			if(j==0)System.out.print("{"+v[j]+",");
			else if (j>0 && j<v.length-1)System.out.print(v[j]+",");
			else System.out.print(v[j]+"}");
		}
	}
	
	public static void main(String[] args) {
		//Tarea 1
		int[] vector = {5,4,3,9,0,7};
		double media = 0;
		for(int i = 0; i< vector.length; i++) {
			if(i==0)System.out.print("{"+vector[i]+",");
			else if (i>0 && i<vector.length-1)System.out.print(vector[i]+",");
			else System.out.print(vector[i]+"}");
			media += vector[i];
		}
		//Tarea 2
		media /= vector.length;
		System.out.printf("\nLa media es %.2f", media);
		//Tarea 3
		int[] v = NuevoVector();
		LeeVector(v);
		//Tarea 4 y 5
		int cont = 0;
		int cont2 = 0;
		for(int x = 0; x<v.length;x++) {
			if((x+1)<v.length)if(v[x]<v[x+1]) cont++;
			if((x+1)<v.length)if(v[x]<v[x+1] && v[x]%7 == 0) cont2++;
		}
		System.out.printf("\nHay %d numeros menores que el siguiente.",cont); //Tarea 4
		System.out.printf("\nHay %d numeros menores que el siguiente y multiplos de 7.",cont2); //Tarea 5
	}
}

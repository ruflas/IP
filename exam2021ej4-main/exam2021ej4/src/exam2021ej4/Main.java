package exam2021ej4;

public class Main {

	public static void main(String[] args) {
		int[] v= {2,1,1,2,2,5,4,4,4};
		System.out.print(Seguidos(v));
	}
	public static int Seguidos(int[] v) {
		int max=1;
		int cont=1;
		int i=1;
		while(i<v.length){
			if (v[i]==v[i-1]) {
				cont++;
				if (cont>max) max=cont;
			}
			else cont=1;
			i++;
		}
		return max;
	}

}

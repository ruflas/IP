import java.util.Scanner;
public class Modelo2 {
    public static void main(String[] args) throws Exception {
        Scanner t = new Scanner(System.in);
        System.out.print("Introduce (a) inicio (b) final del rango:");
        int a = t.nextInt();
        int b = t.nextInt();
        int prod = 1;
        for(int i = a; i<=b ; i++){
            if(i%2 != 0 || i%4 == 0){
                prod *= i;
            }
        }
        System.out.printf("Producto de los impares o multiplos de 4: %d\n",prod);

        int n = 1;
        int cont = 0;
        boolean check=true;
        while (n > 0){
            System.out.print("Introduce la secuencia:");
            n  = t.nextInt();
            cont++;
            if(n > 0 && n < Math.pow(cont,2)){
                check = false;
                break;
            } 
        }
        System.out.printf("%b",check);
        t.close();
    }
}

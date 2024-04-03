package EjerciciosTema4;
import java.util.Scanner;

public class Main{

    public static void main (String[] args){
        Scanner scanner= new Scanner(System.in);
        System.out.println("La suma d elos 10 primeros numeros es: " + suma(10));
        System.out.println("Introduce dos valores a y d: ");
        int a= scanner.nextInt();
        int d= scanner.nextInt();
        int mayor, menor=0;
            if(a>d){
            mayor=a;
            menor=d;
            }
            else{
                mayor=d;
                menor=a;
            }
            
        lista(menor,mayor);
    }

    public static int suma (int n){
        if(n==0) return 0;
        return n + suma(n-1);
    }

    public static int lista(int menor, int mayor){
        
        if(menor==mayor){
            return menor;
        }
        else if(menor<mayor){
            return menor+ lista(menor, menor+1);
        }
        return 0;
    }
}
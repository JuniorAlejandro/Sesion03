package semana03;
import java.util.Scanner;

public class Ejercicio01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
       
        System.out.print("Ingresa el primer número (n1): ");
        int n1 = sc.nextInt();
        System.out.print("Ingresa el segundo número (n2): ");
        int n2 = sc.nextInt();
        System.out.print("Ingresa el tercer número (n3): ");
        int n3 = sc.nextInt();
        
       
        if ((n2 - n1) == (n3 - n2)) {
            System.out.println("Los números están en progresión aritmética.");
        } else {
            System.out.println("Los números NO están en progresión aritmética.");
        }
    }
}

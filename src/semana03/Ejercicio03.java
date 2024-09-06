package semana03;
import java.util.Scanner;

public class Ejercicio03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Lectura de los datos del producto
        System.out.print("Ingresa el precio del producto: ");
        double precioProducto = sc.nextDouble();
        System.out.print("Ingresa el número del día de la compra (1 para lunes, 7 para domingo): ");
        int numeroDia = sc.nextInt();
        
        // Verificar si procede el cambio del producto
        if ((precioProducto >= 50 && precioProducto <= 80 && numeroDia == 1) ||
            (precioProducto >= 120 && numeroDia != 3 && numeroDia != 4)) {
            System.out.println("Procede el cambio del producto.");
        } else {
            System.out.println("NO procede el cambio del producto.");
        }
    }
}

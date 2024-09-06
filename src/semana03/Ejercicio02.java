package semana03;
import java.util.Scanner;

public class Ejercicio02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Lectura de los datos de la persona
        System.out.print("Ingresa el sexo (M para masculino, F para femenino): ");
        char sexo = sc.next().charAt(0);
        System.out.print("Ingresa la edad: ");
        int edad = sc.nextInt();
        
        // Verificar si la persona puede jubilarse
        if ((sexo == 'M' || sexo == 'm') && edad >= 65) {
            System.out.println("La persona puede jubilarse.");
        } else if ((sexo == 'F' || sexo == 'f') && edad >= 60) {
            System.out.println("La persona puede jubilarse.");
        } else {
            System.out.println("La persona NO puede jubilarse.");
        }
    }
}

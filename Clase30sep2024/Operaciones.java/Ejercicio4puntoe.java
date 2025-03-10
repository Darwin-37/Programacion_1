import java.util.Scanner;
public class Ejercicio4puntoe{
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        // Leer la distancia
        System.out.print("Ingrese la distancia: ");
        double distancia = leer.nextDouble();

        // Verificar si la distancia está en el rango
        if (distancia > 20 && distancia < 35) {
            // Si la condición se cumple, pedir el tiempo
            System.out.print("Ingrese el tiempo: ");
            double tiempo = leer.nextDouble();
            System.out.println("Distancia: " + distancia + " - Tiempo: " + tiempo);
        } else {
            System.out.println("La distancia no está en el rango requerido.");
        }

        leer.close(); // Cerramos el scanner
    }
}
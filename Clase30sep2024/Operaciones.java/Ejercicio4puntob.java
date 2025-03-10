import java.util.Scanner;

public class Ejercicio4puntob {
    public static void main(String[] args) {

        // datos por teclado
        Scanner leer = new Scanner(System.in);

        // declaramos variables
        double temperatura = 0.0;

        // Solicitar por teclado la temperatura
        System.out.print("Digitar temperatura: ");
        temperatura = leer.nextDouble();

        // condicional
        if (temperatura >= 100) {
            System.out.println("Por encima del punto de ebullicion");
        } else {
            System.out.println("Por debajo del punto de ebullicion");

        }
leer.close();
    }
}
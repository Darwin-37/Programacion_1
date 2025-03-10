import java.util.Scanner;

public class Ejercicio4puntoa {

    public static void main(String[] args) {

        // Clase que permite a traves del objeto "leer" socilitar
        // datos por teclado
        Scanner leer = new Scanner(System.in);

        // Se declaran las variables o las variables
        double angulo;

        // Solicitara por terclado el angulo para su validacion
        System.out.print("Digite el angulo: ");
        angulo = leer.nextInt();

        // Condicional
        if (angulo == 90) {
            System.out.println("El angulo es recto ");
        } else {
            System.out.print("El angulo NO es recto ");
        }
    }
}
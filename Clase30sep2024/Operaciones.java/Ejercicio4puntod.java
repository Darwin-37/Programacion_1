import java.util.Scanner;
public class Ejercicio4puntod {

    public static void main(String[] args) {

        // Clase que permite a traves del objeto "leer" socilitar
        // datos por teclado
        Scanner leer = new Scanner(System.in);

        // Se declaran las variables o las variables
       int x,y,z,p;

        // Solicitara por teclado el valor de x para su validacion
        System.out.print("Digite el valor de x: ");
        x = leer.nextInt();

        System.out.print("Digite el valor de y: ");
        y = leer.nextInt();

        System.out.print("Digite el valor de z: ");
        z = leer.nextInt();

        // Condicional
        if (x > y && z <20) {
            System.out.println("ingresar valor para p: " );
           p = leer.nextInt();
            System.out.println("Valor de p: " + p);
        } else {
            System.out.println("La condición no se cumple.");
        }
        leer.close();
    }
}
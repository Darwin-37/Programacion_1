import java.util.Scanner;
public class main {
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.print ("Digite el valor de r");
        double radio = leer.nextDouble ();
        
        double l = 3.14 * (radio * radio);
        double a = (radio * radio) * 3.1416;
        
        System.out.print ("La longitud de la circunferencia es : " 
        +l+ " y el àrea de la misma circunfere");
        
        leer.close();
        
    }
    
}

import java.util.Scanner;

public class Dulcealgoritmo {
    public static void main(String[] args) { 
        // Declaramos las variables
        double costobarra = 2.50;
        double costoempaque = 0.50;
        double ganancia = 0.30;

        // Digitamos por el teclado el numero de barras
        Scanner leer = new Scanner(System.in);
        System.out.println("Digite el valor de n:");
        int n = leer.nextInt();

        // Hacemos los calculos para mostrar costo de produccion, precio venta por barra, ingreso total, cajas completas y barras sobrantes

double ctp = (costobarra + costoempaque) * n;
double pvb = (costobarra + costoempaque) * (1 + ganancia);
double ingt = (pvb) + n;
int cc = (n/10);
int bs = (n % 10);

System.out.println("Costo de produccion:$ " + ctp);
System.out.println("Precio venta por barra:$ "+ pvb);
System.out.println("Ingreso total:$15 "+ ingt);
System.out.println("Cajas completas: "+ cc);
System.out.println("Barras sobrantes: "+ bs);
}
}

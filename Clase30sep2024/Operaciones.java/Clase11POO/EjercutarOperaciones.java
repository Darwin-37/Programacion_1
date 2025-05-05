public class EjercutarOperaciones {
    public static void main(String[] args) {
        OperacionesBasicas operaciones = new OperacionesBasicas();

        double num1 = 30;
        double num2 = 20;

        System.out.println("Suma: " + operaciones.sumar(num1, num2));
        System.out.println("Resta: " + operaciones.restar(num1, num2));
        System.out.println("Multiplicación: " + operaciones.multiplicar(num1, num2));
        System.out.println("División: " + operaciones.dividir(num1, num2));
    }
}
    

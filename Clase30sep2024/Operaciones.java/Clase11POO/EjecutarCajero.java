public class EjecutarCajero {
    public static void main(String[] args) {

        // Crear el objeto para trabajar con los metodos del Cajero Electronico

        CajeroElectronico objP1 = new CajeroElectronico(1000.0);

        // Escenario 1
        // Depositar 1300.0 dolares
        System.out.println("Nuevo saldo: " + objP1.depositar(1300.0));

        // Consultar saldo actual
        System.out.println("Saldo actual: " + objP1.consultarSaldo(0));

        // Retirar una cantidad de 2000 dolares
        objP1.retirar(2000.0);

        // Transferir 200 a Medelin
        objP1.transferir(200.0, " Medelin ");

    }
}

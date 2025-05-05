public class CajeroElectronico {
    // Atributos
    private double saldo;

    // Constructor
    public CajeroElectronico(double saldo) {
        this.saldo = saldo;
    }

    // Metodos
    // Obtiene lo que tenga asignado el atributo saldo
    // return saldo
    // param cantidad
    public double getSaldo() {
        return saldo;
    }

    public double depositar(double cantidad) {
        return saldo += cantidad;
    }

    public void retirar(double cantidad) {
        saldo -= cantidad;
        if (cantidad <= saldo) {
            System.out.println("El nuevo saldo es : " + saldo);
        } else {
            System.out.println(" La cantidad a retirar es mayor que el saldo ");
        }
    }
    // Obtener el saldo de la cuenta
    // return saldo

    public double consultarSaldo(double cantidad) {
        return saldo;

    }

    public void transferir(double cantidad, String destino) {
        saldo -= cantidad;
        if (cantidad <= saldo) {
            System.out.println("Se realizo una transferencia por: " + cantidad +
                    "a:" + destino + " su saldo es de : " + saldo);
        } else {
            System.out.println("La transferencia nose pudo realizar");
        }
    }
}

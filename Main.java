
public class Main {

    public static void main(String[] args) {

        CajaAhorro caja = new CajaAhorro(
                "CA001", 100000, "Gabriel", 2
        );

        CuentaCorriente corriente = new CuentaCorriente(
                "CC001", 20000, "Martina", 10000
        );

        System.out.println("=== CAJA DE AHORRO ===");

        caja.depositar(15000);
        caja.extraer(10000);
        caja.aplicarIntereses();
        caja.mostrarSaldo();

        System.out.println("\n=== CUENTA CORRIENTE ===");

        corriente.depositar(5000);
        corriente.extraer(30000);
        corriente.extraer(10000);
        corriente.mostrarSaldo();
    }
}

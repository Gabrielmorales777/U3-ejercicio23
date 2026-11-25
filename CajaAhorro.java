
public class CajaAhorro extends CuentaBancaria {

    private double tasaInteresMensual;

    public CajaAhorro(String numeroCuenta, double saldo, String titular,
                      double tasaInteresMensual) {

        super(numeroCuenta, saldo, titular);
        this.tasaInteresMensual = tasaInteresMensual;
    }

    public void aplicarIntereses() {
        double intereses = saldo * tasaInteresMensual / 100;
        saldo += intereses;

        System.out.println("Intereses aplicados: $" + intereses);
    }
}


public class CuentaCorriente extends CuentaBancaria {

    private double limiteSobregiro;

    public CuentaCorriente(String numeroCuenta, double saldo, String titular,
                           double limiteSobregiro) {

        super(numeroCuenta, saldo, titular);
        this.limiteSobregiro = limiteSobregiro;
    }

    @Override
    public void extraer(double monto) {
        if (monto > 0 && monto <= saldo + limiteSobregiro) {
            saldo -= monto;
            System.out.println("Extracción realizada: $" + monto);
        } else {
            System.out.println("Extracción rechazada. "
                    + "Se superó el límite de sobregiro.");
        }
    }
}

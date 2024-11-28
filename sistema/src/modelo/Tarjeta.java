
package modelo;

/**
 *
 * @author eduardo
 */
public class Tarjeta {
    private int numero, cuenta;
    private String nip, fechaVencimiento;

    public Tarjeta() {

    }

    public void setCuenta(int cuenta) {
        this.cuenta = cuenta;
    }

    public void setFechaVencimiento(String fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getCuenta() {
        return cuenta;
    }

    public String getFechaVencimiento() {
        return fechaVencimiento;
    }

    public String getNip() {
        return nip;
    }

    public int getNumero() {
        return numero;
    }
}

package modelo;

/**
 *
 * @author eduardo
 */
public class Movimiento {
    private int numero, tipo;
    private double cantidad;
    private String fecha, hora;

    public Movimiento() {

    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public String getHora() {
        return hora;
    }

    public int getTipo() {
        return tipo;
    }

    public int getNumero() {
        return numero;
    }

    public String getFecha() {
        return fecha;
    }

    public double getCantidad() {
        return cantidad;
    }

}

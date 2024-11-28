/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author eduardo
 */
public class Cuenta {
    private int numero, tipo, cliente;
    private String fechaApertura;
    private double capacidad;

    public Cuenta() {
    }

    public void setCapacidad(double capacidad) {
        this.capacidad = capacidad;
    }

    public void setCliente(int cliente) {
        this.cliente = cliente;
    }

    public void setFechaApertura(String fechaApertura) {
        this.fechaApertura = fechaApertura;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public double getCapacidad() {
        return capacidad;
    }

    public int getCliente() {
        return cliente;
    }

    public String getFechaApertura() {
        return fechaApertura;
    }

    public int getNumero() {
        return numero;
    }

    public int getTipo() {
        return tipo;
    }
}

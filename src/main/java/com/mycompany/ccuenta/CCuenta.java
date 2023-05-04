/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.ccuenta;

import java.util.List;

/**
 * Clase que permite crear objetos Cuenta Corriente con los atributos: nombre, cuenta, saldo, tipoInteres y factura.
 * Incluye los métodos: setNombre, getNombre, getEstado, ingresar, retirar, getCuenta y cobroFactura.
 * 
 * @author David Noguera García
 * @version 1.0 14/03/2023
 * @since 01/01/2023
 * @see Main
 */
public class CCuenta {

    /**
     * ATRIBUTOS DE LA CLASE
     * 
     * nombre tipo String - Indica el titular de la cuenta corriente.
     * cuenta tipo String - Indica el número de cuenta corriente.
     * saldo tipo double - Indica la cantidad de dinero en cuenta.
     * tipoInterés tipo double - Indica el porcentaje de interés que se le aplica a la cuenta.
     * factura array de tipo String - Contiene las opciones de tipos de factura disponibles
     */
    
    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;
    private String[] factura = {"seguro", "luz", "agua", "alquiler"};
    
    private int contador = 1;
    private double comision = 0.0;
    private String producto;

    /**
     * Constructor sin argumentos
     */

    public CCuenta() {
    }

    /**
     * Constructor con parámetro para iniciar todas las propiedades de la clase
     * 
     * @param nom tipo String - Indica el titular de la cuenta corriente.
     * @param cue tipo String - Indica el número de cuenta corriente.
     * @param sal tipo double - Indica la cantidad de dinero en cuenta.
     * @param tipo tipo double - Indica el porcentaje de interés que se le aplica a la cuenta.
     */
    public CCuenta(String nom, String cue, double sal, double tipo) {
        nombre = nom;
        cuenta = cue;
        saldo = sal;
    }

    /**
     * Método para asignar el nombre del titular de la cuenta.
     * 
     * @param nom tipo String - Indica el titular de la cuenta corriente.
     */
    
    public void setNombre(String nom) {
        nombre = nom;
    }

    /**
     *  Método que me devuelve el nombre del titular
     * 
     * @return tipo String con el valor del atributo nombre del titular de la cuenta corriente.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Método que me devuelve el saldo disponible en cada momento.
     * 
     * @return tipo double con el valor del atributo saldo disponible en cada momento.
     */
    public double getEstado() {
        return getSaldo();
    }

    /**
     * Método para ingresar cantidades en la cuenta. Modifica el saldo.
     * 
     * @param cantidad tipo double - Indica el valor de la cantidad en la que se aumentará el saldo.
     * @throws Exception tipo Exception cuando el argumento cantidad sea inferior a 0.
     */
    
    public void ingresar(double cantidad) throws Exception {
        if (cantidad < 0) {
            throw new Exception("No se puede ingresar una cantidad negativa");
        }
        setSaldo(getSaldo() + cantidad);
    }

    /**
     * Método para retirar cantidades en la cuenta. Modifica el saldo.
     * 
     * @param cantidad tipo double - Indica el valor de la cantidad en la que se reducirá el saldo.
     * @throws Exception tipo Exception cuando el argumento cantidad sea inferior a 0.
     *                   tipo Exception cuando el saldo (getEstado) sea insuficiente.
     */

    public void retirar(double cantidad) throws Exception {
        if (cantidad <= 0) {
            throw new Exception("No se puede retirar una cantidad negativa");
        }
        if (getEstado() < cantidad) {
            throw new Exception("No se hay suficiente saldo");
        }
        setSaldo(getSaldo() - cantidad);
    }

    /**
     * Método que me devuelve el número de cuenta.
     * 
     * @return tipo String - Indica el número de cuenta.
     */
    
    public String getCuenta() {
        return cuenta;
    }

    /**
     * Método para el cobro de una factura según el supuesto contenido en el array.
     * 
     * @param tipo tipo String - Especifíca el tipo de factura que se va a cargar en la cuenta.
     * @param cantidad tipo double - Indica cuánto se va a cobrar por la factura.
     */
    
    public void cobroFactura(String tipo,double cantidad){
        switch(tipo){
        
            case "alquiler":
                if (cantidad >0 && cantidad<=400)
                    this.setSaldo(this.getSaldo() - cantidad); //this.saldo = this.saldo-cantidad;
                break;
            case "luz":
                if (cantidad<=200)
                    this.setSaldo(this.getSaldo() - cantidad);
            case "agua":
                
                if (cantidad >0 && cantidad<=200)
                    this.setSaldo(this.getSaldo() - cantidad);
                break;
            case "seguro":
                if (cantidad >0 && cantidad<=125)
                    this.setSaldo(this.getSaldo() - cantidad);
                    
                
        }
    
    }

    /**
     * Método que asigna el valor al String cuenta
     * 
     * @param cuenta tipo String - indica el número de cuenta corriente.
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * Método que devuelve el saldo de la cuenta.
     * 
     * @return tipo double - Indica el saldo que hay en cuenta.
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * Método que asigna el valor al saldo que hay en cuenta.
     * 
     * @param saldo tipo double - Indica el saldo en cuenta.
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * Método que devuelve el tipo de interés.
     * 
     * @return tipo double - Indica el tipo de interés.
     */
    public double getTipoInterés() {
        return tipoInterés;
    }

    /**
     * Método que asigna el valor a tipoInteres.
     * 
     * @param tipoInterés tipo double - Indica el tipo de interés.
     */
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }

    /**
     * Método que devuelve la clase de factura utilizada.
     * 
     * @return tipo String - Indica la clase de factura entre las opciones del array.
     */
    public String[] getFactura() {
        return factura;
    }

    /**
     * Método que asigna el valor a la factura.
     * @param factura tipo array String - Indica las clases de factura que se pueden escoger.
     */
    public void setFactura(String[] factura) {
        this.factura = factura;
    }
    
}
    
 
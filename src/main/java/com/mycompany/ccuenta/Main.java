/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.ccuenta;

/**
 * Clase principal de cuenta corriente.
 * @author ED05
 */
public class Main {

    /**
     * Método estático de CCuenta
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CCuenta cuenta1;
        double saldoActual;
        
        operativa_cuenta(3000);
        
     
        
    }

    private static void operativa_cuenta(float cantidad) {
        CCuenta cuenta1;
        double saldoActual;
        cuenta1 = new CCuenta("Manuel Mantecas","0000-1234-55-123456789",3000,0);
        try 
        {
            cuenta1.retirar(2300);
        } catch (Exception e)
        {
            System.out.println("Fallo al retirar");
        }
        try
        {
            System.out.println("Ingreso en cuenta");
            cuenta1.ingresar(695);
        } catch (Exception e)
        {
            System.out.println("Fallo al ingresar");
        }
        saldoActual = cuenta1.getEstado();
        System.out.println("El saldo actual es "+ saldoActual );
    }

}


package com.brayan.mundopc;
public class Orden {
    private final int idOrden;
    private static int contadorOrdenes;
    private Computadora computadoras[];
    private int contadorComputadoras;
    private static final int MAX_COMPUTADORAS = 10;
    
    public Orden(){
        this.idOrden = ++Orden.contadorOrdenes;
        this.computadoras = new Computadora[Orden.MAX_COMPUTADORAS];
    }
    
    public void agregarComputadora(Computadora computadora){
        if(this.contadorComputadoras < Orden.MAX_COMPUTADORAS){
            computadoras[this.contadorComputadoras++] = computadora;
        }
        else{
            System.out.println("Alcanzo el maximo de computadoras por orden: " + Orden.MAX_COMPUTADORAS);
        }
    }
    
    public void mostrarOrden(){
        System.out.println("\t---ORDEN COMPUTADORAS---");
        System.out.println("Id Orden: " + this.idOrden + "\n" +
                            "Lista de computadoras...");
        for (int i = 0; i < this.contadorComputadoras; i++) {
            System.out.println(this.computadoras[i]);
        }
        System.out.println("Numero total de computadoras: " + this.contadorComputadoras);
    }
    
}


package mundopc;

import com.brayan.mundopc.*;

public class MundoPC {
    public static void main(String[] args) {
        
        Teclado teclado1 = new Teclado("USB-C", "AdobXP3");
        Raton raton1 = new Raton("USB-A", "MiniPro45");
        Monitor monitor1 = new Monitor("Asus", 150);
        Computadora computadora1 = new Computadora("Asus TUF3", monitor1, teclado1, raton1);
        
        Orden orden1 = new Orden();
        orden1.agregarComputadora(computadora1);
        
        Teclado teclado2 = new Teclado("USB-C", "Tactlock");
        Raton raton2 = new Raton("USB-C", "DorignX");
        Monitor monitor2 = new Monitor("HP", 144);
        Computadora computadora2 = new Computadora("HP Viwio", monitor2, teclado1, raton2);
        
        orden1.agregarComputadora(computadora2);
        orden1.mostrarOrden();
    }
}

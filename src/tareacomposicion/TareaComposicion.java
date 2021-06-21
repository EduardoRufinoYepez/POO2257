/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareacomposicion;

import ico.fes.componentes.CPU;
import ico.fes.componentes.Monitor;
import ico.fes.componentes.Mouse;
import ico.fes.componentes.Teclado;
import ico.fes.pc.Computadora;

/**
 *
 * @author Yo claro que si
 */
public class TareaComposicion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Computadora pc1 = new Computadora();
        
        pc1.setMarca("Lenovo");
        pc1.setModelo("IdeaPad S145 - Granite Black");
        pc1.setCpu(new CPU("AMD","3020e", 2.6f));
        pc1.setMonitor(new Monitor("Lenovo","S145",14));
        pc1.setMouse(new Mouse("Logitech","G502 Hero High Performance","Gaming"));
        pc1.setTeclado(new Teclado("Lenovo","No retroiluminado",255,105));

        System.out.println(pc1.toString());
        
        
    }
    
}

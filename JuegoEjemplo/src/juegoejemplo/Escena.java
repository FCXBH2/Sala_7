
package juegoejemplo;

import java.util.Scanner;


public class Escena {
    private Auto auto;
    private Pared pared;
    
    public Escena(Auto auto){
           this.auto=auto;
           this.pared=new Pared();
    }

    public void setAuto(Auto auto) {
        this.auto = auto;
    }
    
    public void jugar(){
       boolean salir = false;
       boolean choque= false;
       
        System.out.println("POSICION DE AUTO:");
        System.out.println("POS X: "+ auto.getPosX());
        System.out.println("POS Y: "+ auto.getPosY());
        
        System.out.println("///////////////////////////");
        
        System.out.println("POSICION DE PARED:");
        System.out.println("POS X: "+ pared.getPosX());
        System.out.println("POS Y: "+ pared.getPosY());
        
        System.out.println("///////////////////////////");
        System.out.print("");
        
        
            System.out.println("MENU:");
            System.out.println("A - Izquierda");
            System.out.println("S - Abajo");
            System.out.println("D - Derecha");
            System.out.println("W - Arriba");
            System.out.println("E - Salir del juego");
            System.out.print("Ingrese su movimiento: ");
            
     
            
while (!salir || !choque  ) {
           
            Scanner leer = new Scanner(System.in);
            String movimiento = leer.nextLine();
             switch (movimiento) {
                        case"a":  auto.moverIzquierda();
                                   posiciones();
                        break;
                        case "s": auto.moverAbajo();
                                     posiciones();
                        break;
                        case "d":
                                    auto.moverDerecha();
                                     posiciones();
                        break;
                        case "w":
                                     auto.moverArriba();
                                     posiciones();
                            break;
                        case "e":
                            salir = true;
                            System.out.println("El juego ha terminado");
                            System.out.println("POSICION DE AUTO:");
                            System.out.println("POS X: "+ auto.getPosX());
                            System.out.println("POS Y: "+ auto.getPosY());
        
                            System.out.println("///////////////////////////");
        
                            System.out.println("POSICION DE PARED:");
                            System.out.println("POS X: "+ pared.getPosX());
                            System.out.println("POS Y: "+ pared.getPosY());
        
                            
                            break;
                        default:
                            System.out.println("Movimiento no válido");
                    }

        }      
    }
    
    
    public void posiciones(){
         if (auto.getPosX() == pared.getPosX() && auto.getPosY()== pared.getPosY() ) {
                                    boolean choque= true;   
                                    
                                    System.out.println("PUUUUUUUUUM");}
    }
   
      

}

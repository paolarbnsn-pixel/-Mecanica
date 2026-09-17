
package ec.edu.espoch.mecanica.java;

public class Car {
    /*atributos*/
     public String color;
     public String brand;
     public String model;
     public boolean state;
     /*metodo*/
     
     public void started(){
         System.out.println("el carro esta encendido");
     }
     public void stopped(){
         System.out.println("el carro esta apagado"); 
      }  
     public void acelerate(){
          System.out.println("Aceleraste");
      }
     public void brake(){
         System.out.println("Frenaste");
     }
}

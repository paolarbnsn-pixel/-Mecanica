

package ec.edu.espoch.mecanica.java;

public class MecanicaJava {

    public static void main(String[] args) {
        //crear un objeto
       
       Car carOne = new Car();
        carOne.started();
        
        Car carTwo= new Car();
         carTwo.stopped();
         
         Person personOne=new Person();
         personOne.name="Paola";
         personOne.drive(false);
         
         Person personTwo= new Person();
         personTwo.name=" ale ";
         personTwo.drive(true);
        
         Person personThree= new Person();
         personThree.name=" JOEL ";
         personThree.drive(true);
    }
}

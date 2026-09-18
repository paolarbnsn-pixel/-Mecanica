
package ec.edu.espoch.mecanica.java;

public class Person {
    /* atributos*/
    public String name;
    public int age;
  
   
    /*metodos*/
     public void gein(){
         
     }
       public void getout(){
    }
       public void drive(boolean state){
           if(state==true){
             System.out.println( name +" , puedes manejar el carro");
         }else{
             System.out.println( name +" enciende el carro");
         }
       }
}

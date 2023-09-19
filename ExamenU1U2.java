/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examenu1u2;
import java. util.Scanner;
/**
 *
 * @author labcca
 */
public class ExamenU1U2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner ss= new Scanner (System.in);
                
        
                
        System.out.println("Ingrese productos");
        
       
        System.out.println("Ingrese seccion de producto 1-5 ");
        double PV1 = ss.nextDouble();
        
        System.out.println("Ingrese seccion de producto 1-5 ");
        double  PV2 = ss.nextDouble();
        
        System.out.println("Ingrese seccion de producto 1-5 ");
        double PV3 = ss.nextDouble();
        
        
        
        double P1= (353.65*100)/30;
        double P2= (803.50*100)/65;
        double P3= (747.00*100)/15;
        
      
        
        System.out.println("El precio final del videojuego1 " + P1);
        System.out.println("El precio final del videojuego2 " + P2);
        System.out.println("El precio final del videojuego3 " + P3);
        
        
        
        
        
        
        
          
        
    }
    
}


package prueba;

import java.util.Scanner;

/**
 *
 * @author Giovanni
 */
public class For_Anidado {
    
     public static void main(String[] args) 
    {
        int a=0;
        Scanner num = new Scanner(System.in);
        
        System.out.println("Ingrese el no. de finalización del triángulo");
        a = num.nextInt();
        System.out.println(" ");
        
     for (int i = 1; i < a; i++) {
            
           for (int j = 1; j <= i; j++) {
                
                System.out.print( j );
            }
           System.out.println(" "); 
        }
        
    }
}

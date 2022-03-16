
package calculadora;

import java.util.Scanner;


public class calc {

public static void main(String args[]){   

     int op; 
    double n1,n2,r = 0;
    
    
    Scanner leia = new Scanner(System.in); 
    
    System.out.println("DIGITE O PRIMEIRO NUMERO");
     n1 = leia.nextDouble(); 
     
     System.out.println("DIGITE O SEGUNDO NUMERO");
     n2 = leia.nextDouble();
     
     System.out.println("ESCOLHA UMA DAS OPÇÕES");
     System.out.println("1 - SOMAR");
     System.out.println("2 - SUBTRAIR");
     System.out.println("3 - MULTIPLICAR");
     System.out.println("4 - DIVIDIR");
     op = leia.nextInt();  
    
     switch(op){
     
         case 1:
           
             r = n1+n2;
          
            break;
    
    case 2:
            r = n1-n2;
         
            break;
    
    case 3:
             r = n1*n2;
         
            break;
 
            
    case 4: 
        
         r = n1/n2;
        
        break;
            
    default:
        
       System.out.println("INVALIDO"); 
            
     
     }
     
     System.out.println("O resultado é: " + r); 
     
}

}
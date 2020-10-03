import java.util.Scanner;
/**
 * @author MrOverfl0w
 */


public class NumeroPrimo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner lea = new Scanner(System.in); 
        int j,k,divisor;
        boolean Sw_p; 
        System.out.println("Digite el número ");
        k=lea.nextInt(); 
        j=2; 
        Sw_p=true;
        divisor=0;
        while((Sw_p==true) && (j<=k-1)){
            if(k%j ==  0 ){
                Sw_p=false;
                divisor=j;
                
            }
            j=j+1;
        }
        if (Sw_p == true ){
            System.out.println("El número "+k+" es primo");
        }else{
            System.out.println("El número "+k+" no es primo porque su divisor es =... "+divisor);
        }
           
        
        
        
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adams_3_challenge0;

/**
 *
 * @author nadams4399
 */
public class Adams_3_Challenge0 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       for( int i=0; i<500 ; i++){
           if(isDivisibleByFive(i) && isDivisibleByEleven(i)){
               if (isDivisbleByFive(i)){
                   System.out.println("Animate This");
                           
           }else if (isDivisibleByThree(i) && isDivisibleByEleven(i)){
               System.out.println("Herr Direkor");
           }else if (isDivisibleByTwo(i) && isDivisibleByEleven(i)){
               System.out.println("ninja");
           } else if (isDivisibleByTwo(i) && isDivisibleByThree(i) && isDivisiblebyTwo(i)){
               System.out.println("Team Building");
           } else if(isDivisibleByThree(i) && isDivisibleByFive(i)){
               System.out.println("Old School");
           } else if(isDivisibleByTwo(i) && isDivisibleByThree(i)){
               System.out.println("chisme");
           } else if(isDivisibleByFive(i)){
               System.out.println("Vidal");
           } else if(isDivisibleByThree(i)){
               System.out.println("Claughton");
           } else if(isDivisiblebyTwo(i)){
               System.out.println("Davis");
               
           }
           }
                  

       
          
           
           
    }
    
}
static boolean isDivisiblebyTwo (int number){
    if(number % 2 == 0){
        return true;
    }
    else
        return false;
}
}
package Adams_3_games;

import java.util.Scanner;

public class Adams_3_games {
    static Scanner jordan = new Scanner (System.in);
    static int b;
    static int a;
    static String answer;
    static boolean playagain;
    static boolean goodAnswer = false;
    static boolean letsplay=true;
   

    public static void main(String[] args) {
  
        System.out.println("You are a runningback playing football and a linebacker is running towards you, You either juke(a) or truck the defender?");
        start();
        main();
        
    while (letsplay){
    game();
    }
    }
    static void start(){
        Scanner userchoice = new Scanner(System.in);  
        answer = userchoice.nextLine();
        if(answer.contains("a")){
            System.out.println("You juke the defender and you get tackled!");
            System.out.println("you got tackled... you lose.");
      playagain = false;
        }else if(answer.contains("b")){
            System.out.println("You truck the defender and you run the defender over");
            System.out.println("you scored a Touchdown!! you Win!!");
           

}         
    }
       

    static void main() {

}
        static void game() {
            
        }
}

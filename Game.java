import java.util.Scanner;
import java.util.Random;
public class Game {

    public static void main(String[] args) {
    // 0 for rock
    // 1 for Paper
    // 2 for Scissor

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter 0 for Rock , 1 for paper, 2 for Scissor ");
    int userinput= sc.nextInt();

    Random random = new Random();
    int computerinput=random.nextInt(3);

    if (userinput==computerinput){

        System.out.println("Draw");
    }
    else if (userinput==0 && computerinput==2 || userinput==1 && computerinput==0 || userinput==1 && computerinput==0) {
        System.out.println("You Wins!!");
        
    }
    else{
        System.out.println("Computer Wins");
    }
    System.out.println("Computer choice:"+computerinput);

    if(computerinput==0){
       System.out.println("Computer choice: Rock");
    }

    else if(computerinput==1){
       System.out.println("Computer choice: paper");
    }

    else if(computerinput==2){
       System.out.println("Computer choice: Scissor");
    }



    }
}
      
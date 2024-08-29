import java.util.Random;
import java.util.Scanner;
public class Rps{
    public static void main(String[] args){
        //0 for rock
        // 1 for paper 
        // 2 for scissor
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your choice: 0 for Rock, 1 for paper, 2 for scissor:  ");
        int userinput = sc.nextInt();

        Random random = new Random();
        int compinp = random.nextInt(3);

        if(userinput == compinp)
        {
            System.out.println("Draw");
        }
        else if ((userinput == 0 && compinp == 2) || (userinput == 1 && compinp == 0) || (userinput == 2 && compinp == 1) ) {
            System.out.println("YOU WON");
        }
        else{
            System.out.println("COMPUTE WON");
        }


        if (compinp == 0){
            System.out.println("Comp : Rock");
        }

        else if (compinp == 1) {
            System.out.println("Comp : Paper");
        }
        else{
            System.out.println("Comp : Scissor");
        }
    }    
}
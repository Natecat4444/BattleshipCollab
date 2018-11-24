import java.util.Scanner;

/**
 * Created by nathankaufman on 11/24/18.
 */
public class Main {
    public static boolean gameOver;
    private static Scanner scanner;

    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        gameOver = false;
        System.out.print("Please enter one or two computers: ");
        int computers = scanner.nextInt();
        if(computers == 1){
            //function call
        }
        else if(computers == 2){
            //function call
        }
        else {
            System.out.println("Invalid input, get learnt");
            main(null);
        }

        Player Player1 = new Player();


        //Player Player2 = new Player();

        //MAIN GAME LOOP
        while (!gameOver){
          //WAIT FOR OTHER PLAYER

          //TAKE TURN
          
        }
        System.exit(1);
    }
}

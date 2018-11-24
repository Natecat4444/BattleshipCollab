import java.util.Scanner;

/**
 * Created by nathankaufman on 11/24/18.
 */
public class Main {
    public static boolean gameOver;
    private static Scanner scanner;
    private static int localPort;
    private static String foreignIP;
    private static int foreignPort;


    public static void singleComputerMain(){
      Player Player1 = new Player();
      Player Player2 = new Player();


      //MAIN GAME LOOP
      while (!gameOver){

        //Player1 TAKE TURN

        //PLayer2 TAKE TURN

      }


    }


    public static void multiComputerMain(){
      Player Player1 = new Player();
      Scanner scanner1 = new Scanner(System.in);

      System.out.print("Please enter your port number: ");
      localPort = scanner.nextInt();
      System.out.print("Please enter IP address of other player: ");
      foreignIP = scanner1.nextLine();
      System.out.print("Please enter port number of other player: ");
      foreignPort = scanner.nextInt();

      //MAIN GAME LOOP
      while (!gameOver){
        //WAIT FOR OTHER PLAYER

        //TAKE TURN

      }
    }






    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        gameOver = false;
        System.out.print("Please enter one or two computers: ");
        int computers = scanner.nextInt();
        if(computers == 1){
            singleComputerMain();
        }
        else if(computers == 2){
            multiComputerMain();
        }
        else {
            System.out.println("Invalid input, get learnt");
            main(null);
        }


        System.exit(1);
    }
}

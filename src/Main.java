import java.util.Scanner;
import java.util.ArrayList;
/**
 * Created by nathankaufman on 11/24/18.
 */
public class Main {
    public static boolean gameOver;
    private static Scanner scanner;
    private static int localPort;
    private static String foreignIP;
    private static int foreignPort;
    protected static BattleshipGUI battleshipGUI;


    public static void singleComputerMain(){
      Player Player1 = new Player();
      Player Player2 = new Player();
      int winner = 0;

      Player1.setOpponent(Player2);
      Player2.setOpponent(Player1);

      ArrayList<Player> players = new ArrayList();
      players.add(Player1);
      players.add(Player2);


      //MAIN GAME LOOP
      while (!gameOver){

        Player1.takeTurn();

        winner = checkGameOver(players);
        if (gameOver){break;}

        Player2.takeTurn();

        winner = checkGameOver(players);

      }


    }


    public static void multiComputerMain(){
      Player Player1 = new Player();
      ArrayList<Player> players = new ArrayList();
      players.add(Player1);
      Scanner scanner1 = new Scanner(System.in);
      int winner = 0;

      System.out.print("Please enter your port number: ");
      localPort = scanner.nextInt();
      System.out.print("Please enter IP address of other player: ");
      foreignIP = scanner1.nextLine();
      System.out.print("Please enter port number of other player: ");
      foreignPort = scanner.nextInt();

      //MAIN GAME LOOP
      while (!gameOver){

        //WAIT FOR OTHER PLAYER

        //RECEIVE DATA FROM OTHER PLAYER

        Player1.takeTurn();

        winner = checkGameOver(players);

        //SEND DATA TO OTHER PLAYER

      }
    }

    public static int checkGameOver(ArrayList<Player> players){
      for (int i = 0; i < players.size(); i++){
        if (players.get(i).getShips_alive() == 0){
          gameOver = true;
          if (i == 0) {return 2;} else {return 1;}
        }
      }
      return 0;
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

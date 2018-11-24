import java.util.ArrayList;

/**
 * Created by nathankaufman on 11/24/18.
 */
public class Player {
    protected ArrayList<ArrayList<Square>> layout; //The grid representing player's own ships
    protected ArrayList<ArrayList<Square>> radar; //The grid representing opponents ships
    private int ships_alive;
    protected Player opponent;
    protected int airstrikes; // carrier ammo
    protected int battlebombardments; //battleship ammo
    protected int machineguns; // destroyers ready to shoot
    protected int missiles; // cruiser ready to shoot
    protected int shells; //stealth ships ready to shoot

    public Player(){
      layout = createGrid();
      radar = createGrid();
      ships_alive = 11;
    }

    public void setOpponent(Player opponent){
        this.opponent = opponent;
    }

    /**
    * Method to create a 25*25 grid of empty squares
    */
    public ArrayList<ArrayList<Square>> createGrid(){
      ArrayList<ArrayList<Square>> grid = new ArrayList();
      for (int i = 0; i < 25; i++){
        grid.add(new ArrayList<Square>());
        for (int j = 0; j < 25; j++){
          grid.get(i).add(new Square());
        }
      }

      return grid;
    }

    public int getShips_alive(){
        return ships_alive;
    }

    public void takeTurn(){
        Main.battleshipGUI.setCurrent_player(this);
    }

    public void get_ammunition(){

    }

}

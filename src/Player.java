import java.util.ArrayList;

/**
 * Created by nathankaufman on 11/24/18.
 */
public class Player {
    protected ArrayList<ArrayList<Square>> layout; //The grid representing player's own ships
    protected ArrayList<ArrayList<Square>> radar; //The grid representing opponents ships

    public Player(){
      layout = createGrid();
      radar = createGrid();
    }

    /**
    * Method to create a 25*25 grid of empty squares
    */
    public ArrayList<ArrayList<Square>> createGrid(){
      ArrayList<ArrayList<Square>> grid = new ArrayList();
      for (int i = 0; i < 25; i++;){
        grid.add(new ArrayList<Square>());
        for (int j = 0; j < 25; j++;){
          grid.get(i).add(new Square);
        }
      }

      return grid;
    }

}

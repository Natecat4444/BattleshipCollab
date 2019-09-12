import javafx.beans.InvalidationListener;
import java.util.Observable;

/**
 * Created by nathankaufman on 9/12/19.
 */
public class OneComputer extends Observable {
    private Player player1;
    private Player player2;
    private Player CurrentPlayer;

    public OneComputer(Player player1, Player player2){
        this.player1 = player1;
        this.player2 = player2;
    }


}

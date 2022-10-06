import cs331Helper.cs331TicTacToeBoard;
import cs331Helper.cs331TicTacToeController;
import cs331Helper.cs331TicTacToePlayer;
import cs331Helper.cs331TicTacToeSquare;
import javafx.scene.paint.Color;

public class Players implements cs331TicTacToePlayer {

    private String symbol = "";
    private boolean isTaken = false;

    cs331TicTacToeBoard sharedBoard = new cs331TicTacToeBoard();
    cs331TicTacToeController sharedController = new cs331TicTacToeController();

    Players(String s) {
        this.symbol = s;
    }

    @Override
    public void selectSquare(int arg0, int arg1) {
        cs331TicTacToeSquare a = sharedBoard.squareAt(arg0, arg1);
        a.markSquare(this.symbol);
        a.flashColor(Color.GREEN);
    }
}

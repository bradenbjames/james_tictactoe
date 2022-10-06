import cs331Helper.cs331TicTacToeBoard;
import cs331Helper.cs331TicTacToeController;
import cs331Helper.cs331TicTacToePlayer;
import cs331Helper.cs331TicTacToeSquare;
import javafx.scene.paint.Color;

public class Players implements cs331TicTacToePlayer {

    private String symbol = "";

    cs331TicTacToeBoard sharedBoard = new cs331TicTacToeBoard();
    cs331TicTacToeController sharedController = new cs331TicTacToeController();

    Players(String s) {
        this.symbol = s;
    }

    @Override
    public void selectSquare(int arg0, int arg1) {
        // what to put for 'pane' parameter in this ?
        cs331TicTacToeSquare square = new cs331TicTacToeSquare(null, arg0, arg1);
        square.markSquare(this.symbol);
        square.flashColor(Color.RED);
        /*
         * if (sharedBoard.squareAt(arg0, arg1) == null) {
         * cs331TicTacToeSquare square = new cs331TicTacToeSquare(null, arg0, arg1);
         * square.markSquare(this.symbol);
         * square.flashColor(Color.RED);
         * } else {
         * System.out.println("square is taken");
         * return;
         * }
         */
    }

}

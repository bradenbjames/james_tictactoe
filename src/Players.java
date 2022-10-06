import cs331Helper.cs331TicTacToeBoard;
import cs331Helper.cs331TicTacToeController;
import cs331Helper.cs331TicTacToePlayer;

public class Players implements cs331TicTacToePlayer {

    private String symbol = "";

    cs331TicTacToeBoard sharedBoard = new cs331TicTacToeBoard();
    cs331TicTacToeController sharedController = new cs331TicTacToeController();

    Players(String s) {
        this.symbol = s;
    }

    @Override
    public void selectSquare(int arg0, int arg1) {
        // TODO Auto-generated method stub

    }

}

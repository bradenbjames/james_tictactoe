import cs331Helper.cs331TicTacToeBoard;
import cs331Helper.cs331TicTacToePlayer;
import cs331Helper.cs331TicTacToeSquare;

public class Players extends myTicTacToe implements cs331TicTacToePlayer {

    private String playerSymbol = "";

    Players(String s) {
        this.playerSymbol = s;
    }

    @Override
    public void selectSquare(int arg0, int arg1) {
        if (sharedBoard.squareAt(arg0, arg1) != null) {
        }
        cs331TicTacToeSquare sq = sharedBoard.squareAt(arg0, arg1);
        sq.markSquare(this.playerSymbol);

        sharedController.setControllerMessage("Player " + this.playerSymbol + "s turn is finished");
    }

}

import cs331Helper.cs331TicTacToeBoard;
import cs331Helper.cs331TicTacToeController;
import cs331Helper.cs331TicTacToePlayer;
import cs331Helper.cs331TicTacToeSquare;

public class Players implements cs331TicTacToePlayer {
    private String playerIcon;
    cs331TicTacToeBoard currBoard;
    cs331TicTacToeController currController;

    // initializes on player creation
    Players(String s, cs331TicTacToeBoard currBoard, cs331TicTacToeController currController) {
        this.playerIcon = s;
        this.currBoard = currBoard;
        this.currController = currController;
    }

    @Override
    public void selectSquare(int arg0, int arg1) {
        // select square on board
        cs331TicTacToeSquare sq = currBoard.squareAt(arg0, arg1);
        sq.markSquare(this.playerIcon);
        currController.setControllerMessage("Player " + this.playerIcon + "s turn is finished");
        currController.finishedTurn();
    }

    // return this players icon
    public String getPlayerSymbol() {
        return this.playerIcon;
    }
}

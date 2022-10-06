import cs331Helper.cs331TicTacToeBoard;
import cs331Helper.cs331TicTacToeController;
import cs331Helper.cs331TicTacToeGame;
import cs331Helper.cs331TicTacToePlayer;

public class myTicTacToe implements cs331TicTacToeGame {

    cs331TicTacToeController sharedController = new cs331TicTacToeController();
    cs331TicTacToeBoard sharedBoard = new cs331TicTacToeBoard();

    public myTicTacToe() {
        this.sharedController.setControllerMessage("Select a square to start playing");
    }

    @Override
    public void invalidSquareChosen(int arg0, int arg1) {
        // TODO Auto-generated method stub
        if (arg0 > 2 || arg1 > 2) {
            this.sharedController.setControllerMessage("invalid square chosen");
        }
    }

    @Override
    public void noWinner() {
        // not working
        this.sharedController.setControllerMessage("it's a tie");
    }

    @Override
    public void playerWins() {
        // TODO Auto-generated method stub
        cs331TicTacToePlayer player = this.sharedController.getWinningPlayer();
    }

    @Override
    public void restartGame() {
        // TODO Auto-generated method stub
        this.sharedBoard.clearHighlights();
        this.sharedBoard.clearSymbols();
        this.sharedController.playAgain();
        // not working...
        this.sharedController.setControllerMessage("Select a square to start playing");
    }

}

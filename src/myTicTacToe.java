import cs331Helper.cs331TicTacToeBoard;
import cs331Helper.cs331TicTacToeController;
import cs331Helper.cs331TicTacToeGame;
import javafx.scene.paint.Color;

public class myTicTacToe implements cs331TicTacToeGame {

    cs331TicTacToeController sharedController;
    cs331TicTacToeBoard sharedBoard;

    public myTicTacToe() {
        this.sharedBoard = new cs331TicTacToeBoard();
        this.sharedController = new cs331TicTacToeController();
        this.sharedController.setControllerMessage("Select a square to start playing!");
        this.sharedController.addPlayer(new Players("X", this.sharedBoard, this.sharedController));
        this.sharedController.addPlayer(new Players("O", this.sharedBoard, this.sharedController));
    }

    @Override
    public void invalidSquareChosen(int row, int col) {
        // TODO Auto-generated method stub
        sharedBoard.squareAt(row, col).flashColor(Color.BLUE);

    }

    @Override
    public void noWinner() {
        // not working
        this.sharedController.setControllerMessage("it's a tie");
    }

    @Override
    public void playerWins() {
        // TODO Auto-generated method stub
        Players player = (Players) this.sharedController.getWinningPlayer();
        sharedController.setControllerMessage(player.getPlayerSymbol() + " wins!");
    }

    @Override
    public void restartGame() {
        // TODO Auto-generated method stub
        this.sharedBoard.clearHighlights();
        this.sharedBoard.clearSymbols();
        this.sharedController.playAgain();
        this.sharedController.setControllerMessage("Select a square to start playing");
    }

}

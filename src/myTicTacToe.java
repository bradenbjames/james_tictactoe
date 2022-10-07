import cs331Helper.cs331TicTacToeBoard;
import cs331Helper.cs331TicTacToeController;
import cs331Helper.cs331TicTacToeGame;
import javafx.scene.paint.Color;

public class myTicTacToe implements cs331TicTacToeGame {
    cs331TicTacToeController sharedController;
    cs331TicTacToeBoard sharedBoard;

    // initialize game with Players
    public myTicTacToe() {
        this.sharedBoard = new cs331TicTacToeBoard();
        this.sharedController = new cs331TicTacToeController();
        this.sharedController.setControllerMessage("Select a square to start playing!");
        this.sharedController.addPlayer(new Players("X", this.sharedBoard, this.sharedController));
        this.sharedController.addPlayer(new Players("O", this.sharedBoard, this.sharedController));
    }

    @Override
    public void invalidSquareChosen(int row, int col) {
        // flash invalid square selection on board
        sharedBoard.squareAt(row, col).flashColor(Color.BLUE);
    }

    @Override
    public void noWinner() {
        this.sharedController.setControllerMessage("it's a tie");
    }

    @Override
    public void playerWins() {
        // capture reference to winning player, set controller message
        Players player = (Players) this.sharedController.getWinningPlayer();
        sharedController.setControllerMessage(player.getPlayerSymbol() + " wins!");
    }

    @Override
    public void restartGame() {
        // clear board, clear symbols, sets controller message
        this.sharedBoard.clearHighlights();
        this.sharedBoard.clearSymbols();
        this.sharedController.playAgain();
        this.sharedController.setControllerMessage("Select a square to start playing");
    }

}

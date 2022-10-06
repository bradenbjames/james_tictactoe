import cs331Helper.cs331TicTacToeFrame;
import cs331Helper.cs331TicTacToeGame;
import javafx.application.Application;
import javafx.stage.Stage;

public class App1 extends Application {

    public void start(Stage stage) {

        cs331TicTacToeFrame frame = new cs331TicTacToeFrame(stage);
        // Add the game here to the frame
        cs331TicTacToeGame game = new myTicTacToe();
        frame.addGame(game);

        Players p1 = new Players("X");
        Players p2 = new Players("O");

        myTicTacToe my = new myTicTacToe();
        my.sharedController.addPlayer(p1);
        my.sharedController.addPlayer(p2);

        p1.selectSquare(0, 0);
        p2.selectSquare(1, 0);
        p1.selectSquare(1, 1);
        p1.selectSquare(2, 2);

        game.restartGame();

    }

    public static void main(String[] args) throws Exception {
        launch(args);
    }
}

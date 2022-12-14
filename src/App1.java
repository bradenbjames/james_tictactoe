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
    }

    public static void main(String[] args) throws Exception {
        launch(args);
    }
}

import cs331Helper.cs331TicTacToeController;
import cs331Helper.cs331TicTacToeFrame;
import cs331Helper.cs331TicTacToeGame;
import javafx.application.Application;
import javafx.stage.Stage;

public class App1 extends Application {

    public void start(Stage stage) {

        cs331TicTacToeFrame frame = new cs331TicTacToeFrame(stage);
        // Add the game here to the frame
        cs331TicTacToeGame game1 = new myTicTacToe();
        frame.addGame(game1);

        Players p1 = new Players("X");
        Players p2 = new Players("O");

        cs331TicTacToeController controller1 = new cs331TicTacToeController();

        controller1.addPlayer(p1);
        controller1.addPlayer(p2);

        controller1.setControllerMessage("Select a square to start playing");

    }

    public static void main(String[] args) throws Exception {
        launch(args);
    }
}

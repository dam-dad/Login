package dad.login;

import Inicio.LoginController;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		LoginController controller = new LoginController();
		
		
		primaryStage.setTitle("Login");
		Scene scene = new Scene(controller.getView(), 400, 320);
		primaryStage.setScene(scene);
		primaryStage.show();
		
		
	}
	public static void main(String[] args) {
        launch(args);
    }

}

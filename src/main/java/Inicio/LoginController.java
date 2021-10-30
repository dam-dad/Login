package Inicio;

import java.util.Optional;

import dad.login.auth.*;
import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ButtonType;

public class LoginController {
	
	LoginModel model = new LoginModel();
	LoginView view = new LoginView();
	public LoginView getView() {
		return view;
	}
	public LoginModel getModel() {
		return model;
	}
	
	public LoginController(){
		
		view.getUser().textProperty().bindBidirectional(model.userProperty());
		view.getPassword().textProperty().bindBidirectional(model.passwordProperty());
		view.getChk().selectedProperty().bindBidirectional(model.chkProperty());
		
		view.getBtn().setOnAction(e -> onAcederbtn(e));
		view.getBtn2().setOnAction(e -> onAcederbtn2(e));

	}


	private void onAcederbtn(ActionEvent e) {
		AuthService verf = model.isChk() ? new LdapAuthService() : new FileAuthService();
		try {
			if(verf.login(model.getUser(), model.getPassword()) == true) {
				Alert alert = new Alert(AlertType.INFORMATION);
                alert.setTitle("Iniciar sesión");
                alert.setHeaderText("Acceso permitido");
                alert.setContentText("Las credenciales de acceso son válidas");

                alert.showAndWait();
			}else {
				Alert alert = new Alert(AlertType.WARNING);
                alert.setTitle("Iniciar sesión");
                alert.setHeaderText("Acceso denegado");
                alert.setContentText("El usuario y/o contraseña no son válidos\n");

                alert.showAndWait();

			}
		}
		catch (Exception e1) {
            e1.getMessage();
            
		}
	}


	private void onAcederbtn2(ActionEvent e) {
		Alert alert = new Alert(AlertType.CONFIRMATION);
        alert.setTitle("¿Seguro?");
        alert.setHeaderText("Cuidado, vas a salir");
        alert.setContentText("¿Seguro que quieres salir?");

        Optional<ButtonType> result = alert.showAndWait();
        if (result.get() == ButtonType.OK){
            System.exit(0);
        }
	}



}

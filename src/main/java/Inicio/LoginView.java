package Inicio;

import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;

public class LoginView extends GridPane {
	
	private TextField user;
	private PasswordField password;
	private CheckBox chk;
	private Button btn;
	private Button btn2;

	public LoginView() {
		super();
		user = new TextField();
		user.setMaxWidth(150);
		password = new PasswordField();
		chk = new CheckBox("Usar LDAP");
		btn = new Button("Aceder");
		btn2 = new Button("Cancelar");
		btn.setDefaultButton(true);

		
		HBox view = new HBox(5, btn, btn2);
		view.setAlignment(Pos.BASELINE_CENTER);
		view.setPadding(new Insets(5));
		
		
		setPadding(new Insets(5));
		setVgap(5);
		setAlignment(Pos.CENTER);

		addRow(0, new Label("user"), user);
		addRow(1, new Label("password"), password);
		addRow(2, chk);
		addRow(3, view);
		
		ColumnConstraints [] cols = {
                new ColumnConstraints(),
                new ColumnConstraints()
        };
        getColumnConstraints().setAll(cols);
        
        cols[0].setHalignment(HPos.RIGHT);
        cols[0].setHgrow(Priority.ALWAYS);
        cols[0].setFillWidth(false);
        cols[1].setHalignment(HPos.LEFT);
        cols[1].setHgrow(Priority.ALWAYS);
        cols[1].setFillWidth(false);
        setHalignment(chk, HPos.CENTER);
        setHalignment(view, HPos.CENTER);
        setColumnSpan(chk, REMAINING);
        setColumnSpan(view, REMAINING);
        
	}

	public TextField getUser() {
		return user;
	}

	public PasswordField getPassword() {
		return password;
	}

	public CheckBox getChk() {
		return chk;
	}

	public Button getBtn() {
		return btn;
	}

	public Button getBtn2() {
		return btn2;
	}
	

}

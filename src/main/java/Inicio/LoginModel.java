package Inicio;

import javafx.beans.property.BooleanProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class LoginModel {
	
	StringProperty user = new SimpleStringProperty();
	StringProperty password = new SimpleStringProperty();
	BooleanProperty chk = new SimpleBooleanProperty();
	public final StringProperty userProperty() {
		return this.user;
	}
	
	public final String getUser() {
		return this.userProperty().get();
	}
	
	public final void setUser(final String user) {
		this.userProperty().set(user);
	}
	
	public final StringProperty passwordProperty() {
		return this.password;
	}
	
	public final String getPassword() {
		return this.passwordProperty().get();
	}
	
	public final void setPassword(final String password) {
		this.passwordProperty().set(password);
	}
	
	public final BooleanProperty chkProperty() {
		return this.chk;
	}
	
	public final boolean isChk() {
		return this.chkProperty().get();
	}
	
	public final void setChk(final boolean chk) {
		this.chkProperty().set(chk);
	}
	
	

}

package dad.login;

import dad.login.auth.AuthService;
import dad.login.auth.FileAuthService;
import dad.login.auth.LdapAuthService;

public class Main {
	
	public static void main(String[] args) throws Exception {
		
		boolean useLdap = true;
		
		AuthService auth = useLdap ? new LdapAuthService() : new FileAuthService();
		System.out.println("Chuck Norris    : " + auth.login("cnorris", "patada"));
		System.out.println("Charles Bronson : " + auth.login("cbronson", "Metrallet@1"));
		System.out.println("David Carradine : " + auth.login("dcarradine", "kungfu"));
		System.out.println("David Carradine : " + auth.login("dcarradine", "karate"));
		System.out.println("Michael Knight  : " + auth.login("mknight", "kit"));
		
	}

}

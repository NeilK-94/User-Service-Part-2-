package ie.gmit.ds;

import io.dropwizard.Configuration;

//	Define port number

public class UserApiConfig extends Configuration {
	private int passwordServicePort = 50550;

	public int getPasswordServicePort() {
		return passwordServicePort;
	}
}
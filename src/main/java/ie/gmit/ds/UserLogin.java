package ie.gmit.ds;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.xml.bind.annotation.*;

//	Adapted largely from the removed User class. Will be used to login a user, they only have an id and a password.
//	Added XML and JSON annotations as per assigment requirement

@XmlRootElement
public class UserLogin {
	private int userID;
	private String password;

	public UserLogin(int userID, String password) {
		this.userID = userID;
		this.password = password;
	}

	public void setUserID(int userID) {
		this.userID = userID;
	}

	@JsonProperty
	@XmlElement
	public int getUserID() {
		return userID;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@JsonProperty
	@XmlElement
	public String getPassword() {
		return password;
	}
}
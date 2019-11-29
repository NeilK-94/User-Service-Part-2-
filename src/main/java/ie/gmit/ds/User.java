package ie.gmit.ds;

import javax.xml.bind.annotation.XmlElement;
import com.fasterxml.jackson.annotation.JsonProperty;

public class User {

    private int userID;
    private String userName;
    private String email;
    private String hashedPassword;
    private String salt;


    public User() {
        // Needed for Jackson deserialisation
    }

    public User(int userID, String userName, String email, String hashedPassword, String salt) {
        this.userID = userID;
        this.userName = userName;
        this.email = email;
        this.hashedPassword = hashedPassword;
        this.salt = salt;
    }

    @JsonProperty
    @XmlElement 
	public int getUserID() {
		return userID;
	}
    
    public void setUserID(int userID) {
		this.userID = userID;
	}

    @JsonProperty
	@XmlElement
	public String getUserName() {
		return userName;
	}
    
    public void setUserName(String userName) {
		this.userName = userName;
	}

    @JsonProperty
    @XmlElement
	public String getEmail() {
		return email;
	}
    
    public void setEmail(String email) {
		this.email = email;
	}

    @JsonProperty
    @XmlElement
	public String getHashedPassword() {
		return hashedPassword;
	}
    
    public void setHashedPassword(String hashedPassword) {
		this.hashedPassword = hashedPassword;
	}

	@JsonProperty
	@XmlElement 
	public String getSalt() {
		return salt;
	}
	
	public void setSalt(String salt) {
		this.salt = salt;
	}
    
    
}
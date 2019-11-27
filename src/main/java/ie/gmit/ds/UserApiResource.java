package ie.gmit.ds;

import java.util.Collection;
import java.util.HashMap;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/users")
@Produces(MediaType.APPLICATION_JSON)
public class UserApiResource {
	
	private HashMap<Integer, User> usersMap = new HashMap<Integer, User>();

	public UserApiResource() {
		
		User testUser = new User(1, "Neil Kyne", "neil.kyne@gmail.com", "l1br@ry", null);
		
		usersMap.put(testUser.getUserID(), testUser);
	}

	@GET
	public Collection<User> getUsers() {
		
		return usersMap.values();
	}
}

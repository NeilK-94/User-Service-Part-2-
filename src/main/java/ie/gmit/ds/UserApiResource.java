package ie.gmit.ds;

import java.util.Collection;
import java.util.HashMap;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

//	This class will handle the requests to the path '/users'
@Path("/users")
@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML }) // This class produces and consumes XML and JSON data
@Consumes({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
public class UserApiResource {

	GRPCClient grpcClient;
	
	String hashedPassword;
	String salt;

	// Store user details. ID is the key (Integer)
	private HashMap<Integer, User> users = new HashMap<Integer, User>();

	public UserApiResource() {
		User testUser = new User(1, "Neil Kyne", "neil.kyne@gmail.com", "l1br@ry", null);
		users.put(testUser.getUserID(), testUser);
	}

	// GET POST PUT DELETE methods as well as login and get by userId(GET)

	// Method to get all users
	@GET
	public Collection<User> findAll() {
		if (!users.values().isEmpty()) {
			System.out.println("All users retrieved successfully");

			return users.values();
		} else {
			System.out.println("No users found. Please add a user before trying to view a user");

			return users.values();
		}
	}

	// Method to get a user by their id
	@GET
	@Path("/{userId}")
	public User findUserById(@PathParam("userId") int userID) {
		return users.get(userID);
	}

	// Method to delete a user by their id
	@DELETE
	@Path("/{userId}")
	public Collection<User> deleteUser(@PathParam("userId") int userID) {
		users.remove(userID);
		System.out.println("Successfully deleted user: " + userID);

		return users.values();
	}

	// Method to create a new user
	@POST
	public User addUser(User user) {
		grpcClient.userRequest();
		
		//	Made mistakes on part 1 of the project. Can't assign password and salt
		//	hashedPassword = new String(grpcClient.getHashedPassword().toByteArray());
		//	salt = new String(grpcClient.getSalt().toByteArray());

		return users.put(user.getUserID(), user);
	}

	// Method to update a user by their id
	@PUT
	@Path("/{userId}")
	public User updateUser(@PathParam("userId") int userID) {
		return null;

	}

	// Method to login a user
	@POST
	@Path("/login")
	public User loginUser(UserLogin userLogin) {

		return null;
	}

}

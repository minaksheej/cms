package springfive.cms.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import springfive.cms.models.User;
import springfive.cms.request.models.UserRequest;
import springfive.cms.service.UserService;

@RestController
@RequestMapping("/api/user")
public class UserResource {

	@Autowired
	private UserService userService;

	@GetMapping("/{id}")
	public ResponseEntity<User> findOne(@PathVariable("id") String id) {
		return new ResponseEntity<User>(userService.findOne(id), HttpStatus.OK);
	}

	@GetMapping
	public ResponseEntity<List<User>> findAll() {
		return new ResponseEntity<List<User>>(userService.findAll(), HttpStatus.OK);
	}

	@PostMapping
	public ResponseEntity<User> newUser(@RequestBody UserRequest userRequest) {
		return new ResponseEntity<User>(userService.createUser(userRequest), HttpStatus.CREATED);
	}

	@DeleteMapping("/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void removeUser(@PathVariable("id") String id) {
		userService.deleteUser(id);

	}

	@PutMapping("/{id}")
	public ResponseEntity<User> update(@RequestBody UserRequest request, @PathVariable("id") String id) {
		return new ResponseEntity<User>(userService.updateUser(request,id),HttpStatus.OK);
	}
}

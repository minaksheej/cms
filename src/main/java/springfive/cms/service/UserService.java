package springfive.cms.service;

import java.util.List;

import org.springframework.http.HttpStatus;

import springfive.cms.models.User;
import springfive.cms.request.models.UserRequest;

public interface UserService {

	User findOne(String id);

	List<User> findAll();

	User createUser(UserRequest userRequest);

	void deleteUser(String id);

	User updateUser(UserRequest request, String id);

}

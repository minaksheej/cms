package springfive.cms.service;

import java.util.List;

import org.springframework.stereotype.Service;

import springfive.cms.models.User;
import springfive.cms.request.models.UserRequest;

@Service
public class UserServiceImpl  implements UserService{

	@Override
	public User findOne(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User createUser(UserRequest userRequest) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteUser(String id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public User updateUser(UserRequest request, String id) {
		// TODO Auto-generated method stub
		return null;
	}

}

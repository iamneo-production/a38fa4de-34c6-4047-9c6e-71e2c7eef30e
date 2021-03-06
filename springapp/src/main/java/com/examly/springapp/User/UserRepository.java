 
package com.examly.springapp.User;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User,String>{
	public Optional<User> findByEmail(String email);
}

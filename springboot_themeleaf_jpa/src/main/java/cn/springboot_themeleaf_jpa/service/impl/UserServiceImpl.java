package cn.springboot_themeleaf_jpa.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.springboot_themeleaf_jpa.entity.User;
import cn.springboot_themeleaf_jpa.repository.UserRepository;
import cn.springboot_themeleaf_jpa.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserRepository userRepository;

	@Override
	public User saveUser(User user) {
		return userRepository.save(user);
	}

}

package cn.springboot_themeleaf_jpa.service;

import org.springframework.transaction.annotation.Transactional;

import cn.springboot_themeleaf_jpa.entity.User;

public interface UserService {
	@Transactional
	User saveUser(User user);
}

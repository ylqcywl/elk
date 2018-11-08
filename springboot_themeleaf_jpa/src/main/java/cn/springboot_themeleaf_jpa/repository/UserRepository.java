package cn.springboot_themeleaf_jpa.repository;

import org.springframework.data.repository.CrudRepository;

import cn.springboot_themeleaf_jpa.entity.User;

public interface UserRepository extends CrudRepository<User, Integer>{
    
}

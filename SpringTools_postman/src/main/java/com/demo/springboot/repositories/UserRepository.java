package com.demo.springboot.repositories;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.springboot.model.UserModel;

@Repository
public interface UserRepository extends JpaRepository <UserModel,Integer>{

	

}

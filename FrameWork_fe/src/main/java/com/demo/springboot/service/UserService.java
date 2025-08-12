package com.demo.springboot.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.demo.springboot.model.UserModel;

public interface UserService {
	public ResponseEntity<UserModel> addUser(UserModel model);
	public ResponseEntity<List<UserModel>> viewUsers();
	public ResponseEntity<UserModel> updateUser(UserModel model);
	public ResponseEntity<UserModel> updateUser(Integer userId,UserModel model);
	public ResponseEntity<UserModel> deleteUser(Integer userId);
	public ResponseEntity<UserModel> updateUser2(Integer userId, UserModel model);
	public ResponseEntity<UserModel> updateUser3(Integer userId, UserModel model);

}

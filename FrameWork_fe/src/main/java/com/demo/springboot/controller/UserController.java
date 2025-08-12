package com.demo.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.demo.springboot.model.UserModel;
import com.demo.springboot.service.UserService;

import jakarta.websocket.server.PathParam;



@RequestMapping("user")
//baseurl= http://localhost:9090
//updatedurl= http://localhost:9090/user
@RestController
@CrossOrigin(origins="http://localhost:3000/")
public class UserController {
	@Autowired
	private UserService userService;
	
	@PostMapping("add")
	//http://localhost:9090/user/add
	public ResponseEntity<UserModel>addUser(@RequestBody UserModel model){
		return userService.addUser(model);
	}
	@GetMapping("all")
	//http://localhost:9090/user/all
	public ResponseEntity<List<UserModel>> viewUsers(){
		return userService.viewUsers();
	}
	@PutMapping("update")
	//http:localhost:9090/user/update
	public ResponseEntity<UserModel>updateUser(@RequestBody UserModel model){
		return userService.addUser(model);
	}
	
	@PutMapping("update1")
	//http://localhost:9090/user/update1
	public ResponseEntity<UserModel>updateUser1(@RequestParam(value="userid") Integer userId,@RequestBody UserModel model){
		return userService.updateUser(userId,model);
	}
	@PutMapping("update2")
	//http://localhost:9090/user/update2?userId=123
	public ResponseEntity<UserModel>updateUser2(@PathParam(value="userid") Integer userId,@RequestBody UserModel model){
		return userService.updateUser2(userId,model);
	}
	@PutMapping("update3/{userId}")
	//http://localhost:9090/user/update3
	public ResponseEntity<UserModel>updateUser3(@PathVariable Integer userId,@RequestBody UserModel model){
		return userService.updateUser3(userId,model);
	}
	
	@DeleteMapping("delete/{userId}")
	//http://localhost:9090/user/delete
	public ResponseEntity<UserModel>deleteUser(@PathVariable Integer userId){
		return userService.deleteUser(userId);
	}
	

}

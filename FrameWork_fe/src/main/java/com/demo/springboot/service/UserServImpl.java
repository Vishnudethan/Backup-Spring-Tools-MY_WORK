package com.demo.springboot.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.demo.springboot.model.UserModel;
import com.demo.springboot.repositories.UserRepository;

@Service
public class UserServImpl implements UserService {

    
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public ResponseEntity<UserModel> addUser(UserModel model) {
		try {
			return new ResponseEntity<UserModel>(userRepository.save(model),HttpStatus.CREATED);
		}
		catch(Exception e) {
			System.out.println(e);
		}
		return new ResponseEntity<UserModel>(model,HttpStatus.INTERNAL_SERVER_ERROR);
	}

	@Override
	public ResponseEntity<List<UserModel>> viewUsers() {
		try {
			return new ResponseEntity<List<UserModel>>(userRepository.findAll(),HttpStatus.OK);
			
		}
		catch(Exception e) {
			System.out.println(e);
			
		}
		return new ResponseEntity<List<UserModel>>(new ArrayList<UserModel>(),HttpStatus.NOT_FOUND);
	}

	@Override
	public ResponseEntity<UserModel> updateUser(UserModel model) {
		try {
			Optional<UserModel> um=userRepository.findById(model.getUserId());
			if(um.isPresent()) {
				return new ResponseEntity<UserModel>(userRepository.save(model),HttpStatus.OK);
			}
		}
		catch(Exception e) {
			System.out.println(e);
			
		}
		return new ResponseEntity<UserModel>(new UserModel(),HttpStatus.NOT_FOUND);
	}

	@Override
	public ResponseEntity<UserModel> updateUser(Integer userId, UserModel model) {
		try {
			Optional<UserModel> um=userRepository.findById(userId);
			if(um.isPresent()) {
				model.setUserId(userId);
				return new ResponseEntity<UserModel>(userRepository.save(model),HttpStatus.FOUND);
			}
		
		}
		catch(Exception e) {
			System.out.println(e);
			
		}
		
		return new ResponseEntity<UserModel>(model,HttpStatus.NOT_FOUND);
	}

	@Override
	public ResponseEntity<UserModel> deleteUser(Integer userId) {
		try {
			Optional<UserModel> um=userRepository.findById(userId);
			if(um.isPresent()) {
				userRepository.deleteById(userId);
				return new ResponseEntity<UserModel>(um.get(),HttpStatus.ACCEPTED);
			}
		}
		catch(Exception e) {
			System.out.println(e);
			
		}
		return new ResponseEntity<UserModel>(new UserModel(null,null,null,null),HttpStatus.NOT_FOUND) ;
	}
	
//recently changed
	@Override
	public ResponseEntity<UserModel> updateUser2(Integer userId, UserModel model) {
	    try {
	        Optional<UserModel> existing = userRepository.findById(userId);
	        if (existing.isPresent()) {
	            model.setUserId(userId); 
	            return new ResponseEntity<>(userRepository.save(model), HttpStatus.OK);
	        }
	    } catch (Exception e) {
	        System.out.println(e);
	    }
	    return new ResponseEntity<>(new UserModel(), HttpStatus.NOT_FOUND);
	}

	@Override
	public ResponseEntity<UserModel> updateUser3(Integer userId, UserModel model) {
	    try {
	        Optional<UserModel> existing = userRepository.findById(userId);
	        if (existing.isPresent()) {
	            model.setUserId(userId);
	            return new ResponseEntity<>(userRepository.save(model), HttpStatus.OK);
	        }
	    } catch (Exception e) {
	        System.out.println(e);
	    }
	    return new ResponseEntity<>(new UserModel(), HttpStatus.NOT_FOUND);
	}
}

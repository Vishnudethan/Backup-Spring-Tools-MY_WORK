package com.demo.hibernate;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;



@Entity
@Table(name="user_details")
public class UserModel {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="user_id")
	private Integer userId;
	@Column(name="user_name")
	private String userName;
	@Column(name="user_age")
	private Integer userAge;
	@Column(name="user_place")
	private String userPlace;

	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public Integer getUserAge() {
		return userAge;
	}
	public void setUserAge(Integer userAge) {
		this.userAge = userAge;
	}
	public String getUserPlace() {
		return userPlace;
	}
	public void setUserPlace(String userPlace) {
		this.userPlace = userPlace;
	}
	@Override
	public String toString() {
		return "UserModel [userId=" + userId + ", userName=" + userName + ", userAge=" + userAge + ", userPlace="
				+ userPlace + "]";
	}
	public UserModel(Integer userId, String userName, Integer userAge, String userPlace) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userAge = userAge;
		this.userPlace = userPlace;
	}
	public UserModel() {
		
	}
	
}

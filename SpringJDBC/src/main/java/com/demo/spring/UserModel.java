package com.demo.spring;

public class UserModel {
private int Id,Age;
private String Name,Place;
public int getId() {
	return Id;
}
public void setId(int id) {
	Id = id;
}
public int getAge() {
	return Age;
}
public void setAge(int age) {
	Age = age;
}
public String getName() {
	return Name;
}
public void setName(String name) {
	Name = name;
}
public String getPlace() {
	return Place;
}
public void setPlace(String place) {
	Place = place;
}
@Override
public String toString() {
	return "UserModel [Id=" + Id + ", Age=" + Age + ", Name=" + Name + ", Place=" + Place + "]";
}
public UserModel(int id, int age, String name, String place) {
	super();
	Id = id;
	Age = age;
	Name = name;
	Place = place;
}
public UserModel() {
	
}

}

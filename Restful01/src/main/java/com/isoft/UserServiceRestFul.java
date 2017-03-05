package com.isoft;

import java.util.Date;


/**
 * �û�����ʵ����
 * 
 * @author Ickes
 */
public class UserServiceRestFul implements UserService {

	
	public User get(String id) {
		System.out.println("GET������id=" + id);
		User user = new User();
		user.setUserId("get");
		user.setUserName("ickes");
		user.setUserPwd("ices123");
		user.setSex(1);
		user.setSal(32F);
		user.setBirthday(new Date());
		return user;
	}

	
	public User put(String id, User u) {
		System.out.println("PUT������id=" + id + ",users=" + u.toJson());
		User user = new User();
		user.setUserId("put");
		user.setUserName("ickes");
		user.setUserPwd("ices123");
		user.setSex(1);
		user.setSal(32F);
		user.setBirthday(new Date());
		return user;
	}

	
	public User post(String id, User u) {
		System.out.println("POST������id=" + id + ",users=" + u.toJson());
		User user = new User();
		user.setUserId("post");
		user.setUserName("ickes");
		user.setUserPwd("ices123");
		user.setSex(1);
		user.setSal(32F);
		user.setBirthday(new Date());
		return user;
	}

	
	public User delete(String id) {
		System.out.println("DELETE������id=" + id);
		User user = new User();
		user.setUserId("delete");
		user.setUserName("ickes");
		user.setUserPwd("ices123");
		user.setSex(1);
		user.setSal(32F);
		user.setBirthday(new Date());
		return user;
	}
}

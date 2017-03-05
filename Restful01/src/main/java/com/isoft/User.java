package com.isoft;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

import com.google.gson.Gson;


@SuppressWarnings("restriction")
@XmlRootElement(name="UserInfo")  
public class User{  
    private String userId;  
    private String userName;  
    private String userPwd;  
    private Integer sex;  
    private Float sal;  
    private Date birthday;  

    
	public String getUserId() {
		return userId;
	}


	public void setUserId(String userId) {
		this.userId = userId;
	}


	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}


	public String getUserPwd() {
		return userPwd;
	}


	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}


	public Integer getSex() {
		return sex;
	}


	public void setSex(Integer sex) {
		this.sex = sex;
	}


	public Float getSal() {
		return sal;
	}


	public void setSal(Float sal) {
		this.sal = sal;
	}


	public Date getBirthday() {
		return birthday;
	}


	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}


	public String toJson() {  
        Gson gson = new Gson();  
        return gson.toJson(this);  
    }  
}  
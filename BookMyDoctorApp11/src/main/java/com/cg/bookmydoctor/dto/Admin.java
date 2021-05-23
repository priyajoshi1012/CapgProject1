package com.cg.bookmydoctor.dto;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "Admin")
public class Admin {

	@Id
	@Column(name = "adminId")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int adminId;
	
	@Column(name="email")
	private String email;
	
	@Column(name="pwd")
	private String password;
	
	
	public Admin(int adminId, String email, String password) {
		super();
		this.adminId = adminId;
		this.email =  email;
		this.password = password;
	}
	
	public int getAdminId() {
		return adminId;
	}
	public void setAdminId(int adminId) {
		this.adminId = adminId;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Admin [adminId=" + adminId + ", email=" + email + ", password=" + password + "]";
	}

}

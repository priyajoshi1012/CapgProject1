package com.cg.bookmydoctor.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "Patient")
public class Patient implements Serializable {

	
	@Id
	@Column(name = "patientId")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int patientId;
	
	@Column(name="patientName")
	private String patientName;
	
	@Column(name="mobileNo")
	private long mobileNo;
	
	@Column(name="email")
	private String email;
	
	@Column(name="password")
	private String password;
	
	@Column(name="bloodGroup")
	private String bloodGroup;
	
	@Column(name="gender")
	private String gender;
	
	@Column(name="age")
	private int age;
	
	@Column(name="address")
	private String address;
	
	
	public Patient(int patientId, String patientName,long mobileNo,String email, String password,
			String bloodGroup, String gender, int age, String address) {
		super();
		this.patientId = patientId;
		this.patientName =  patientName;
		this.mobileNo = mobileNo;
		this.email = email;
		this.password = password;
		this.bloodGroup =  bloodGroup;
		this.gender = gender;
		this.age = age;
		this.address = address;
	}
	
	

	public int getPatientId() {
		return patientId;
	}
	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}
	public String getPatientName() {
		return patientName;
	}
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}
	public long getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
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
	public String getBloodGroup() {
		return bloodGroup;
	}
	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	

	@Override
	public String toString() {
		return "Patient [patientId=" + patientId + ", patientName=" + patientName + ", mobileNo=" + mobileNo
				+ ", email=" + email + ", password=" + password + ", bloodGroup=" + bloodGroup + ", gender=" + gender
				+ ", age=" + age + ", address=" + address + "]";
	}

}

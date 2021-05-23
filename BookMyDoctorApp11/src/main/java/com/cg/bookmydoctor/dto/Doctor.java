package com.cg.bookmydoctor.dto;

import javax.persistence.Entity;
import javax.persistence.Table;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Doctor")
public class Doctor {

	@Id
	@Column(name = "doctorId")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int doctorId;
	
	@Column(name="doctorName")
	private String doctorName;
	
	@Column(name="speciality")
	private String speciality;
	
	@Column(name="location")
	private String location;
	
	@Column(name="hospitalName")
	private String hospitalName;
	
	@Column(name="mobileNo")
	private long mobileNo;
	
	@Column(name="email")
	private String email;
	
	@Column(name="password")
	private String password;
	
	@Column(name="chargesPerVisit")
	private double chargesPerVisit;
	
	public Doctor(int doctorId, String doctorName, String speciality, String location, String hospitalName,
			long mobileNo, String email, String password, double chargesPerVisit) {
		super();
		this.doctorId = doctorId;
		this.doctorName = doctorName;
		this.speciality = speciality;
		this.location=location;
		this.hospitalName = hospitalName;
		this.mobileNo = mobileNo;
		this.email =  email;
		this.password = password;
		this.chargesPerVisit = chargesPerVisit;
	}
	
	public int getDoctorId() {
		return doctorId;
	}
	public void setDoctorId(int doctorId) {
		this.doctorId = doctorId;
	}
	public String getDoctorName() {
		return doctorName;
	}
	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}
	public String getSpeciality() {
		return speciality;
	}
	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getHospitalName() {
		return hospitalName;
	}
	public void setHospitalName(String hospitalName) {
		this.hospitalName = hospitalName;
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
	public double getChargesPerVisit() {
		return chargesPerVisit;
	}
	public void setChargesPerVisit(double chargesPerVisit) {
		this.chargesPerVisit = chargesPerVisit;
	}

	@Override
	public String toString() {
		return "Doctor [doctorId=" + doctorId + ", doctorName=" + doctorName + ", speciality=" + speciality
				+ ", location=" + location + ", hospitalName=" + hospitalName + ", mobileNo=" + mobileNo + ", email="
				+ email + ", password=" + password + ", chargesPerVisit=" + chargesPerVisit + "]";
	}
	
	
}

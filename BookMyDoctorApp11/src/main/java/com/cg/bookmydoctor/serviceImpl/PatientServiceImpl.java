package com.cg.bookmydoctor.serviceImpl;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List; 
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.bookmydoctor.dto.*;
import com.cg.bookmydoctor.exception.PatientException;
import com.cg.bookmydoctor.service.IPatientService;
import com.cg.bookmydoctor.repository.IPatientRepository;

@Service
public class PatientServiceImpl implements IPatientService {
	@Autowired
	private IPatientRepository ipr;
	
	Appointment a;
	
	@Override
	public Patient addPatient(Patient bean) {
		if(bean == null) {
			throw new PatientException("This field cannot be NULL");
		}
		return ipr.save(bean);
	}
	
	@Override
	public Patient editPatientProfile(Patient bean) {
		Optional<Patient> patientDb = this.ipr.findById(bean.getPatientId());
		if(patientDb.isPresent()) {
			Patient existingPatient = patientDb.get();	
			
			existingPatient.setAddress(bean.getAddress());
			existingPatient.setEmail(bean.getEmail());
			existingPatient.setPassword(bean.getPassword());
			existingPatient.setAge(bean.getAge());
			existingPatient.setBloodGroup(bean.getBloodGroup());
			existingPatient.setGender(bean.getGender());
			existingPatient.setMobileNo(bean.getMobileNo());
			existingPatient.setPatientName(bean.getPatientName());
			
			return ipr.save(existingPatient);
		}
		else {
			throw new PatientException("Record not found with id : " + bean.getPatientId());
		}
	}
		
	@Override
	public Patient removePatientDetails(Patient bean) {
		if(bean == null) {
			throw new PatientException("This field cannot be NULL");
		}
		Patient pr = bean;
		ipr.deleteById(bean.getPatientId());
		return pr;
	}
	
	@Override
	public Patient getPatient(Patient patient) {
		Optional<Patient> patientDb = this.ipr.findById(patient.getPatientId());
		if(patientDb.isPresent()) {
			return patientDb.get();
		}
		else {
			throw new PatientException("Record not found with id : " + patient.getPatientId());
		}
	}
	
	@Override
	public List<Patient> getAllPatient(){
		return ipr.findAll();
	}
	
	@Override
	public List<Patient> getPatientListByDoctor(Doctor doctor){
		List<Patient> pat = new ArrayList<>();
		if(a.getDoctor() == doctor) {
			pat.add(a.getPatient());
		}
		return pat;
	}
	
	@Override
	public List<Patient> getPatientListByDate(LocalDate appdate){
		List<Patient> p1 = new ArrayList<>();
		LocalDate localDate = a.getAppointmentDate().toLocalDate();
		if(localDate == appdate) {
			p1.add(a.getPatient());
		}
		return p1;
	}
}

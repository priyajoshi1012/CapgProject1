package com.cg.bookmydoctor.serviceImpl;



import java.util.List; 
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.bookmydoctor.dao.IDoctorDao;
import com.cg.bookmydoctor.daoImpl.DoctorDaoImpl;
import com.cg.bookmydoctor.dto.*;
import com.cg.bookmydoctor.exception.DoctorException;
import com.cg.bookmydoctor.service.IDoctorService;

@Service
public class DoctorServiceImpl implements IDoctorService {
	@Autowired
	DoctorDaoImpl docimpl;

	
	@Override
	public List<Doctor> getDoctorList() {
		
		return docimpl.getDoctorList();
	}
	
	
	@Override
	public List<Doctor> getDoctorList(String speciality) {

		return  docimpl.getDoctorList(speciality);
	}
	
	
	@Override
	public Doctor addDoctor(Doctor bean) {
		// TODO Auto-generated method stub
		
		if (bean == null) {
            throw new DoctorException("The passed object cannot be null.");
        }
		return docimpl.addDoctor(bean);
		
	}
	
	
	@Override
	public Doctor updateDoctorProfile(Doctor bean) {
		// TODO Auto-generated method stub
		if ( bean == null) {
            throw new DoctorException("The passed object cannot be null.");
        }
		
		return docimpl.updateDoctorProfile(bean);
	}
	
	
	@Override
	public boolean addAvailability(AvailabilityDates bean) {
		// TODO Auto-generated method stub
		if(docimpl.addAvailability(bean)) {
			return true;
		}
		return false;
	}
	
	
	@Override
	public boolean updateAvailability(AvailabilityDates bean) {
		// TODO Auto-generated method stub
		if(docimpl.updateAvailability(bean)) { 
			return true;
		}
		return false;
	}
	
	
	@Override
	public Doctor getDoctor(Doctor doc) {
		// TODO Auto-generated method stub
		if (doc == null) {
            throw new DoctorException("The passed object cannot be null.");
        }
        return docimpl.getDoctor(doc);
		
	}
	
	
	@Override
	public Doctor removeDoctor(Doctor doc) {
		if (doc == null) {
            throw new DoctorException("The passed object cannot be null.");
        }
        return docimpl.removeDoctor(doc);
	}


}



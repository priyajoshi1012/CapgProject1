package com.cg.bookmydoctor.daoImpl;



import java.util.ArrayList; 
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import com.cg.bookmydoctor.dao.IDoctorDao;
import com.cg.bookmydoctor.dto.AvailabilityDates;
import com.cg.bookmydoctor.dto.Doctor;
import com.cg.bookmydoctor.repository.DoctorRepository;

public abstract class DoctorDaoImpl implements IDoctorDao{

	private static final Logger logger = LoggerFactory.getLogger(DoctorDaoImpl.class);

	@Autowired
	private DoctorRepository docrep;

	public DoctorDaoImpl() {  	 }


	public List<Doctor> getDoctorList(String speciality) {

		try {
			return docrep.findBySpeciality(speciality);
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
		}
		return null;
	}

	public List<Doctor> getDoctorList() {
		try {
			List<Doctor> list = new ArrayList<>();
			List<Doctor> result = docrep.findAll();
			for (Doctor dr : result) {
				list.addAll(result);
			}
			return list;
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
		}
		return null;
	}

	public Doctor removeDoctor(Doctor doc) {
		try {
			docrep.delete(doc);
			return doc;
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
		}
		return null;
	}

	public Doctor getDoctor(Doctor doc) {
		try {
			return docrep.getDr(doc);
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
		}
		return null;
	}

	public Doctor updateDoctorProfile(Doctor bean) {
		try {
			docrep.save(bean);
			return docrep.getDr(bean);
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
		}
		return null;
	}

	public Doctor addDoctor(Doctor dr) {
		try {
			docrep.save(dr);
			return docrep.getDr(dr);
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
		}
		return null;
	}

	public boolean addAvailability(AvailabilityDates bean) {
		//Date d1, d2;
		try {
			docrep.saveDates(bean);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}		
		return false;
	} 
	
	public boolean updateAvailability(AvailabilityDates bean) {
		try {
			docrep.saveDates(bean);
			return true;
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
		}
		return false;
	}


	
	@Override
	public List<Doctor> findAllById(Iterable<Long> ids) {
		// TODO Auto-generated method stub
		return null;
	}


	
}

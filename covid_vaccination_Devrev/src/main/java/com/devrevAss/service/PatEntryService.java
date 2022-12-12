package com.devrevAss.service;

import java.util.List;
import java.util.Optional;

import com.devrevAss.model.PatientEntry;


public interface PatEntryService {
	public String savePatDetail(PatientEntry pat);
	public void delPatDetail();
	List<PatientEntry> getAllPatient_detail();
	
	PatientEntry updatePatDet(PatientEntry user, long pat_id);
	PatientEntry findPatient(PatientEntry user);
    Optional<PatientEntry> checkUser(String email,String password);
    String updateflag(long pat_id,int status);

	

}

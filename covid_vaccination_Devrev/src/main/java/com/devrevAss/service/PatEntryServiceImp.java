package com.devrevAss.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devrevAss.model.PatientEntry;
import com.devrevAss.repository.PatientEntryRepository;

@Service
public class PatEntryServiceImp implements PatEntryService {
	@Autowired
	PatientEntryRepository patrep;
	
	PatEntryServiceImp(PatientEntryRepository patrep){
		this.patrep=patrep;
	}
	
	
	
	@Override
	public String savePatDetail(PatientEntry pat) {
		patrep.save(pat);
		return "Done";
	}

	@Override
	public void delPatDetail() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<PatientEntry> getAllPatient_detail() {
		// TODO Auto-generated method stub
		return patrep.findAll();
	}

	@Override
	public PatientEntry updatePatDet(PatientEntry user, long pat_id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PatientEntry findPatient(PatientEntry user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<PatientEntry> checkUser(String email, String password) {
		// TODO Auto-generated method stub
		Optional<PatientEntry> op =patrep.findByEmailAndPassword(email, password);
		if(op.isPresent()) {
//			updateflag(user.get().getId(),"");
			return op;
		}
		return null;
	}

	@Override
	public String updateflag(long pat_id, int status) {
		// TODO Auto-generated method stub
		return null;
	}

}

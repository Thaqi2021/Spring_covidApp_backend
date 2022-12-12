package com.devrevAss.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devrevAss.model.VacCenters;
import com.devrevAss.repository.VacCenterRepository;

@Service
public class VacCenterServiceImp implements VacCenterService {

	@Autowired
	VacCenterRepository vacrep;
	
	public VacCenterServiceImp(VacCenterRepository vacrep) {
		this.vacrep=vacrep;
	}
	
	@Override
	public String saveCenterDetail(VacCenters vac) {
		vacrep.save(vac);
		return "done";
	}

	@Override
	public void delCenterDetail(int centerId) {
		// TODO Auto-generated method stub
		vacrep.deleteById(centerId);
		
	}

	@Override
	public VacCenters updateCenterDet(VacCenters center, long center_id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<VacCenters> getAllCenter_detail() {
		// TODO Auto-generated method stub
		return vacrep.findAll();
	}

	@Override
	public Optional<VacCenters> checkUser(String admin_email, String admin_password) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String updateflag(int center_id, int login_sts) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String updateActiveSts(int center_id, int active) {
		// TODO Auto-generated method stub
		return null;
	}

}

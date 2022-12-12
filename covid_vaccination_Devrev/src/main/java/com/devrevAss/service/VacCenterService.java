package com.devrevAss.service;

import java.util.List;
import java.util.Optional;

import com.devrevAss.model.VacCenters;

public interface VacCenterService {
	public String saveCenterDetail(VacCenters vac);
	public void delCenterDetail(int centerId);
	VacCenters updateCenterDet(VacCenters center, long center_id);

	List<VacCenters> getAllCenter_detail();
    Optional<VacCenters> checkUser(String admin_email,String admin_password);
    String updateflag(int center_id,int login_sts);
    String updateActiveSts(int center_id,int active);


}

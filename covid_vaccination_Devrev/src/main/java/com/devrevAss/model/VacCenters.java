package com.devrevAss.model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@jakarta.persistence.Entity
public class VacCenters {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int center_id;
	
	private String admin_name;
	private String admin_role;
	private String admin_email;
	private String admin_pass;
	private long contact_num;
	private int active;
	private String flat_name;
	private String center_address;
	private String center_city;
	private String center_state;
	private String center_country;
	private int center_pincode;
	private int login_sts;
	
	public int getCenter_id() {
		return center_id;
	}
	public void setCenter_id(int center_id) {
		this.center_id = center_id;
	}
	public String getAdmin_name() {
		return admin_name;
	}
	public void setAdmin_name(String admin_name) {
		this.admin_name = admin_name;
	}
	public String getAdmin_role() {
		return admin_role;
	}
	public void setAdmin_role(String admin_role) {
		this.admin_role = admin_role;
	}
	public String getAdmin_email() {
		return admin_email;
	}
	public void setAdmin_email(String admin_email) {
		this.admin_email = admin_email;
	}
	public String getAdmin_pass() {
		return admin_pass;
	}
	public void setAdmin_pass(String admin_pass) {
		this.admin_pass = admin_pass;
	}
	public long getContact_num() {
		return contact_num;
	}
	public void setContact_num(long contact_num) {
		this.contact_num = contact_num;
	}
	public int getActive() {
		return active;
	}
	public void setActive(int active) {
		this.active = active;
	}
	public String getFlat_name() {
		return flat_name;
	}
	public void setFlat_name(String flat_name) {
		this.flat_name = flat_name;
	}
	public String getCenter_address() {
		return center_address;
	}
	public void setCenter_address(String center_address) {
		this.center_address = center_address;
	}
	public String getCenter_city() {
		return center_city;
	}
	public void setCenter_city(String center_city) {
		this.center_city = center_city;
	}
	public String getCenter_state() {
		return center_state;
	}
	public void setCenter_state(String center_state) {
		this.center_state = center_state;
	}
	public String getCenter_country() {
		return center_country;
	}
	public void setCenter_country(String center_country) {
		this.center_country = center_country;
	}
	public int getCenter_pincode() {
		return center_pincode;
	}
	public void setCenter_pincode(int center_pincode) {
		this.center_pincode = center_pincode;
	}
	public int getLogin_sts() {
		return login_sts;
	}
	public void setLogin_sts(int login_sts) {
		this.login_sts = login_sts;
	}
}

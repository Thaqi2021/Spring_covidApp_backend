package com.devrevAss.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


import com.devrevAss.model.PatientEntry;

@Repository
public interface PatientEntryRepository extends JpaRepository<PatientEntry,Long> {
	@Query(value = "SELECT a FROM PatientEntry a WHERE a.email=?1 AND a.password = ?2")
	 Optional<PatientEntry> findByEmailAndPassword(String email , String password);
	 
	 @Query(value = "SELECT a FROM PatientEntry a WHERE a.mob_num=?1 ")
	 Optional<PatientEntry> findByMobNo(long mobileNumber);

}

package com.devrevAss.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.devrevAss.model.VacCenters;

@Repository
public interface VacCenterRepository extends JpaRepository<VacCenters,Integer> {

}

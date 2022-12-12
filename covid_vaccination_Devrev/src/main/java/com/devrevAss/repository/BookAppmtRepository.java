package com.devrevAss.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.devrevAss.model.BookAppointmt;

@Repository
public interface BookAppmtRepository extends JpaRepository<BookAppointmt,Integer> {
	
	 @Query(value = "SELECT a FROM BookAppointmt a WHERE a.mob_nmb=?1 ")
	 Optional<BookAppointmt> findByMobNo(long mobileNumber);
	 
	 @Query(value = "SELECT a FROM BookAppointmt a WHERE a.center_idb=?1 and a.date=?2")
	 List<BookAppointmt> getByCid(int center_idb ,String date);
	 
	 @Query(value = "SELECT a FROM BookAppointmt a WHERE a.pat_idb=?1 ")
	 List<BookAppointmt> getSlotById(long pat_id);
}

package com.devrevAss.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.devrevAss.model.BookAppointmt;
import com.devrevAss.model.PatientEntry;
import com.devrevAss.service.BookApptmtServiceImpl;
import com.devrevAss.service.PatEntryServiceImp;


@RestController
@CrossOrigin(origins ="http://localhost:4200")
public class PatientsController {

	@Autowired
	PatEntryServiceImp patser;
	
	@Autowired
	BookApptmtServiceImpl bookser;
	
	@GetMapping("/getPatientsDetail")
    public List<PatientEntry> getproducts() {
		System.out.println("im list of product");
        return (List<PatientEntry>) patser.getAllPatient_detail();
    }
	
		@PostMapping("/signUp")
	    public ResponseEntity<?> NewUser(@RequestBody PatientEntry user) {
	    	System.out.println("i m register in server");
	    	String a=patser.savePatDetail(user);
	    	System.out.println(a+"................");
	    	if(a.equals(null)) {
	    		return (ResponseEntity<?>) ResponseEntity.internalServerError();
	    	}
	    	else {
	    		
	    		return ResponseEntity.ok(user);
	    	}
	    }
	 	@PostMapping("/login")
	    public ResponseEntity<?> loginUser(@RequestBody PatientEntry user) {
	    	System.out.println("i m login in server"+user.getEmail());
	    	Optional<PatientEntry> a=patser.checkUser(user.getEmail(),user.getPassword());
	    	System.out.println(a.get().getPat_id()+"+++");
	    	if(a.isEmpty()) {
	    		return (ResponseEntity<?>) ResponseEntity.internalServerError();
	    	}
	    	else {    		
	    		return ResponseEntity.ok(a.get());
	    	}
	    }
	 		
	 	@PostMapping("/checkAppointment")
	 	 public ResponseEntity<?> CheckForApt(@RequestBody int center_idb,@RequestBody String date) {
		    	System.out.println("im checking ");
		    	int cnt = bookser.checkAvail(date, center_idb);
		    	if(cnt==1) {
		    		return ResponseEntity.ok(1);
		    	}
		    	else {    		
		    		return (ResponseEntity<?>) ResponseEntity.internalServerError();

		    	}
		    }
	 	@PostMapping("/book")
	    public ResponseEntity<?> Bookappointment(@RequestBody BookAppointmt book) {
	 		int a =bookser.bookappmt(book);
	    	if(a==1) {
	    		return ResponseEntity.ok(1);
	    	}
	    	else {
	    		return (ResponseEntity<?>) ResponseEntity.internalServerError();
	    	}
	    }
	 	
	 	 @GetMapping(value= "/getslot-{userId}")
		 public ResponseEntity<?> GetSlotList(@PathVariable("userId") int pat_id) {
	 			System.out.println(pat_id);

	 		List<BookAppointmt> a =bookser.getslotById(pat_id);
	 			System.out.println(a);
	    		return ResponseEntity.ok(a);
	    	
	 	 }
	 	 
	 	@PostMapping("/cancelapt")
	    public ResponseEntity<?> removeCenter(@RequestBody int id) {
	    	System.out.println("im deleting in appointment");
	    	bookser.deleteApt(id);
	    	return ResponseEntity.ok("Done");
	    	
		}
	 	
}

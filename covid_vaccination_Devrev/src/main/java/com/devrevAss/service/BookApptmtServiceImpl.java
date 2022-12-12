package com.devrevAss.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devrevAss.model.BookAppointmt;
import com.devrevAss.repository.BookAppmtRepository;

@Service
public class BookApptmtServiceImpl implements BookAppmtService {
	
	@Autowired
	BookAppmtRepository bookrep;
	
	BookApptmtServiceImpl(BookAppmtRepository bookrep){
		this.bookrep=bookrep;
	}


	@Override
	public int checkAvail(String date, int center_id) {
		// TODO Auto-generated method stub
		List<BookAppointmt> a =bookrep.getByCid(center_id, date);
		if(a.size()<10) {
			return 1;
		}else {
		return 0;
		}
	}


	@Override
	public int bookappmt(BookAppointmt book) {
		String d[]=book.getDate().split("T");
		book.setDate(d[0]);
		// TODO Auto-generated method stub
		bookrep.save(book);
		return 1;
	}


	@Override
	public List<BookAppointmt> getslotById(long pat_id) {
		// TODO Auto-generated method stub
		List<BookAppointmt> a =bookrep.getSlotById(pat_id);
		return a;
	}


	@Override
	public void deleteApt(int id) {
		// TODO Auto-generated method stub
		bookrep.deleteById(id);
		
	}

}

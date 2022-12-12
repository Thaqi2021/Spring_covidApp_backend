package com.devrevAss.service;

import java.util.List;

import com.devrevAss.model.BookAppointmt;

public interface BookAppmtService {
	public int bookappmt(BookAppointmt book);
	public int checkAvail(String date,int center_id);
	public List<BookAppointmt> getslotById(long pat_id);
	public void deleteApt(int id);
}

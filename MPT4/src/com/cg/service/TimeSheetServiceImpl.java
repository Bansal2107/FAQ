package com.cg.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.dao.ITimeSheetDAO;
import com.cg.entities.TimeSheet;

@Service
public class TimeSheetServiceImpl implements ITimeSheetService {

	@Autowired
	ITimeSheetDAO timeSheetDAO;
	
	@Override
	public void addTimeSheet(TimeSheet timeSheet) {
	timeSheetDAO.addTimeSheet(timeSheet);

	}

	@Override
	public List<TimeSheet> getTimeSheetById(String id) {
		
		return timeSheetDAO.getTimeSheetById(id);
	}

}

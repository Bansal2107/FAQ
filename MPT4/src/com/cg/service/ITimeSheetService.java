package com.cg.service;

import java.util.List;

import com.cg.entities.TimeSheet;

public interface ITimeSheetService {
	
	public void addTimeSheet(TimeSheet timeSheet);
	public List<TimeSheet> getTimeSheetById(String id);

}

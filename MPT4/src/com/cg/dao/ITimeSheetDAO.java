package com.cg.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.cg.entities.TimeSheet;


public interface ITimeSheetDAO {
	
	public void addTimeSheet(TimeSheet timeSheet);
	public List<TimeSheet> getTimeSheetById(String id);

}

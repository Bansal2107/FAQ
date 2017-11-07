package com.cg.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.cg.entities.TimeSheet;

@Repository
@Transactional
public class TimeSheetDAOImpl implements ITimeSheetDAO {

	@PersistenceContext
	EntityManager entityManager;
	
	@Override
	public void addTimeSheet(TimeSheet timeSheet) {
		entityManager.persist(timeSheet);
		//entityManager.pe

	}

	@Override
	public List<TimeSheet> getTimeSheetById(String id) {
		TypedQuery<TimeSheet> query=entityManager.createQuery("Select timeSheet from TimeSheet timeSheet where timeSheet.empId=:empid", TimeSheet.class);
		//Query query=entityManager.createNativeQuery("Select timeSheet from TimeSheet timeSheet where timeSheet.empId=:empid", TimeSheet.class);
		query.setParameter("empid", id);
		List<TimeSheet> empList=query.getResultList();
		return empList;
	}

}

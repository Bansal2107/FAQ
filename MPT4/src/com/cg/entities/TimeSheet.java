package com.cg.entities;



import java.util.Date;

import javax.enterprise.inject.Default;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Future;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;
import javax.ws.rs.DefaultValue;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="timesheet")
public class TimeSheet {
	

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="timesheet_id")
	int timesheetId;

	@Column(name="emp_id")
	@NotEmpty(message="Employee ID is required")
	@Pattern(regexp="[A-Z]{3}[0-9]{5}",message="Must be of Pattern: MGR00101")
	String empId;
	
	@Column(name="timesheet_date")
	@DateTimeFormat(pattern="dd-MM-yyyy")
	@NotNull @Past
	Date timesheetDate;
	
	@NotEmpty(message="Hour detail is required")
	@Column(name="hour1")
	String hour1;
	
	@Column(name="hour2")
	@NotEmpty(message="Hour detail is required")
	String hour2;
	
	@Column(name="hour3")
	@NotEmpty(message="Hour detail is required")
	String hour3;
	
	@Column(name="hour4")
	@NotEmpty(message="Hour detail is required")
	String hour4;
	
	@Column(name="hour5")
	@NotEmpty(message="Hour detail is required")
	String hour5;
	
	@Column(name="hour6")
	@NotEmpty(message="Hour detail is required")
	String hour6;
	
	@Column(name="hour7")
	@NotEmpty(message="Hour detail is required")
	String hour7;
	
	@Column(name="hour8")
	@NotEmpty(message="Hour detail is required")
	String hour8;

	public int getTimesheetId() {
		return timesheetId;
	}

	public void setTimesheetId(int timesheetId) {
		this.timesheetId = timesheetId;
	}

	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public Date getTimesheetDate() {
		return timesheetDate;
	}

	public void setTimesheetDate(Date timesheetDate) {
		this.timesheetDate = timesheetDate;
	}

	public String getHour1() {
		return hour1;
	}

	public void setHour1(String hour1) {
		this.hour1 = hour1;
	}

	public String getHour2() {
		return hour2;
	}

	public void setHour2(String hour2) {
		this.hour2 = hour2;
	}

	public String getHour3() {
		return hour3;
	}

	public void setHour3(String hour3) {
		this.hour3 = hour3;
	}

	public String getHour4() {
		return hour4;
	}

	public void setHour4(String hour4) {
		this.hour4 = hour4;
	}

	public String getHour5() {
		return hour5;
	}

	public void setHour5(String hour5) {
		this.hour5 = hour5;
	}

	public String getHour6() {
		return hour6;
	}

	public void setHour6(String hour6) {
		this.hour6 = hour6;
	}

	public String getHour7() {
		return hour7;
	}

	public void setHour7(String hour7) {
		this.hour7 = hour7;
	}

	public String getHour8() {
		return hour8;
	}

	public void setHour8(String hour8) {
		this.hour8 = hour8;
	}
	
	
	
	
}
	

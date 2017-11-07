package com.cg.controller;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.cg.entities.TimeSheet;
import com.cg.service.ITimeSheetService;

@Controller
public class TimeSheetController {




	@Autowired
	ITimeSheetService timeSheetService;

	List<String> hourList=null;


	@RequestMapping("/showPortal.obj")
	public String Home()
	{
		return "../../Home";
	}
	
	@RequestMapping("/enterTimeSheet.htm")
	public String enterTimeSheet(Model model)
	{


		hourList =new ArrayList<String>();

		hourList.add("DATA_ENTRY");
		hourList.add("ACCOUNTS_TALLY");
		hourList.add("LEDGER_POSTINGS");
		hourList.add("BALANCE_SHEET");
		hourList.add("RETURNS_FILING");


		LocalDate ld=LocalDate.now();

		Date date=new Date(ld.getYear()-1900, ld.getMonthValue()-1, ld.getDayOfMonth());
		TimeSheet timeSheet=new TimeSheet();
		timeSheet.setTimesheetDate(date);
		model.addAttribute("hourList",hourList);

		model.addAttribute("timeSheet", timeSheet);
		return "entertimesheet";
	}


	@RequestMapping(value="/addTimeSheet.htm",method=RequestMethod.POST)
	public String addTimeSheet(Model model,@ModelAttribute("timeSheet") @Valid TimeSheet timeSheet,BindingResult result)
	{
		if(result.hasErrors())
		{
			model.addAttribute("hourList",hourList);
			return "entertimesheet";
		}
		else
		{
			timeSheetService.addTimeSheet(timeSheet);
			model.addAttribute("timeSheet", timeSheet);
			return "addtimesheet";
		}
	}
	
	@RequestMapping("/showListTimeSheets.htm")
	public String showListTimeSheets(Model model)
	{
	
		model.addAttribute("message", "K");
		return "listtimesheets";
	}
	
	@RequestMapping("/listTimeSheets.htm")
	public String listTimeSheets(Model model,@RequestParam("id") String id)
	{
		List<TimeSheet> empList=timeSheetService.getTimeSheetById(id);
		String message;
		if(empList.isEmpty())
		{
			message="N";
		}
		else
			message="Y";
	
		model.addAttribute("message", message);
		model.addAttribute("empList", empList);
		return "listtimesheets";
	}
}

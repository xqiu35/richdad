package com.gusty.richdad.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gusty.richdad.entity.Budget;
import com.gusty.richdad.entity.Category;
import com.gusty.richdad.entity.Expense;
import com.gusty.richdad.service.BudgetService;
import com.gusty.richdad.service.CategoryService;
import com.gusty.richdad.service.ExpenseService;

@RestController
@RequestMapping("/")
public class RichDadController {

	@Autowired
	private CategoryService categoryService;
	
	@Autowired
	private ExpenseService expenseService;
	
	@Autowired
	private BudgetService budgetService;
	
	
	@GetMapping("/test")
	public String test()
	{
		boolean testResult = false;
		testResult = categoryTest() && expenseTest() && budgetTest();
		return testResult? "Test pass" : "Test Failed";
	}
	
	@GetMapping("/health")
	public String health()
	{
		return "Rich dad is alive";
	}
	
	private boolean budgetTest()
	{
		try {
			budgetService.save(new Budget("test", 50.6));
			budgetService.deleteAll();
			return true;
		}
		catch (Exception e){
			System.out.println(e.toString());
			return false;
		}
	}
	
	private boolean expenseTest()
	{
		try {
			expenseService.save(new Expense(1, 1));
			expenseService.deleteAll();
			return true;
		}
		catch (Exception e){
			System.out.println(e.toString());
			return false;
		}
	}
	
	private boolean categoryTest()
	{
		try {
			categoryService.save(new Category("test"));
			categoryService.deleteAll();
			return true;
		}
		catch (Exception e){
			System.out.println(e.toString());
			return false;
		}
	}
}

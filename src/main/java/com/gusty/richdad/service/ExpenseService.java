package com.gusty.richdad.service;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.gusty.richdad.entity.Expense;

public interface ExpenseService extends CrudRepository<Expense, Long>{
	public List<Expense> findAll();
	public Expense save(Expense expense);
	public void deleteAll();
	public void delete(Expense expense);
}

package com.gusty.richdad.service;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.gusty.richdad.entity.Budget;

public interface BudgetService extends CrudRepository<Budget, Integer>{
	public List<Budget> findAll();
	public Budget save(Budget budget);
	public void deleteAll();
	public void delete(Budget budget);
}

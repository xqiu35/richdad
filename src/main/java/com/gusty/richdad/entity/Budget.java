package com.gusty.richdad.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import lombok.Data;
import lombok.ToString;

@Entity
@Data
@Table(name="budget")
@ToString
public class Budget implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -2561949573603335476L;

	@Id
	@NotNull
	@Column(name="budget_id")
	private int budgetId;
	
	@NotNull
	@Column(name="budget_name")
	private String budgetName;
	
	@NotNull
	@Column(name="budget")
	private double budget;
	
	@NotNull
	@Column(name="used")
	private double used;
	
	public Budget()
	{
		
	}
	
	public Budget(String budgetName, double budget)
	{
		this.budgetName = budgetName;
		this.budget = budget;
		this.used = 0;
	}
}

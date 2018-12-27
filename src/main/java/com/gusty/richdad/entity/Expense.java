package com.gusty.richdad.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;
import lombok.ToString;

@Entity
@Table(name="expense")
@Data
@ToString
public class Expense implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -4029183360813774076L;

	@Id
	@NotNull
	@Column(name="expense_id")
	private long expenseId;
	
	@NotNull
	@Column(name="category_id")
	private int categoryId;
	
	@NotNull
	@Column(name="budget_id")
	private int budgetId;
	
	@NotNull
	@Column(name="expense")
	private double expense;
	
	@NotNull
	@DateTimeFormat(pattern = "MM/dd/yyyy")
	@Temporal(TemporalType.DATE)
	@Column(name="date")
	private Date date;
	
	public Expense()
	{
		
	}
	
	public Expense(int categoryId, int budget_id)
	{
		this.categoryId = categoryId;
		this.budgetId = budget_id;
		this.expense = 0;
		this.date = new Date();
	}
}

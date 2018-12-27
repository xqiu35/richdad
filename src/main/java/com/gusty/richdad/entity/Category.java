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
@Table(name="category")
@Data
@ToString
public class Category implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 2307344260568519384L;

	@Id
	@NotNull
	@Column(name="category_id")
	private int categoryId;
	
	@NotNull
	@Column(name="category_name")
	private String categoryName;
	
	public Category() {
		
	}
	
	public Category(String categoryName)
	{
		this.categoryName = categoryName;
	}
	
}

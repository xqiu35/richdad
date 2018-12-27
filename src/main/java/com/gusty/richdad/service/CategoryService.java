package com.gusty.richdad.service;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.gusty.richdad.entity.Category;


@Service
public interface CategoryService extends CrudRepository<Category, Integer>{

	public List<Category> findAll();
	public Category save(Category category);
	public void deleteAll();
	public void delete(Category category);
}

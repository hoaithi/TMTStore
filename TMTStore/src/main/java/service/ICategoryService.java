package service;

import java.util.List;

import entities.CategoryEntity;

public interface ICategoryService {
	int count();

	List<CategoryEntity> findAll();

	CategoryEntity findById(int categoryId);

	void delete(int categoryId);

	void update(CategoryEntity categoryEntity);

	void insert(CategoryEntity categoryEntity);

}

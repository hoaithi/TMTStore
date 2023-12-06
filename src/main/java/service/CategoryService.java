package service;

import java.util.List;

import dao.CategoryDAO;
import dao.ICategoryDAO;
import entities.CategoryEntity;

public class CategoryService implements ICategoryService {
	
	ICategoryDAO categoryDAO = new CategoryDAO();
  
	public void update(CategoryEntity categoryEntity) {
		categoryDAO.update(categoryEntity);
	}

	public void insert(CategoryEntity categoryEntity) {
		categoryDAO.insert(categoryEntity);
	}

	public CategoryEntity findById(int categoryId) {
		return categoryDAO.findById(categoryId);

	}

	public List<CategoryEntity> findAll() {
		return categoryDAO.findAll();
	}

	public void delete(int categoryId) {
		categoryDAO.delete(categoryId);
	}

	public int count() {
		return categoryDAO.count();
	}

}

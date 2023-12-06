package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;

import entities.CategoryEntity;
import utils.JpaUtil;

public class CategoryDAO implements ICategoryDAO{
	
	public void insert(CategoryEntity categoryEntity){
		EntityManager entityManager = JpaUtil.getEntityManager();
		EntityTransaction transaction = entityManager.getTransaction();
		try {
			transaction.begin();
			entityManager.persist(categoryEntity);
			transaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();
		}finally {
			entityManager.close();
		}
	}
	
	public void update(CategoryEntity categoryEntity){
		EntityManager entityManager = JpaUtil.getEntityManager();
		EntityTransaction transaction = entityManager.getTransaction();
		try {
			transaction.begin();
			entityManager.merge(categoryEntity);
			transaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();
		}finally {
			entityManager.close();
		}
	}

	public void delete(int categoryId){
		EntityManager entityManager = JpaUtil.getEntityManager();
		EntityTransaction transaction = entityManager.getTransaction();
		try {
			transaction.begin();
			CategoryEntity categoryEntity = entityManager.find(CategoryEntity.class, categoryId);
			if (categoryEntity!=null) {
				if(categoryEntity.getProducts().isEmpty()) {
					entityManager.remove(categoryEntity);
				}else {
					throw new Exception("Cannot delete category. It has associated products.");
				}
			} 
			else {
				throw new Exception("category not found");
			}
			transaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();
		}finally {
			entityManager.close();
		}
	}
	
	public CategoryEntity findById(int categoryId) {
		EntityManager entityManager = JpaUtil.getEntityManager();
		CategoryEntity categoryEntity = entityManager.find(CategoryEntity.class, categoryId);
		return categoryEntity;
	}
	
	public List<CategoryEntity> findAll(){
		EntityManager entityManager = JpaUtil.getEntityManager();
		TypedQuery<CategoryEntity> query = entityManager.createNamedQuery("CategoryEntity.findAll", CategoryEntity.class);
		return query.getResultList();
	}
	
	public int count() {
	    EntityManager entityManager = JpaUtil.getEntityManager();

	    try {
	        String jpql = "SELECT COUNT(c) FROM category c";
	        TypedQuery<Integer> query = entityManager.createQuery(jpql, Integer.class);
	        return query.getSingleResult();
	    } finally {
	        entityManager.close();
	    }
	}

}

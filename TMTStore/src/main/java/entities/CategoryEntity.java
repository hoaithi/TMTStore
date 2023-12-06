package entities;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;

@Entity(name="category")
@NamedQuery(
	    name = "CategoryEntity.findAll",
	    query = "SELECT c FROM category c"
	)
public class CategoryEntity implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name="name")
	private String name;
	
	@OneToMany(mappedBy = "category")
	private Set<ProductEntity> products;
	
	@OneToMany(mappedBy = "category")
	private Set<CategoryTagEntity> categoryTags;
	
	public CategoryEntity() {}

	public CategoryEntity(int id, String name, Set<ProductEntity> products, Set<CategoryTagEntity> categoryTags) {
		super();
		this.id = id;
		this.name = name;
		this.products = products;
		this.categoryTags = categoryTags;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<ProductEntity> getProducts() {
		return products;
	}

	public void setProducts(Set<ProductEntity> products) {
		this.products = products;
	}

	public Set<CategoryTagEntity> getCategoryTags() {
		return categoryTags;
	}

	public void setCategoryTags(Set<CategoryTagEntity> categoryTags) {
		this.categoryTags = categoryTags;
	}
	
	
	
	

}

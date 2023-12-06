package entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import keys.CategoryTagIds;

@Entity(name="category_tag")
@IdClass(CategoryTagIds.class)
public class CategoryTagEntity implements Serializable{
	
	@Id
	@Column(name="category_id")
	private int categoryId;
	@Id
	@Column(name="tag_id")
	private int tagId;
	
	@ManyToOne
	@JoinColumn(name = "category_id" , insertable = false, updatable = false)
	private CategoryEntity category;

	@ManyToOne
	@JoinColumn(name = "tag_id" , insertable = false, updatable = false)
	private TagEntity tag;
	
	public CategoryTagEntity() {}
	
	

	public int getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

	public int getTagId() {
		return tagId;
	}

	public void setTagId(int tagId) {
		this.tagId = tagId;
	}

	public CategoryEntity getCategory() {
		return category;
	}

	public void setCategory(CategoryEntity category) {
		this.category = category;
	}

	public TagEntity getTag() {
		return tag;
	}

	public void setTag(TagEntity tag) {
		this.tag = tag;
	}
	
	
	
	

}

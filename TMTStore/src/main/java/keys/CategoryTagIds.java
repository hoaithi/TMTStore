package keys;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

public class CategoryTagIds implements Serializable{
	
	@Column(name="category_id")
	private int categoryId;
	
	@Column(name="tag_id")
	private int tagId;
	
	public CategoryTagIds() {} 
	
	public CategoryTagIds(int categoryId, int tagId) {
		this.categoryId = categoryId;
		this.tagId = tagId;
	}

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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + categoryId;
		result = prime * result + tagId;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CategoryTagIds other = (CategoryTagIds) obj;
		if (categoryId != other.categoryId)
			return false;
		if (tagId != other.tagId)
			return false;
		return true;
	}
	 
	
	
	
	
}

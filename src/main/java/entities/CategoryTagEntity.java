package entities;

import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import keys.CategoryTagIds;


@Entity(name="category_tag")
public class CategoryTagEntity implements Serializable{
	
	@EmbeddedId
	private CategoryTagIds ids;
	
	@ManyToOne
	@JoinColumn(name = "category_id")
	private CategoryEntity category;

	@ManyToOne
	@JoinColumn(name = "tag_id")
	private TagEntity tag;
	
	
	public CategoryTagIds getIds() {
		return ids;
	}

	public void setIds(CategoryTagIds ids) {
		this.ids = ids;
	}
	
	

}

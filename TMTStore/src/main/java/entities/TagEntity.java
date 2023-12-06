package entities;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity(name="tag")
public class TagEntity implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name="name")
	private String name;

	@OneToMany(mappedBy = "tag")
	private Set<CategoryTagEntity> categoryTags;
	
	@OneToMany(mappedBy = "tag")
	private Set<TagBlogEntity> tagBlogs ;
	
	public TagEntity() {}

	public TagEntity(int id, String name, Set<CategoryTagEntity> categoryTags, Set<TagBlogEntity> tagBlogs) {
		super();
		this.id = id;
		this.name = name;
		this.categoryTags = categoryTags;
		this.tagBlogs = tagBlogs;
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

	public Set<CategoryTagEntity> getCategoryTags() {
		return categoryTags;
	}

	public void setCategoryTags(Set<CategoryTagEntity> categoryTags) {
		this.categoryTags = categoryTags;
	}

	public Set<TagBlogEntity> getTagBlogs() {
		return tagBlogs;
	}

	public void setTagBlogs(Set<TagBlogEntity> tagBlogs) {
		this.tagBlogs = tagBlogs;
	}
	
	
}

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
}

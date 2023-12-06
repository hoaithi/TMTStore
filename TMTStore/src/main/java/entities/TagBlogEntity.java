package entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.swing.text.html.HTML.Tag;

import keys.TagBlogIds;

@Entity(name="tag_blog")
@IdClass(TagBlogIds.class)
public class TagBlogEntity implements Serializable{
	
	@Id
	@Column(name="tag_id")
	private int tagId;
	
	@Id
	@Column(name="blog_id")
	private int blogId;
	
	@ManyToOne
	@JoinColumn(name = "tag_id" , insertable = false, updatable = false)
	private TagEntity tag;
	
	@ManyToOne
	@JoinColumn(name = "blog_id" , insertable = false, updatable = false)
	private BlogEntity blog;
	
	public TagBlogEntity() {}

	

	public TagEntity getTag() {
		return tag;
	}

	public void setTag(TagEntity tag) {
		this.tag = tag;
	}

	public BlogEntity getBlog() {
		return blog;
	}

	public void setBlog(BlogEntity blog) {
		this.blog = blog;
	}

	
	
	

}

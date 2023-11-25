package keys;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
@Embeddable
public class TagBlogIds implements Serializable{
	
	@Column(name="tag_id")
	private int tagId;
	
	@Column(name="blog_id")
	private int blogId;

	public TagBlogIds() {} 
	
	public TagBlogIds(int tagId, int blogId) {
		super();
		this.tagId = tagId;
		this.blogId = blogId;
	}

	public int getTagId() {
		return tagId;
	}

	public void setTagId(int tagId) {
		this.tagId = tagId;
	}

	public int getBlogId() {
		return blogId;
	}

	public void setBlogId(int blogId) {
		this.blogId = blogId;
	}
	
	

}

package keys;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

public class TagBlogIds implements Serializable{
	
	private int tagId;
	
	
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + blogId;
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
		TagBlogIds other = (TagBlogIds) obj;
		if (blogId != other.blogId)
			return false;
		if (tagId != other.tagId)
			return false;
		return true;
	}
	
	

}

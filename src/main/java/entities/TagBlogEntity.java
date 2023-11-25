package entities;

import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.swing.text.html.HTML.Tag;

import keys.TagBlogIds;

@Entity(name="tag_blog")
public class TagBlogEntity implements Serializable{
	
	@EmbeddedId
	private TagBlogIds ids;
	
	@ManyToOne
	@JoinColumn(name = "tag_id")
	private TagEntity tag;
	
	@ManyToOne
	@JoinColumn(name = "blog_id")
	private BlogEntity blog;

	public TagBlogIds getIds() {
		return ids;
	}

	public void setIds(TagBlogIds ids) {
		this.ids = ids;
	}
	
	

}

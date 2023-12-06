package entities;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity(name="blog")
public class BlogEntity implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name="image")
	private String image;
	
	@Column(name="title")
	private String title;
	
	@Column(name="description")
	private String description;
	
	@Column(name="content")
	private String content;
	
	@Column(name="create_date")
	private Date createDate;
	
	@OneToMany(mappedBy = "blog")
	private Set<TagBlogEntity> tagBlogs;
	
	@ManyToOne
	@JoinColumn(name = "user_id")
	private UserEntity user;

	@OneToMany(mappedBy = "blog")
	private Set<CommentEntity> comments;
	
	public BlogEntity() {}

	public BlogEntity(int id, String image, String title, String description, String content, Date createDate,
			Set<TagBlogEntity> tagBlogs, UserEntity user, Set<CommentEntity> comments) {
		this.id = id;
		this.image = image;
		this.title = title;
		this.description = description;
		this.content = content;
		this.createDate = createDate;
		this.tagBlogs = tagBlogs;
		this.user = user;
		this.comments = comments;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Set<TagBlogEntity> getTagBlogs() {
		return tagBlogs;
	}

	public void setTagBlogs(Set<TagBlogEntity> tagBlogs) {
		this.tagBlogs = tagBlogs;
	}

	public UserEntity getUser() {
		return user;
	}

	public void setUser(UserEntity user) {
		this.user = user;
	}

	public Set<CommentEntity> getComments() {
		return comments;
	}

	public void setComments(Set<CommentEntity> comments) {
		this.comments = comments;
	}
	
	
	
	



}

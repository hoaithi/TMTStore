package entities;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity(name="user")
public class UserEntity implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name="username")
	private String username;
	
	@Column(name="password")
	private String password;
	
	@Column(name="email")
	private String email;
	
	@OneToMany(mappedBy = "user")
	private Set<OrderEntity> orders;
	
	@OneToMany(mappedBy = "user")
	private Set<BlogEntity> blogs;
	
	public UserEntity() {}

	public UserEntity(int id, String username, String password, String email, Set<OrderEntity> orders,
			Set<BlogEntity> blogs) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.email = email;
		this.orders = orders;
		this.blogs = blogs;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Set<OrderEntity> getOrders() {
		return orders;
	}

	public void setOrders(Set<OrderEntity> orders) {
		this.orders = orders;
	}

	public Set<BlogEntity> getBlogs() {
		return blogs;
	}

	public void setBlogs(Set<BlogEntity> blogs) {
		this.blogs = blogs;
	}

	
}

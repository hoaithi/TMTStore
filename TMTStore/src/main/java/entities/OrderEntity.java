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

@Entity(name="z_order")
public class OrderEntity implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name="date")
	private Date date;
	
	@OneToMany(mappedBy = "order")
	private Set<OrderDetailEntity> orderDetails;
	
	@ManyToOne
	@JoinColumn(name = "country_id")
	private CountryEntity country;
	
	@ManyToOne
	@JoinColumn(name = "user_id")
	private UserEntity user;
	
	public OrderEntity() {}

	public OrderEntity(int id, Date date, Set<OrderDetailEntity> orderDetails, CountryEntity country, UserEntity user) {
		super();
		this.id = id;
		this.date = date;
		this.orderDetails = orderDetails;
		this.country = country;
		this.user = user;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Set<OrderDetailEntity> getOrderDetails() {
		return orderDetails;
	}

	public void setOrderDetails(Set<OrderDetailEntity> orderDetails) {
		this.orderDetails = orderDetails;
	}

	public CountryEntity getCountry() {
		return country;
	}

	public void setCountry(CountryEntity country) {
		this.country = country;
	}

	public UserEntity getUser() {
		return user;
	}

	public void setUser(UserEntity user) {
		this.user = user;
	}

	


}

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



}

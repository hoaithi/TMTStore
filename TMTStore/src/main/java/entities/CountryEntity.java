package entities;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity(name="country")
public class CountryEntity implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="price_ship")
	private double priceShip;
	
	@OneToMany(mappedBy = "country")
	private Set<OrderEntity> orders;
	
	public CountryEntity() {}

	public CountryEntity(int id, String name, double priceShip, Set<OrderEntity> orders) {
		super();
		this.id = id;
		this.name = name;
		this.priceShip = priceShip;
		this.orders = orders;
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

	public double getPriceShip() {
		return priceShip;
	}

	public void setPriceShip(double priceShip) {
		this.priceShip = priceShip;
	}

	public Set<OrderEntity> getOrders() {
		return orders;
	}

	public void setOrders(Set<OrderEntity> orders) {
		this.orders = orders;
	}
	
	


}

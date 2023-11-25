package entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import keys.OrderDetailIds;



@Entity(name="order_detail")
public class OrderDetailEntity implements Serializable{
	
	@EmbeddedId
	private OrderDetailIds ids;
	
	@Column(name="quantity")
	private int quantity;
	
	@Column(name="price")
	private double price;
	
	@ManyToOne
	@JoinColumn(name = "product_id")
	private ProductEntity product;
	
	@ManyToOne
	@JoinColumn(name = "order_id")
	private OrderEntity order;

	public OrderDetailEntity(int quantity, double price, OrderDetailIds ids) {
		super();
		this.quantity = quantity;
		this.price = price;
		this.ids = ids;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public OrderDetailIds getIds() {
		return ids;
	}

	public void setIds(OrderDetailIds ids) {
		this.ids = ids;
	}
	 
	
	
			
}

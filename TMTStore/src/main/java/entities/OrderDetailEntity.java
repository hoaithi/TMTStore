package entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import keys.OrderDetailIds;


@Entity(name="order_detail")
@IdClass(OrderDetailIds.class)
public class OrderDetailEntity implements Serializable{
	@Id
	@Column(name="product_id")
	private int productId;
	
	@Id
	@Column(name="order_id")
	private int orderId;
	
	@Column(name="quantity")
	private int quantity;
	
	@Column(name="price")
	private double price;
	
	@ManyToOne
	@JoinColumn(name = "product_id" , insertable = false, updatable = false)
	private ProductEntity product;
	
	@ManyToOne
	@JoinColumn(name = "order_id" , insertable = false, updatable = false)
	private OrderEntity order;
	
	public OrderDetailEntity(){}

	

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



	public int getProductId() {
		return productId;
	}



	public void setProductId(int productId) {
		this.productId = productId;
	}



	public int getOrderId() {
		return orderId;
	}



	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}



	public ProductEntity getProduct() {
		return product;
	}



	public void setProduct(ProductEntity product) {
		this.product = product;
	}



	public OrderEntity getOrder() {
		return order;
	}



	public void setOrder(OrderEntity order) {
		this.order = order;
	}

	
	
	
			
}

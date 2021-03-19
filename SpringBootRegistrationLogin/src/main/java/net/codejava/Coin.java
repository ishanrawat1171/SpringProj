package net.codejava;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Coin  implements Serializable
{
	private static final long serialVersionUID = 1L;
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private int coinid;
@Column(name = "coin_name", nullable = false, length = 20)
private String coinname;
@Column(name = "period", nullable = false, length = 20)
private String period;
@Column(columnDefinition = "int" ,name="weight")
private int weight;
@Column(columnDefinition = "int" ,name="price")
private int price;
@Column(name = "description", nullable = false, length = 20)
private String description;




public int getCoinid() {
	return coinid;
}
public void setCoinid(int coinid) {
	this.coinid = coinid;
}
public String getCoinname() {
	return coinname;
}
public void setCoinname(String coinname) {
	this.coinname = coinname;
}
public String getPeriod() {
	return period;
}
public void setPeriod(String period) {
	this.period = period;
}
public int getWeight() {
	return weight;
}
public void setWeight(int weight) {
	this.weight = weight;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
public static long getSerialversionuid() {
	return serialVersionUID;
}
@Override
public String toString() {
	return "Coin [coinid=" + coinid + ", coinname=" + coinname + ", period=" + period + ", weight=" + weight
			+ ", price=" + price + ", description=" + description + "]";
}
public Coin() {
	super();
	// TODO Auto-generated constructor stub
}
public Coin( String coinname, String period, int weight, int price, String description) {
	super();
	
	this.coinname = coinname;
	this.period = period;
	this.weight = weight;
	this.price = price;
	this.description = description;
}

}